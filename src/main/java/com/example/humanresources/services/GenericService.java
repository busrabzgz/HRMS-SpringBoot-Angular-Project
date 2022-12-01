package com.example.humanresources.services;

import com.example.humanresources.entity.GenericEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;


public interface GenericService <E extends GenericEntity> {

    E create(E entity) throws Exception;

    E update(E entity) throws Exception;


    void deleteById(E entity) throws Exception;

    Optional<E> findById (E entity) throws Exception;

    Page<E> findAll(Pageable pageable);
}
