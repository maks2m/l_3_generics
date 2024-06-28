package com.exemple.controller;

import com.exemple.entity.CompanyShare;
import com.exemple.model.ResponseModel;

import java.util.List;
import java.util.UUID;

public interface CompanyShareController {

    ResponseModel<List<CompanyShare>> findAll();

    ResponseModel<CompanyShare> findById(UUID id);

    ResponseModel<CompanyShare> create(CompanyShare companyShare);

    ResponseModel<CompanyShare> update(UUID id, CompanyShare companyShare);

    ResponseModel<Void> delete(UUID id);
}
