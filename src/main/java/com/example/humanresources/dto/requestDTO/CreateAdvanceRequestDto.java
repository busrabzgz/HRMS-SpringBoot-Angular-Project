package com.example.humanresources.dto.requestDTO;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@SuperBuilder

@NoArgsConstructor
@AllArgsConstructor
public class CreateAdvanceRequestDto {



    private BigDecimal amount;
    private LocalDateTime date;
    private Integer repayment;
    private String description;
    private Long userId;
}
