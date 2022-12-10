package com.example.humanresources.dto.requestDTO;

import com.example.humanresources.enums.LeaveTypeEnum;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Enumerated;
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
public class UpdateLeaveRequestDto {
    private LocalDateTime createDate = LocalDateTime.now();
    private Long version = 0L;

    @Enumerated
    private LeaveTypeEnum type;

    private Integer totalDays;
    private LocalDateTime startOfLeave;
    private LocalDateTime endOfLeave;
    private String description;
    private LocalDateTime dateOfReturn;

    private Long userId;

}
