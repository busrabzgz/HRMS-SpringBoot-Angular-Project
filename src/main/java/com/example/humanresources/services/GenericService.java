package com.example.humanresources.services;

import com.example.humanresources.dto.GenericDTO;
import com.example.humanresources.entity.GenericEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;


public interface GenericService <E extends GenericEntity, Q extends GenericDTO, R extends GenericDTO> {


    R update(Q responseDTO) throws Exception;


    void deleteById(E entity) throws Exception;

    R create(Q responseDTO) throws  Exception;

    Optional<R> findById (E entity) throws Exception;

    Page<R> findAll(Pageable pageable);

    R newEntity() throws Exception;
}
