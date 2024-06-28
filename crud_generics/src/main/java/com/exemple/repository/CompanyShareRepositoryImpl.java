package com.exemple.repository;

import com.exemple.entity.CompanyShare;
import lombok.Builder;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Builder
public class CompanyShareRepositoryImpl implements CompanyShareRepository {

    private static List<CompanyShare> companyShareList = new ArrayList<>();


    @Override
    public List<CompanyShare> findAll() {
        return companyShareList;
    }

    @Override
    public Optional<CompanyShare> findById(UUID id) {
        for (CompanyShare companyShare : companyShareList) {
            if (companyShare.getId().equals(id)) {
                return Optional.of(companyShare);
            }
        }
        return Optional.empty();
    }

    @Override
    public CompanyShare create(CompanyShare companyShare) {
        companyShare.setId(UUID.randomUUID());
        companyShareList.add(companyShare);
        return companyShare;
    }

    @Override
    public CompanyShare update(UUID id, CompanyShare companyShare) {
        CompanyShare oldCompanyShare = findById(id).orElseThrow();
        oldCompanyShare.setCompanyName(companyShare.getCompanyName());
        oldCompanyShare.setTicker(companyShare.getTicker());
        oldCompanyShare.setCost(companyShare.getCost());
        oldCompanyShare.setDate(companyShare.getDate());
        return oldCompanyShare;
    }

    @Override
    public void delete(UUID id) {
        CompanyShare companyShare = findById(id).orElseThrow();
        companyShareList.remove(companyShare);
    }
}
