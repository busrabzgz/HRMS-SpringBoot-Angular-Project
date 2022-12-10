package com.example.humanresources.dto.responseDTO;

import com.example.humanresources.enums.LeaveTypeEnum;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class LeaveResponseDto {
    private Long id;
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
