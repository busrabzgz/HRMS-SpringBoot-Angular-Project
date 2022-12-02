package com.example.humanresources.dto;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
//abstract classlar bir defa extens edilebilir sinirsiz implement
public abstract class AbstractDTO implements GenericDTO{

    private Long id;
    private LocalDateTime createDate = LocalDateTime.now();
    private Long version = 0L;

}
