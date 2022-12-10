package com.example.humanresources.dto.requestDTO;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;
@JsonIgnoreProperties(ignoreUnknown = true)
@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class UpdateExpenseRequestDto {

    private Long userId;
    private Long receiptId;

    private byte[] image;
    private String description;

    private CreateReceiptRequestDto createReceiptRequestDto;
}
