package ru.batov.wbmain.repositories;

import ru.batov.wbmain.models.products.DiscountEntity;
import ru.batov.wbmain.models.products.PriceProductEntity;
import ru.batov.wbmain.models.products.ProductEntity;

import java.time.LocalDateTime;
import java.util.List;

public interface ProductRepositories {
    void saveProductEntity(ProductEntity productEntity);


    long getCountProductEntity();

    void savePriceProductEntity(PriceProductEntity priceProductEntity);


    List<PriceProductEntity> getPriceProductEntityByDateStartAndDateFinish(LocalDateTime dateStart, LocalDateTime dateFinish);

    void deletePriceProductEntity(PriceProductEntity priceProductEntity);

    void saveDiscountEntity(DiscountEntity discountEntity);

    ProductEntity findByProductId(int productId);

    void updateProductEntity(ProductEntity productEntity);

}
