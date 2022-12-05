package com.example.humanresources.dto.responseDTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AddressInfoResponseDto {
    private Long id;
    private LocalDateTime createDate = LocalDateTime.now();
    private Long version = 0L;

    private String country;
    private String city;
    private String quarter;
    private String street;
    private String doorNumber;
}
