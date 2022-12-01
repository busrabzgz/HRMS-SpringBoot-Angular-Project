package com.example.humanresources.services;

import com.example.humanresources.entity.GenericEntity;
import com.example.humanresources.repository.GenericRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;


public abstract class AbstractService<E extends GenericEntity> implements GenericService<E> {

    @Autowired
    protected GenericRepository<E> repository;

    @Override
    public E create(E entity) throws Exception {

        return repository.save(entity);
    }

    @Override
    public E update(E entity) throws Exception {
        return repository.save(entity);
    }

    @Override
    public void deleteById(E entity) throws Exception {
         repository.deleteById(entity.getId());
    }

    @Override
    public Optional<E> findById(E entity) throws Exception {
        return repository.findById(entity.getId());
    }

    @Override
    public Page<E> findAll(Pageable pageable){
        return repository.findAll(pageable);
    }
}
