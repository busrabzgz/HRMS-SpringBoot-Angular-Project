package com.example.humanresources.dto.responseDTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Date;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserPersonalInfoResponseDto {
    private Long id;
    private LocalDateTime createDate = LocalDateTime.now();
    private Long version = 0L;
    private String firstName;
    private String lastName;
    private String citizenNumber;
    private String gender;
    private Date birthOfDate;
}
