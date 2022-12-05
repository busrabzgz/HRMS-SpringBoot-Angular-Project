package com.example.humanresources.dto.requestDTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserBusinessInfoRequestDto {
    private Long id;
    private LocalDateTime createDate = LocalDateTime.now();
    private Long version = 0L;

    private String position;
    private BigDecimal salary;
    private String  level;
    private LocalDateTime startToWork;
    private DepartmentInfoRequestDto departmentInfoRequestDto;
}
