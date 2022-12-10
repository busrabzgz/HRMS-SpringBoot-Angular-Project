package com.example.humanresources.mapper;

import com.example.humanresources.dto.requestDTO.CreateReceiptRequestDto;
import com.example.humanresources.dto.requestDTO.CreateUserRequestDto;
import com.example.humanresources.dto.requestDTO.UpdateReceiptRequestDto;
import com.example.humanresources.dto.requestDTO.UpdateUserRequestDto;
import com.example.humanresources.dto.responseDTO.ReceiptResponseDto;
import com.example.humanresources.dto.responseDTO.UserResponseDto;
import com.example.humanresources.entity.Receipt;
import com.example.humanresources.entity.User;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring")
public interface ReceiptMapper {

    Receipt toReceiptFromCreateReceiptRequestDto(CreateReceiptRequestDto receiptRequestDto);

    Receipt toReceiptFromUpdateReceiptRequestDto(UpdateReceiptRequestDto receiptRequestDto);


    @Mapping(source = "expense.id", target = "expenseId")
    ReceiptResponseDto toReceiptResponseDtoFromReceipt(Receipt receipt);



}
