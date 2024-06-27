package com.exemple.mapper;

import com.exemple.dto.CompanyShareFullDto;
import com.exemple.dto.CompanyShareSmallLastDto;
import com.exemple.entity.CompanyShare;

import java.util.ArrayList;
import java.util.List;

public class CompanyShareMapperImpl implements CompanyShareMapper {

    private static final CompanyShareMapperImpl INSTANCE = new CompanyShareMapperImpl();
    private CompanyShareMapperImpl() {}
    public static CompanyShareMapperImpl getInstance() {
        return INSTANCE;
    }

    @Override
    public CompanyShare toEntity(CompanyShareFullDto dto) {
        CompanyShare entity = new CompanyShare();
        entity.setId(dto.getId());
        entity.setCompanyName(dto.getCompanyName());
        entity.setCompanyCode(dto.getCompanyCode());
        entity.setCost(dto.getCost());
        entity.setDate(dto.getDate());
        return entity;
    }

    @Override
    public CompanyShareFullDto toDto(CompanyShare entity) {
        CompanyShareFullDto dto = new CompanyShareFullDto();
        dto.setId(entity.getId());
        dto.setCompanyName(entity.getCompanyName());
        dto.setCompanyCode(entity.getCompanyCode());
        dto.setCost(entity.getCost());
        dto.setDate(entity.getDate());
        return dto;
    }

    @Override
    public List<CompanyShareFullDto> toDtoList(List<CompanyShare> entityList) {
        List<CompanyShareFullDto> companyShareFullDtos = new ArrayList<>();
        for (CompanyShare entity : entityList) {
            companyShareFullDtos.add(toDto(entity));
        }
        return companyShareFullDtos;
    }


    @Override
    public CompanyShareSmallLastDto toSmallLastDto(CompanyShare entity) {
        return null;
    }
}
