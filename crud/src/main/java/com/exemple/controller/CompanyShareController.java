package com.exemple.controller;

import com.exemple.dto.CompanyShareFullDto;
import com.exemple.model.ResponseModel;

import java.util.List;
import java.util.UUID;

public interface CompanyShareController {

    ResponseModel<List<CompanyShareFullDto>> findAll();

    ResponseModel<CompanyShareFullDto> findById(UUID id);

    ResponseModel<CompanyShareFullDto> create(CompanyShareFullDto companyShare);

    ResponseModel<CompanyShareFullDto> update(UUID id, CompanyShareFullDto companyShare);

    ResponseModel<Void> delete(UUID id);
}
