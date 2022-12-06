package com.example.humanresources.mapper;

import com.example.humanresources.dto.requestDTO.EnterLeaveRequestDto;
import com.example.humanresources.dto.responseDTO.EnterLeaveResponseDto;
import com.example.humanresources.entity.Leave;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(implementationName = "LeaveMapperImpl" , componentModel = "spring")
public interface LeaveMapper {
    @Mapping(target = "id", source = "id")
    Leave toLeaveFromEnterLeaveRequestDto(EnterLeaveRequestDto enterLeaveRequestDto);

    @Mapping(target = "id",source = "id")
    EnterLeaveResponseDto toEnterLeaveResponseFromLeave(Leave leave);


}
