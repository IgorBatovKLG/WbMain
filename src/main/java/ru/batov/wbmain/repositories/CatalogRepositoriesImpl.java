package ru.batov.wbmain.repositories;

import org.springframework.stereotype.Repository;
import ru.batov.wbmain.models.catalog.CatalogEntity;
import ru.batov.wbmain.models.catalog.SubjectIdEntity;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class CatalogRepositoriesImpl implements CatalogRepositories {

    @PersistenceContext
    private EntityManager em;

    @Override
    public List<CatalogEntity> findAllCatalogEntity() {
        TypedQuery<CatalogEntity> query = em.createQuery("select c from CatalogEntity c", CatalogEntity.class);
        return query.getResultList();
    }

    @Override
    public List<CatalogEntity> findCatalogEntityBySubCatalogId(int subCatalogId) {
        TypedQuery<CatalogEntity> query = em.createQuery("select c from CatalogEntity c " +
                "where c.subCatalogId = :subCatalogId", CatalogEntity.class);
        query.setParameter("subCatalogId", subCatalogId);
        return query.getResultList();
    }

    @Override
    public void saveCatalogEntity(CatalogEntity catalogEntity) {
        em.persist(catalogEntity);
    }

    @Override
    public void saveSubjectIdEntity(SubjectIdEntity subjectIdEntity) {
        em.persist(subjectIdEntity);
    }

    @Override
    public List<SubjectIdEntity> findSubjectIdEntityByCatalogId(long catalogId) {
        TypedQuery<SubjectIdEntity> query = em.createQuery("select s from SubjectIdEntity s " +
                "where s.catalogId = :catalogId", SubjectIdEntity.class);
        query.setParameter("catalogId", catalogId);
        return query.getResultList();
    }
}
