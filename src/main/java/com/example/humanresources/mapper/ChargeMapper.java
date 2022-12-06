package com.example.humanresources.mapper;



import com.example.humanresources.dto.requestDTO.EnterChargeRequestDto;
import com.example.humanresources.dto.responseDTO.EnterChargeResponseDto;
import com.example.humanresources.entity.Charge;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(implementationName = "ChargeMapperImpl" , componentModel = "spring")
public interface ChargeMapper {
    @Mapping(target = "id", source = "id")
    Charge toChargeFromEnterChargeRequestDto(EnterChargeRequestDto enterChargeRequestDto);

    @Mapping(target = "id",source = "id")
    EnterChargeResponseDto toEnterChargeResponseFromCharge(Charge charge);
}
