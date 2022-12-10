package com.example.humanresources.mapper;


import com.example.humanresources.dto.requestDTO.CreateOvertimeWorkRequestDto;
import com.example.humanresources.dto.requestDTO.UpdateOvertimeWorkRequestDto;
import com.example.humanresources.dto.responseDTO.OvertimeWorkResponseDto;

import com.example.humanresources.entity.OvertimeWork;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring")
public interface OvertimeWorkMapper {
    @Mapping(source = "userId", target = "user.id")
    OvertimeWork toOvertimeWorkFromCreateOvertimeWorkRequestDto(CreateOvertimeWorkRequestDto overtimeWorkRequestDto);



    OvertimeWork toOvertimeWorkFromUpdateOvertimeWorkRequestDto(UpdateOvertimeWorkRequestDto overtimeWorkRequestDto);
    @Mapping(source = "user.id", target = "userId")
    OvertimeWorkResponseDto toOvertimeWorkResponseDtoFromOvertimeWork(OvertimeWork overtimeWork);
}
