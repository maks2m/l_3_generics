package com.exemple.controller;

import com.exemple.entity.CompanyShare;
import com.exemple.model.ResponseModel;
import com.exemple.service.CompanyShareService;
import com.exemple.service.CompanyShareServiceImpl;

import java.util.List;
import java.util.UUID;

public class CompanyShareControllerImpl implements CompanyShareController {

    private CompanyShareService service = CompanyShareServiceImpl.builder().build();

    @Override
    public ResponseModel<List<CompanyShare>> findAll() {
        List<CompanyShare> companyShares = service.findAll();
        return null;
    }

    @Override
    public ResponseModel<CompanyShare> findById(UUID id) {
        CompanyShare companyShare = service.findById(id);
        return null;
    }

    @Override
    public ResponseModel<CompanyShare> create(CompanyShare companyShare) {
        CompanyShare companyShare1 = service.create(companyShare);
        return null;
    }

    @Override
    public ResponseModel<CompanyShare> update(UUID id, CompanyShare companyShare) {
        CompanyShare updateShare = service.update(id, companyShare);
        return null;
    }

    @Override
    public ResponseModel<Void> delete(UUID id) {
        service.delete(id);
        return null;
    }
}
