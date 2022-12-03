package com.example.humanresources.dto.requestDTO;

import com.example.humanresources.dto.AbstractDTO;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class ChargeRequestDto extends AbstractDTO {
    private String name;
    private LocalDateTime date;
    private String type;
    private String description;
    private BigDecimal price;

}
