package com.example.humanresources.dto.responseDTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ChargeDto {
    private Long id;

    private String name;
    private LocalDateTime date;
    private String type;
    private String description;
    private BigDecimal price;
}
