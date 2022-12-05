package com.example.humanresources.dto.requestDTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserContactInfoRequestDto {
    private Long id;
    private LocalDateTime createDate = LocalDateTime.now();
    private Long version = 0L;
    private String email;
    private String phoneNumber;
    private AddessInfoRequestDto addessInfoRequestDto;
}
