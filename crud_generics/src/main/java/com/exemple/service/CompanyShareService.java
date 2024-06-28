package com.exemple.service;

import com.exemple.entity.CompanyShare;

import java.util.List;
import java.util.UUID;

public interface CompanyShareService {

    List<CompanyShare> findAll();

    CompanyShare findById(UUID id);

    CompanyShare create(CompanyShare companyShare);

    CompanyShare update(UUID id, CompanyShare companyShare);

    void delete(UUID id);
}
