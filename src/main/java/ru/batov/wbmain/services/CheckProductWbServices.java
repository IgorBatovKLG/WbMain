package ru.batov.wbmain.services;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;
import ru.batov.wbmain.controllers.GlobalVariables;
import ru.batov.wbmain.models.catalog.CatalogEntity;
import ru.batov.wbmain.models.catalog.SubjectIdEntity;
import ru.batov.wbmain.models.products.DiscountEntity;
import ru.batov.wbmain.models.products.PriceProductEntity;
import ru.batov.wbmain.models.products.ProductEntity;
import ru.batov.wbmain.models.wbJsons.JsonSkillet;
import ru.batov.wbmain.models.wbJsons.ProductSkillet;
import ru.batov.wbmain.repositories.CatalogRepositories;
import ru.batov.wbmain.repositories.JDBSProductRepositories;
import ru.batov.wbmain.repositories.ProductRepositories;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

import static java.lang.Thread.sleep;

@Service
public class CheckProductWbServices {
    static ArrayList<String> ids = new ArrayList<>();

    private final ProductRepositories productRepositories;

    private final CatalogRepositories catalogRepositories;

    private final JDBSProductRepositories jdbSProductRepositories;
    public CheckProductWbServices(ProductRepositories productRepositories, CatalogRepositories catalogRepositories, JDBSProductRepositories jdbSProductRepositories) {
        this.productRepositories = productRepositories;
        this.catalogRepositories = catalogRepositories;
        this.jdbSProductRepositories = jdbSProductRepositories;
    }


    private List<ProductSkillet> getProducts(String catalog, int subject, int page) {
        HttpRequest build = null;
        HttpResponse<String> response = null;
        Gson gson = new Gson();
        List<ProductSkillet> products = new ArrayList<>();
        try {
            build = HttpRequest.newBuilder()
                    .uri(new URI("https://catalog.wb.ru/catalog/" + catalog + "/catalog?appType=1&couponsGeo=2,12,3,18,21&curr=rub&dest=-1029256,-81995,-1235082,123585487&emp=0&lang=ru&locale=ru&page=" + page + "&pricemarginCoeff=1.0&reg=0&regions=68,64,83,4,38,80,33,70,82,86,30,69,1,48,22,66,31,40&sort=priceup&spp=0&subject=" + subject))
                    .GET()
                    .build();
            HttpClient client = HttpClient.newBuilder()
                    .version(HttpClient.Version.HTTP_1_1)
                    .followRedirects(HttpClient.Redirect.NORMAL)
                    .connectTimeout(Duration.ofSeconds(20))
                    .build();
            response = client.send(build, HttpResponse.BodyHandlers.ofString());
            JsonSkillet jsonSkillet = gson.fromJson(response.body(), JsonSkillet.class);
            products = jsonSkillet.getData().getProducts();
        } catch (InterruptedException | URISyntaxException | IOException | JsonSyntaxException e) {

            System.out.println(e.getMessage() + " " + catalog + " " + subject + " " + page);
            GlobalVariables.ExceptionCount++;
        } catch (NullPointerException e) {
            if (page>200){
                GlobalVariables.ExceptionCount++;
                products = new ArrayList<>();
                ProductSkillet productSkillet = null;
                products.add(productSkillet);
                return products;
            }
            System.out.println("NullPointerException " + catalog + " " + subject + " " + page);
            GlobalVariables.ExceptionCount++;
        }
        return products;
    }


    private boolean checkProduct(List<ProductSkillet> products) {
        boolean lessThan1000 = true;

        for (ProductSkillet product : products) {
            if(!(product ==null)) {
                if (!ids.contains(product.getId())) {

                    int byProductId = 0;
                    try {
                        byProductId = jdbSProductRepositories.getCountProductEntity(Integer.parseInt(product.getId()));
                    } catch (EmptyResultDataAccessException e) {
                    }
                    if (Integer.parseInt(product.getSalePriceU()) < 1000_00) {
                        if (byProductId == 0) {

                            DiscountEntity build = DiscountEntity
                                    .builder()
                                    .id(0)
                                    .Iteration1(0)
                                    .Iteration6(0)
                                    .Iteration14(0)
                                    .build();
                            productRepositories.saveDiscountEntity(build);
                            if (product.getName().length()> 254) {
                                product.setName(product.getName().substring(0, 254));
                            }
                            ProductEntity entity = ProductEntity.builder()
                                    .id(0)
                                    .productId(Integer.parseInt(product.getId()))
                                    .name(product.getName())
                                    .subjectId(Integer.parseInt(product.getSubjectId()))
                                    .subjectIdM3(Integer.parseInt(product.getId().substring(0, product.getId().length() - 3)))
                                    .subjectIdM5(Integer.parseInt(product.getId().substring(0, product.getId().length() - 5)))
                                    .brandId(Integer.parseInt(product.getBrandId()))
                                    .pics(Integer.parseInt(product.getPics()))
                                    .discount(build)
                                    .iteration(0)
                                    .build();
                            productRepositories.saveProductEntity(entity);
                            productRepositories.savePriceProductEntity(PriceProductEntity.builder()
                                    .id(0)
                                    .product_id(entity.getId())
                                    .price(Integer.parseInt(product.getSalePriceU()))
                                    .priceId(entity.getIteration())
                                    .date(LocalDateTime.now())
                                    .build());
                            GlobalVariables.NewProductCount++;
                        } else {
                            productRepositories.savePriceProductEntity(PriceProductEntity.builder()
                                    .id(0)
                                    .product_id(byProductId)
                                    .price(Integer.parseInt(product.getSalePriceU()))
                                    .priceId(0)
                                    .date(LocalDateTime.now())
                                    .build());
                            GlobalVariables.UpdateProductCount++;
                        }
                    } else {
                        lessThan1000 = false;
                        break;
                    }
                    ids.add(product.getId());
                } else {
                    GlobalVariables.DuplicateProductCount++;
                }
            } else {
                GlobalVariables.NullProductCount++;
                lessThan1000 = false;
                break;
            }
        }
        return lessThan1000;
    }

    public void operator() {
        //GlobalVariables.ThreadList = new ArrayList<>();

        GlobalVariables.HashMap = new HashMap<>();

        System.out.println("Start check products");
        System.out.println("Start check products");
        System.out.println("Start check products");
        List<CatalogEntity> catalogEntityBySubCatalogId = catalogRepositories.findCatalogEntityBySubCatalogId(1);
        for (CatalogEntity catalogEntity : catalogEntityBySubCatalogId) {
            Runnable runnable = () -> {


                List<SubjectIdEntity> subjectIdEntityByCatalogId = catalogRepositories.findSubjectIdEntityByCatalogId(catalogEntity.getId());
                GlobalVariables.HashMap.put(Thread.currentThread().getName(), subjectIdEntityByCatalogId.size());
                for (SubjectIdEntity idEntity : subjectIdEntityByCatalogId) {
                    GlobalVariables.HashMap.put(Thread.currentThread().getName(), GlobalVariables.HashMap.get(Thread.currentThread().getName()) - 1);
                    try {


                        int page = 1;
                        boolean lessThan1000 = true;
                        while (lessThan1000) {
                            List<ProductSkillet> products = getProducts(catalogEntity.getName(), idEntity.getSubject(), page);
                            lessThan1000 = checkProduct(products);
                            page++;
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }

            };
            Thread thread = new Thread(runnable);
            thread.start();
            //GlobalVariables.ThreadList.add(thread);
            GlobalVariables.ThreadCount=12;
        }
    }

    public void deleteDuplicate() {
        List<PriceProductEntity> priceProductEntityByDateStartAndDateFinish = productRepositories.getPriceProductEntityByDateStartAndDateFinish(GlobalVariables.start.minusMinutes(30), LocalDateTime.now());

        ArrayList<Long> ids = new ArrayList<>();
        System.out.println(priceProductEntityByDateStartAndDateFinish.size());
        int i = 0;
        int count = 0;

        for (PriceProductEntity priceProductEntity : priceProductEntityByDateStartAndDateFinish) {
            i++;
            if(i%10000 == 0) {
                System.out.println(i);
            }

            if (ids.contains(priceProductEntity.getProduct_id())) {
                List<PriceProductEntity> productEntityList = productRepositories.getPriceProductEntityByDateStartAndDateFinishAndProductId(GlobalVariables.start.minusMinutes(10), LocalDateTime.now(), priceProductEntity.getProduct_id());
                PriceProductEntity priceProductEntity1 = productEntityList.stream().max(Comparator.comparing(PriceProductEntity::getPriceId)).get();
                productRepositories.deletePriceProductEntity(priceProductEntity1);
                count++;
            } else {
                ids.add(priceProductEntity.getProduct_id());
            }
            ids.add(priceProductEntity.getProduct_id());
        }
        System.out.println("Удалили " + count + " дубликатов");
    }

    public void manegeDiscount() {
        Runnable runnable = () -> {

            while (true) {
                for (Thread thread : GlobalVariables.ThreadList) {
                    if (!thread.isAlive()) {
                        GlobalVariables.ThreadList.remove(thread);
                    }
                }
                try {
                    sleep(1000*60);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };
    }


}