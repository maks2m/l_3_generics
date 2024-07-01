package com.exemple.service;

public abstract class AbstractCrudService<E, R> implements CrudService<E> {

    protected R repository;

    public AbstractCrudService(R repository) {
        this.repository = repository;
    }

}
