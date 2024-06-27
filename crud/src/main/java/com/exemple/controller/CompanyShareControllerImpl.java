package com.exemple.controller;

import com.exemple.dto.CompanyShareFullDto;
import com.exemple.model.ResponseModel;
import com.exemple.service.CompanyShareService;
import com.exemple.service.CompanyShareServiceImpl;

import java.util.List;
import java.util.UUID;

public class CompanyShareControllerImpl implements CompanyShareController {

    private final CompanyShareService service = CompanyShareServiceImpl.getInstance();

    @Override
    public ResponseModel<List<CompanyShareFullDto>> findAll() {
        try {
            return ResponseModel.of(service.findAll());
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseModel.ofError("500", e.getMessage());
        }
    }

    @Override
    public ResponseModel<CompanyShareFullDto> findById(UUID id) {
        try {
            return ResponseModel.of(service.findById(id));
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseModel.ofError("500", e.getMessage());
        }
    }

    @Override
    public ResponseModel<CompanyShareFullDto> create(CompanyShareFullDto companyShare) {
        try {
            return ResponseModel.of(service.create(companyShare));
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseModel.ofError("500", e.getMessage());
        }
    }

    @Override
    public ResponseModel<CompanyShareFullDto> update(UUID id, CompanyShareFullDto companyShare) {
        try {
            return ResponseModel.of(service.update(id, companyShare));
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseModel.ofError("500", e.getMessage());
        }
    }

    @Override
    public ResponseModel<Void> delete(UUID id) {
        try {
            service.delete(id);
            return ResponseModel.of(null);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseModel.ofError("500", e.getMessage());
        }
    }
}
