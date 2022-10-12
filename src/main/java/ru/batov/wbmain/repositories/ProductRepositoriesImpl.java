package ru.batov.wbmain.repositories;

import org.springframework.stereotype.Repository;
import ru.batov.wbmain.models.products.DiscountEntity;
import ru.batov.wbmain.models.products.PriceProductEntity;
import ru.batov.wbmain.models.products.ProductEntity;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.time.LocalDateTime;
import java.util.List;

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
    public long getCountProductEntity() {
        TypedQuery<Long> query = em.createQuery("select count(p) from ProductEntity p", Long.class);
        return query.getSingleResult();
    }
    @Override
    public void savePriceProductEntity(PriceProductEntity priceProductEntity) {
        em.persist(priceProductEntity);
    }

    @Override
    public List<PriceProductEntity> getPriceProductEntityByDateStartAndDateFinish(LocalDateTime dateStart, LocalDateTime dateFinish) {
        TypedQuery<PriceProductEntity> query = em.createQuery("select p from PriceProductEntity p where p.date >= :dateStart and p.date <= :dateFinish", PriceProductEntity.class);
        query.setParameter("dateStart", dateStart);
        query.setParameter("dateFinish", dateFinish);
        return query.getResultList();
    }
    @Override
    public List<PriceProductEntity> getPriceProductEntityByDateStartAndDateFinishAndProductId(LocalDateTime dateStart, LocalDateTime dateFinish, long productId) {
        TypedQuery<PriceProductEntity> query = em.createQuery("select p from PriceProductEntity p where p.date >= :dateStart and p.date <= :dateFinish and p.product_id = :productId", PriceProductEntity.class);
        query.setParameter("dateStart", dateStart);
        query.setParameter("dateFinish", dateFinish);
        query.setParameter("productId", productId);
        return query.getResultList();
    }
    @Override
    public void deletePriceProductEntity(PriceProductEntity priceProductEntity) {
        em.remove(priceProductEntity);
    }

    @Override
    public void saveDiscountEntity(DiscountEntity discountEntity) {
        em.persist(discountEntity);
    }


    @Override
    public ProductEntity ProductEntity(int productId) {
        TypedQuery<ProductEntity> query = em.createQuery("select p from ProductEntity p " +
                    "where p.productId = :productId", ProductEntity.class);
            query.setParameter("productId", productId);
        return query.getSingleResult();
    }
    @Override
    public long countProductEntityByProductId(int productId) {
        TypedQuery<Long> query = em.createQuery("select count(p) from ProductEntity p " +
                    "where p.productId = :productId", Long.class);
            query.setParameter("productId", productId);
        return query.getSingleResult();
    }


    @Override
    public void updateProductEntity(ProductEntity productEntity) {
        em.merge(productEntity);
    }
}
