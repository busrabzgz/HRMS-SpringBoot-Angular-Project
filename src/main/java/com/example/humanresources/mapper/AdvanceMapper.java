package com.example.humanresources.mapper;


import com.example.humanresources.dto.requestDTO.CreateAdvanceRequestDto;
import com.example.humanresources.dto.requestDTO.UpdateAdvanceRequestDto;
import com.example.humanresources.dto.responseDTO.AdvanceResponseDto;
import com.example.humanresources.entity.Advance;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface AdvanceMapper {
    @Mapping(source = "userId", target = "user.id")
    Advance toAdvanceFromCreateAdvanceRequestDto(CreateAdvanceRequestDto advanceRequestDto);



    Advance toAdvanceFromUpdateAdvanceRequestDto(UpdateAdvanceRequestDto advanceRequestDto);
    @Mapping(source = "user.id", target = "userId")
    AdvanceResponseDto toAdvanceResponseDtoFromAdvance(Advance advance);


    List<AdvanceResponseDto> toAdvanceResponseDtosFromAdvances(List<Advance> advanceList);
}
