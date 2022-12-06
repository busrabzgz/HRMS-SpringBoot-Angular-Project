package com.example.humanresources.dto.requestDTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;
@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class DepartmentInfoRequestDto {
    private Long id;
    private LocalDateTime createDate = LocalDateTime.now();
    private Long version = 0L;
    private String departmentName;
    private String place;
    private String type;
    private String description;
}

