package com.exemple.service;

import com.exemple.entity.CompanyShare;
import com.exemple.repository.CompanyShareRepository;
import com.exemple.repository.CompanyShareRepositoryImpl;
import lombok.Builder;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Builder
public class CompanyShareServiceImpl implements CompanyShareService {

    private final CompanyShareRepository repository = CompanyShareRepositoryImpl.builder().build();

    @Override
    public List<CompanyShare> findAll() {
        return repository.findAll();
    }

    @Override
    public CompanyShare findById(UUID id) {
        return repository.findById(id).orElseThrow();
    }

    @Override
    public CompanyShare create(CompanyShare companyShare) {
        return repository.create(companyShare);
    }

    @Override
    public CompanyShare update(UUID id, CompanyShare companyShare) {
        return repository.update(id, companyShare);
    }

    @Override
    public void delete(UUID id) {
        repository.delete(id);
    }
}
