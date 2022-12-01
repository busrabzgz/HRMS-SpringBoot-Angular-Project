package com.example.humanresources.dto.responseDTO;

import com.example.humanresources.dto.AbstractDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LeaveDto extends AbstractDTO {

    private String name;
    private LocalDateTime startOfLeave;
    private LocalDateTime endOfLeave;
    private String description;
    private String type;

}
