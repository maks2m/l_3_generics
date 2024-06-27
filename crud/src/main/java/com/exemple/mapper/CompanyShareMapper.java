package com.exemple.mapper;

import com.exemple.dto.CompanyShareFullDto;
import com.exemple.dto.CompanyShareSmallLastDto;
import com.exemple.entity.CompanyShare;

import java.util.List;

public interface CompanyShareMapper {

    CompanyShare toEntity(CompanyShareFullDto dto);
    CompanyShareFullDto toDto(CompanyShare entity);
    List<CompanyShareFullDto> toDtoList(List<CompanyShare> entityList);

    CompanyShareSmallLastDto toSmallLastDto(CompanyShare entity);

}
