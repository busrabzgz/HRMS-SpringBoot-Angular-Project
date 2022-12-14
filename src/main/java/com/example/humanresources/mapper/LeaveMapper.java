package com.example.humanresources.mapper;

import com.example.humanresources.dto.requestDTO.CreateLeaveRequestDto;
import com.example.humanresources.dto.requestDTO.UpdateLeaveRequestDto;
import com.example.humanresources.dto.responseDTO.LeaveResponseDto;
import com.example.humanresources.entity.Leave;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface LeaveMapper {
    @Mapping(source = "userId", target = "user.id")
    Leave toLeaveFromCreateLeaveRequestDto(CreateLeaveRequestDto leaveRequestDto);



    Leave toLeaveFromUpdateLeaveRequestDto(UpdateLeaveRequestDto leaveRequestDto);
    @Mapping(source = "user.id", target = "userId")
    LeaveResponseDto toLeaveResponseDtoFromLeave(Leave leave);

    List<LeaveResponseDto> toLeaveResponseDtosFromLeaves(List<Leave> leaveList);
}
