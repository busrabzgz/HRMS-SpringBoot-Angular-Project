package com.example.humanresources.dto.responseDTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LeaveDto {
    private Long id;
    private String name;
    private LocalDateTime startOfLeave;
    private LocalDateTime endOfLeave;
    private String description;
    private String type;

}
