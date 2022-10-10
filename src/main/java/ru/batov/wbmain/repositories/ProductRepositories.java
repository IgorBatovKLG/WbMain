package ru.batov.wbmain.repositories;

import ru.batov.wbmain.models.products.DiscountEntity;
import ru.batov.wbmain.models.products.PriceProductEntity;
import ru.batov.wbmain.models.products.ProductEntity;

public interface ProductRepositories {
    void saveProductEntity(ProductEntity productEntity);



    void savePriceProductEntity(PriceProductEntity priceProductEntity);

    void saveDiscountEntity(DiscountEntity discountEntity);

    ProductEntity findByProductId(int productId);

    void updateProductEntity(ProductEntity productEntity);
}
