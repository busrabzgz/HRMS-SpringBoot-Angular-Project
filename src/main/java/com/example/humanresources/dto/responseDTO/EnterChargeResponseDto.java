package com.example.humanresources.dto.responseDTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EnterChargeResponseDto {
    private Long id;
    private LocalDateTime createDate = LocalDateTime.now();
    private Long version = 0L;

    private String name;
    private String type;
    private LocalDateTime date;
    private BigDecimal price;
    private String description;


}
