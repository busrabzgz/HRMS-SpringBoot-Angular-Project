package com.example.humanresources.dto.requestDTO;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class CreateAdvanceRequestDto {
    private LocalDateTime createDate = LocalDateTime.now();
    private Long version = 0L;



    private BigDecimal amount;
    private LocalDateTime date;
    private Integer repayment;
    private String description;
    private Long userId;
}
