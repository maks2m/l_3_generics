package com.exemple.repository;

import com.exemple.entity.CompanyShare;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface CompanyShareRepository {

    List<CompanyShare> findAll();

    Optional<CompanyShare> findById(UUID id);

    CompanyShare create(CompanyShare companyShare);

    CompanyShare update(UUID id, CompanyShare companyShare);

    void delete(UUID id);
}
