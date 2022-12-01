package com.example.humanresources.dto.requestDTO;

import com.example.humanresources.dto.AbstractDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class DepartmentRequestDto extends AbstractDTO {
    private String departmentName;
    private String place;
    private String type;
    private String description;
}
