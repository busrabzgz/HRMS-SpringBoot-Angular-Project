package com.example.humanresources.services;

import com.example.humanresources.entity.GenericEntity;

public interface GenericService <E extends GenericEntity> {
    E create(E entity) throws Exception;

    E update(E entity) throws Exception;

    E deleteById(E entity) throws Exception;

    E findAll( E entity) throws Exception;
    E findById (E entity) throws Exception;
}
