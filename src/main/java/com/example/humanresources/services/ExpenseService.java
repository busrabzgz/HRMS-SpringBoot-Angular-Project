package com.example.humanresources.services;

import com.example.humanresources.dto.requestDTO.CreateExpenseRequestDto;
import com.example.humanresources.dto.requestDTO.CreateLeaveRequestDto;
import com.example.humanresources.dto.requestDTO.UpdateExpenseRequestDto;
import com.example.humanresources.dto.requestDTO.UpdateLeaveRequestDto;
import com.example.humanresources.dto.responseDTO.ExpenseResponseDto;
import com.example.humanresources.dto.responseDTO.LeaveResponseDto;
import com.example.humanresources.entity.Expense;
import com.example.humanresources.entity.Leave;
import com.example.humanresources.entity.User;
import com.example.humanresources.exception.ExpenseNotFoundException;
import com.example.humanresources.exception.LeaveNotFoundException;
import com.example.humanresources.mapper.ExpenseMapper;
import com.example.humanresources.repository.ExpenseRepository;
import com.example.humanresources.repository.UserRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@RequiredArgsConstructor // final olmali yazdigim class
@Slf4j
@Service
public class ExpenseService {

    private final UserRepository userRepository;
    private final ExpenseRepository expenseRepository;
    private final ExpenseMapper expenseMapper;
    private final ReceiptService receiptService;

    @Transactional
    public ExpenseResponseDto createExpense(CreateExpenseRequestDto createExpenseRequestDto) {
        Expense expense = expenseMapper.toExpenseFromCreateExpenseRequestDto(createExpenseRequestDto);

        expense.setReceipts(receiptService.createReceipt(expense.getReceipts()));
        expense.setUser(userRepository.getReferenceById(createExpenseRequestDto.getUserId()));

        return expenseMapper.toExpenseResponseDtoFromExpense(expenseRepository.save(expense));
    }


//    public ExpenseResponseDto updateExpense(UpdateExpenseRequestDto updateExpenseRequestDto) throws Exception {
//        Expense expense = expenseRepository.getReferenceById(updateExpenseRequestDto.getUserId());
//        expense.setDescription(updateExpenseRequestDto.getDescription());
//        expense.setReceipts(receiptService.updateReceipt(expense.getReceipts()));
//        expense=expenseRepository.save(expense);
//        ExpenseResponseDto expenseResponseDto = expenseMapper.toExpenseResponseDtoFromExpense(expense);
//
//        return expenseResponseDto;
//
//    }

    public ExpenseResponseDto updateExpense(UpdateExpenseRequestDto updateExpenseRequestDto) {
        Optional<Expense> expenseOptional = expenseRepository.findById(updateExpenseRequestDto.getUserId());

        expenseOptional.ifPresent(expense -> {
            expense.setDescription(updateExpenseRequestDto.getDescription());
            expense.setReceipts(receiptService.updateReceipt(expense.getReceipts()));
            expense = expenseRepository.save(expense);
        });

        return expenseOptional.map(expenseMapper::toExpenseResponseDtoFromExpense)
                .orElseThrow(() -> new ExpenseNotFoundException("Expense not found!"));
    }


    public List<Expense> findAllExpense() {
        return expenseRepository.findAll();
    }

    public Optional<Expense> findExpenseById(Long id) {
        return expenseRepository.findById(id);

    }

    public void deleteExpenseById(Long id) {
        expenseRepository.deleteById(id);

    }

    public List<Expense> findAllExpenseByUserId(User user) {
        return expenseRepository.getByUser(user);
    }


}
