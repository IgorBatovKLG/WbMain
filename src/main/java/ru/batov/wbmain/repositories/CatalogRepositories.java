package ru.batov.wbmain.repositories;

import ru.batov.wbmain.models.catalog.CatalogEntity;
import ru.batov.wbmain.models.catalog.SubjectIdEntity;

import java.util.List;

public interface CatalogRepositories {
    List<CatalogEntity> findAllCatalogEntity();

    List<CatalogEntity> findCatalogEntityBySubCatalogId(int subCatalogId);

    void saveCatalogEntity(CatalogEntity catalogEntity);

    void saveSubjectIdEntity(SubjectIdEntity subjectIdEntity);

    List<SubjectIdEntity> findSubjectIdEntityByCatalogId(long catalogId);
}
