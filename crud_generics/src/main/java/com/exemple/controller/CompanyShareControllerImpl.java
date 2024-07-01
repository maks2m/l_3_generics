package com.exemple.controller;

import com.exemple.entity.CompanyShare;
import com.exemple.model.ResponseModel;
import com.exemple.service.CrudService;
import com.exemple.service.CompanyShareServiceImpl;

import java.util.List;
import java.util.UUID;

public class CompanyShareControllerImpl implements CompanyShareController {

    private CompanyShareServiceImpl service = new  CompanyShareServiceImpl();

    @Override
    public ResponseModel<List<CompanyShare>> findAll() {
        List<CompanyShare> companyShares = service.findAll();
        return ResponseModel.of(companyShares);
    }

    @Override
    public ResponseModel<CompanyShare> findById(UUID id) {
        CompanyShare companyShare = service.findById(id);
        return ResponseModel.of(companyShare);
    }

    @Override
    public ResponseModel<CompanyShare> create(CompanyShare companyShare) {
        CompanyShare companyShare1 = service.create(companyShare);
        return ResponseModel.of(companyShare1);
    }

    @Override
    public ResponseModel<CompanyShare> update(UUID id, CompanyShare companyShare) {
        CompanyShare updateShare = service.update(id, companyShare);
        return ResponseModel.of(updateShare);
    }

    @Override
    public ResponseModel<Void> delete(UUID id) {
        service.delete(id);
        return ResponseModel.of(null);
    }
}
