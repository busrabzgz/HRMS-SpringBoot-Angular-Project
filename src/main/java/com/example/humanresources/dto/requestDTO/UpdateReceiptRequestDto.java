package com.example.humanresources.dto.requestDTO;

import com.example.humanresources.enums.ExpenseReceiptEnum.CategoryEnum;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;
import java.time.LocalDate;
@JsonIgnoreProperties(ignoreUnknown = true)
@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class UpdateReceiptRequestDto {



    private byte[] billImage;

    @Enumerated
    private CategoryEnum category;
    private BigDecimal amount;

    private LocalDate dateOfReceipt;

    private String salesTaxRate;
    private String description;
}
