package com.example.humanresources.dto.requestDTO;

import com.example.humanresources.enums.DepartmentEnum;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Date;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class CreateUserRequestDto {
    private Long userId;
    private String firstName;
    private String lastName;
    private String citizenNumber;
    private String gender;
    private Date birthOfDate;
    private String position;
    private BigDecimal salary;
    private String  level;
    private LocalDateTime startToWork;

    @Enumerated
    private DepartmentEnum department;

    private String email;
    private String phoneNumber;
    private String address;





}
