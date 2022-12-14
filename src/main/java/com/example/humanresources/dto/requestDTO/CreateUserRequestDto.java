package com.example.humanresources.dto.requestDTO;

import com.example.humanresources.enums.DepartmentEnum;
import com.example.humanresources.enums.GenderTypeEnum;
import com.example.humanresources.enums.LevelTypeEnum;
import com.example.humanresources.enums.PositionTypeEnum;
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
    private Date birthOfDate;
    private BigDecimal salary;
    private LocalDateTime startToWork;

    private DepartmentEnum department;
    @Enumerated
    private GenderTypeEnum gender;
    private PositionTypeEnum position;
    private LevelTypeEnum level;

    private String email;
    private String phoneNumber;
    private String address;





}
