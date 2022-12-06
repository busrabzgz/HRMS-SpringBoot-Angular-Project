package com.example.humanresources.mapper;

import com.example.humanresources.dto.requestDTO.DepartmentInfoRequestDto;
import com.example.humanresources.dto.responseDTO.DepartmentInfoResponseDto;
import com.example.humanresources.entity.Department;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(implementationName = "DepartmentMapperImpl" , componentModel = "spring")
public interface DepartmentMapper {
    @Mapping(target = "id", source = "id")
    Department toDepartmentFromDepartmentInfoRequestDto(DepartmentInfoRequestDto enterDepartmentInfoRequestDto);

    @Mapping(target = "id",source = "id")
    DepartmentInfoResponseDto toEnterDepartmentInfoResponseFromDepartment(Department department);

}
