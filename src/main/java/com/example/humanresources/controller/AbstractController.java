package com.example.humanresources.controller;

import com.example.humanresources.common.Mapper;
import com.example.humanresources.dto.GenericDTO;
import com.example.humanresources.entity.GenericEntity;
import com.example.humanresources.services.AbstractService;
import com.example.humanresources.services.GenericService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


public abstract class AbstractController<E extends GenericEntity, Q extends GenericDTO, R extends GenericDTO> {

    @Autowired protected GenericService<E, Q, R> service;
    @Autowired protected AbstractService<E,Q,R> abstractService;

    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody Q requestDto) throws Exception {
        return new ResponseEntity<>(service.create(requestDto), HttpStatus.CREATED);
    }

}
