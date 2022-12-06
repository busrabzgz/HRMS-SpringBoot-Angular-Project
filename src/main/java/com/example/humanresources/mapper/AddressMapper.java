package com.example.humanresources.mapper;

import com.example.humanresources.dto.requestDTO.AddressInfoRequestDto;
import com.example.humanresources.dto.requestDTO.EnterChargeRequestDto;
import com.example.humanresources.dto.responseDTO.AddressInfoResponseDto;
import com.example.humanresources.dto.responseDTO.EnterChargeResponseDto;
import com.example.humanresources.entity.Address;
import com.example.humanresources.entity.Charge;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(implementationName = "AddressMapperImpl" , componentModel = "spring")
public interface AddressMapper {
    @Mapping(target = "id", source = "id")
    Address toAddressFromEnterAddressInfoRequestDto(AddressInfoRequestDto addressInfoRequestDto);

    @Mapping(target = "id",source = "id")
    AddressInfoResponseDto toEnterAddressInfoResponseFromAddress(Address address);

}
