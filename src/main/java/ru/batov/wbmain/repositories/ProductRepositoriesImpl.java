package ru.batov.wbmain.repositories;

import org.postgresql.util.PSQLException;
import org.springframework.stereotype.Repository;
import ru.batov.wbmain.models.products.DiscountEntity;
import ru.batov.wbmain.models.products.PriceProductEntity;
import ru.batov.wbmain.models.products.ProductEntity;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

@Repository
@Transactional
//Todo Перенести транзакцию в сервис
public class ProductRepositoriesImpl implements ProductRepositories {

    @PersistenceContext
    private EntityManager em;

    @Override
    public void saveProductEntity(ProductEntity productEntity) {
        em.persist(productEntity);
    }
    @Override
    public void savePriceProductEntity(PriceProductEntity priceProductEntity) {
        em.persist(priceProductEntity);
    }

    @Override
    public void saveDiscountEntity(DiscountEntity discountEntity) {
        em.persist(discountEntity);
    }
    @Override
    public ProductEntity findByProductId(int productId) {
        TypedQuery<ProductEntity> query = em.createQuery("select p from ProductEntity p " +
                    "where p.productId = :productId", ProductEntity.class);
            query.setParameter("productId", productId);
        return query.getSingleResult();
    }
    @Override
    public void updateProductEntity(ProductEntity productEntity) {
        em.merge(productEntity);
    }
}
