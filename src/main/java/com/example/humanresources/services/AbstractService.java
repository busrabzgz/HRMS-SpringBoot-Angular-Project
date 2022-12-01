package com.example.humanresources.services;

import com.example.humanresources.common.ReflectionUtil;
import com.example.humanresources.entity.GenericEntity;

import java.lang.reflect.Field;

public abstract class AbstractService<E extends GenericEntity> implements GenericService<E> {

    @Override
    public E create(E entity) throws Exception {
        System.out.println(entity.getClass());
        ReflectionUtil.getAllField(entity.getClass());
        return null;
    }

    @Override
    public E update(E entity) throws Exception {
        return null;
    }

    @Override
    public E deleteById(E entity) throws Exception {
        return null;
    }

    @Override
    public E findAll(E entity) throws Exception {
        return null;
    }

    @Override
    public E findById(E entity) throws Exception {
        return null;
    }
}
