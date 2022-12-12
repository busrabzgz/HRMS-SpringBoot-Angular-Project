package com.example.humanresources.controller;


import com.example.humanresources.dto.requestDTO.CreateExpenseRequestDto;
import com.example.humanresources.dto.requestDTO.UpdateExpenseRequestDto;
import com.example.humanresources.dto.responseDTO.ExpenseResponseDto;
import com.example.humanresources.dto.responseDTO.ExpenseResponseDto;
import com.example.humanresources.services.ExpenseService;

import jakarta.validation.Valid;

import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/expense")
public class ExpenseController {


    private  final ExpenseService expenseService;
    public ExpenseController(ExpenseService expenseService) {
        this.expenseService = expenseService;
    }

    @PostMapping("/create")
    public ResponseEntity<ExpenseResponseDto> createExpense( @Valid @RequestBody CreateExpenseRequestDto createExpenseRequestDto){
        return ResponseEntity.ok(expenseService.createExpense(createExpenseRequestDto));
    }

    @PutMapping("/update")
    public ResponseEntity<ExpenseResponseDto> updateExpense(@Valid @RequestBody UpdateExpenseRequestDto updateExpenseRequestDto) throws Exception{
        return ResponseEntity.ok(expenseService.updateExpense(updateExpenseRequestDto));
    }


}
