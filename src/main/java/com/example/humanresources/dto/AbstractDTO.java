package com.example.humanresources.dto;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
//abstract classlar bir defa extens edilebilir sinirsiz implement
public abstract class AbstractDTO implements GenericDTO{

    private Long id;
    private LocalDateTime createDate = LocalDateTime.now();
    private Long version = 0L;

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public LocalDateTime getCreateDate() {
        return createDate;
    }

    @Override
    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }

    @Override
    public Long getVersion() {
        return version;
    }

    @Override
    public void setVersion(Long version) {
        this.version = version;
    }
}
