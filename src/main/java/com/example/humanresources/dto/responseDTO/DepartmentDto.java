package com.example.humanresources.dto.responseDTO;

import com.example.humanresources.dto.AbstractDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DepartmentDto extends AbstractDTO {

    private String departmentName;
    private String place;
    private String type;
    private String description;
}
