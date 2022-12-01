package com.example.humanresources.dto;

import java.time.LocalDateTime;

public interface GenericDTO {
    //objesi olusamaz extend edilemez


    Long getId();
    void setId(Long id);

    Long getVersion();
    void setVersion(Long version);
    LocalDateTime getCreateDate();
    void setCreateDate(LocalDateTime createDate);
}
