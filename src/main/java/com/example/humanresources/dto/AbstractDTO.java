package com.example.humanresources.dto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
//abstract classlar bir defa extens edilebilir sinirsiz implement
@AllArgsConstructor
@NoArgsConstructor
public abstract class AbstractDTO implements GenericDTO{

    private Long id;
    private LocalDateTime createDate = LocalDateTime.now();
    private Long version = 0L;

}
