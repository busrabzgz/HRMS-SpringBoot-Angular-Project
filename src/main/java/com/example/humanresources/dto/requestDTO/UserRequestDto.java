package com.example.humanresources.dto.requestDTO;

import com.example.humanresources.dto.AbstractDTO;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.math.BigDecimal;
import java.time.LocalDateTime;
@JsonIgnoreProperties(ignoreUnknown = true)

public class UserRequestDto extends AbstractDTO {

    private String citizenNumber;
}
