package com.exemple.service;

import com.exemple.dto.CompanyShareFullDto;

import java.util.List;
import java.util.UUID;

public interface CompanyShareService {

    List<CompanyShareFullDto> findAll();

    CompanyShareFullDto findById(UUID id);

    CompanyShareFullDto create(CompanyShareFullDto companyShare);

    CompanyShareFullDto update(UUID id, CompanyShareFullDto companyShare);

    void delete(UUID id);
}
