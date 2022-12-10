package com.example.humanresources.dto.responseDTO;

import com.example.humanresources.enums.ExpenseReceiptEnum.CategoryEnum;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
@JsonIgnoreProperties(ignoreUnknown = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ReceiptResponseDto {
    private Long id;
    private LocalDateTime createDate = LocalDateTime.now();
    private Long version = 0L;

    private byte[] billImage;
    private Long expenseId;
    private ExpenseResponseDto expenseResponseDto;

    @Enumerated
    private CategoryEnum category;
    private BigDecimal amount;

    private LocalDate dateOfReceipt;

    private String salesTaxRate;
    private String description;
}
