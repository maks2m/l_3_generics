package com.exemple.service;

import java.util.List;
import java.util.UUID;

public interface CrudService<E> {

    List<E> findAll();

    E findById(UUID id);

    E create(E entity);

    E update(UUID id, E entity);

    void delete(UUID id);
}
