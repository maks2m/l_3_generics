package com.exemple.service;

import com.exemple.dto.CompanyShareFullDto;
import com.exemple.entity.CompanyShare;
import com.exemple.mapper.CompanyShareMapper;
import com.exemple.mapper.CompanyShareMapperImpl;
import com.exemple.repository.CompanyShareRepository;
import com.exemple.repository.CompanyShareRepositoryImpl;

import java.util.List;
import java.util.UUID;
import java.util.logging.Logger;

public class CompanyShareServiceImpl implements CompanyShareService{

    private static final CompanyShareServiceImpl INSTANCE = new CompanyShareServiceImpl();
    private CompanyShareServiceImpl() {}
    public static CompanyShareServiceImpl getInstance() {
        return INSTANCE;
    }

    private final CompanyShareRepository repository = CompanyShareRepositoryImpl.getInstance();

    private final CompanyShareMapper mapper = CompanyShareMapperImpl.getInstance();

    private static final Logger log = Logger.getLogger(CompanyShareServiceImpl.class.getName());

    @Override
    public List<CompanyShareFullDto> findAll() {
        log.info("Start class CompanyShareServiceImpl method findAll()");
        List<CompanyShare> companyShares = repository.findAll();
        return mapper.toDtoList(companyShares);
    }

    @Override
    public CompanyShareFullDto findById(UUID id) {
        log.info("Start class CompanyShareServiceImpl method findById()");
        CompanyShare companyShare = repository.findById(id).orElseThrow();
        return mapper.toDto(companyShare);
    }

    @Override
    public CompanyShareFullDto create(CompanyShareFullDto companyShare) {
        log.info("Start class CompanyShareServiceImpl method create()");
        CompanyShare entity = mapper.toEntity(companyShare);
        CompanyShare savedCompanyShare = repository.create(entity);
        return mapper.toDto(savedCompanyShare);
    }

    @Override
    public CompanyShareFullDto update(UUID id, CompanyShareFullDto companyShare) {
        log.info("Start class CompanyShareServiceImpl method update()");
        CompanyShare entity = mapper.toEntity(companyShare);
        entity.setId(id);
        CompanyShare updateCompanyShare = repository.update(id, entity);
        return mapper.toDto(updateCompanyShare);
    }

    @Override
    public void delete(UUID id) {
        log.info("Start class CompanyShareServiceImpl method delete()");
        repository.delete(id);
    }
}
