package com.example.humanresources.dto.requestDTO;

import com.example.humanresources.dto.AbstractDTO;

import javax.print.attribute.standard.PrinterResolution;
import java.time.LocalDateTime;

public class LeaveRequestDto extends AbstractDTO {
    private String name;
    private LocalDateTime startOfLeave;
    private LocalDateTime endOfLeave;
    private String description;
    private String type;

}
