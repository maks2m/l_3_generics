package com.exemple.repository;

import com.exemple.entity.CompanyShare;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.logging.Logger;

public class CompanyShareRepositoryImpl implements CompanyShareRepository {

    private static final CompanyShareRepositoryImpl INSTANCE = new CompanyShareRepositoryImpl();
    private CompanyShareRepositoryImpl() {}
    public static CompanyShareRepositoryImpl getInstance() {
        return INSTANCE;
    }

    private static List<CompanyShare> data = new ArrayList<>();

    private static final Logger log = Logger.getLogger(CompanyShareRepositoryImpl.class.getName());

    @Override
    public List<CompanyShare> findAll() {
        log.info("Start class CompanyShareRepositoryImpl method findAll()");
        return data;
    }

    @Override
    public Optional<CompanyShare> findById(UUID id) {
        log.info("Start class CompanyShareRepositoryImpl method findById()");
        Optional<CompanyShare> optionalCompanyShare = Optional.empty();
        for (CompanyShare share : data) {
            if(share.getId().equals(id)) {
                optionalCompanyShare = Optional.of(share);
            }
        }
        return optionalCompanyShare;
    }

    @Override
    public CompanyShare create(CompanyShare companyShare) {
        log.info("Start class CompanyShareRepositoryImpl method create()");
        companyShare.setId(UUID.randomUUID());
        data.add(companyShare);
        return companyShare;
    }

    @Override
    public CompanyShare update(UUID id, CompanyShare companyShare) {
        log.info("Start class CompanyShareRepositoryImpl method update()");
        CompanyShare oldCompanyShare = findById(id).orElseThrow();
        oldCompanyShare.setCompanyName(companyShare.getCompanyName());
        oldCompanyShare.setCompanyCode(companyShare.getCompanyCode());
        oldCompanyShare.setCost(companyShare.getCost());
        oldCompanyShare.setDate(companyShare.getDate());
        return oldCompanyShare;
    }

    @Override
    public void delete(UUID id) {
        log.info("Start class CompanyShareRepositoryImpl method delete()");
        CompanyShare oldCompanyShare = findById(id).orElseThrow();
        data.remove(oldCompanyShare);
    }
}
