package com.example.humanresources.mapper;

import com.example.humanresources.dto.requestDTO.CreateExpenseRequestDto;
import com.example.humanresources.dto.requestDTO.UpdateExpenseRequestDto;
import com.example.humanresources.dto.responseDTO.ExpenseResponseDto;
import com.example.humanresources.entity.Expense;
import org.mapstruct.*;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ExpenseMapper {

    @Mapping(source = "userId", target = "user.id", nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.SET_TO_DEFAULT)
    @Mapping(source = "createReceiptRequestDto",target = "receipts")
    Expense toExpenseFromCreateExpenseRequestDto(CreateExpenseRequestDto expenseRequestDto);


    @InheritInverseConfiguration
    Expense toExpenseFromUpdateExpenseRequestDto(UpdateExpenseRequestDto expenseRequestDto);

    @Mapping(source = "user.id", target = "userId")
    @Mapping(source = "receipts", target = "receiptResponseDtos")
    ExpenseResponseDto toExpenseResponseDtoFromExpense(Expense expense);


    List<ExpenseResponseDto> toExpenseResponseDtosFromExpenses(List<Expense> expenseList);
}
