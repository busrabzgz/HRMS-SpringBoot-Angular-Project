package com.example.humanresources.dto.responseDTO;

import com.example.humanresources.dto.AbstractDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserResponseDto extends AbstractDTO {

    private String firsName;
    private String lastName;
    private String citizenNumber;
    private LocalDateTime birtOfDate;
    private LocalDateTime firstStartedWork;
    private String position;
    private BigDecimal salary;
    private String  level;
    private String email;
    private DepartmentResponseDto departmentResponseDto;
    private ChargeResponseDto chargeResponseDto;

}
