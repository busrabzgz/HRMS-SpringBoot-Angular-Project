package com.example.humanresources.services;

import com.example.humanresources.dto.requestDTO.CreateExpenseRequestDto;
import com.example.humanresources.dto.responseDTO.ExpenseResponseDto;
import com.example.humanresources.entity.Expense;
import com.example.humanresources.entity.User;
import com.example.humanresources.mapper.ExpenseMapper;
import com.example.humanresources.repository.ExpenseRepository;
import com.example.humanresources.repository.UserRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
@AllArgsConstructor
public class ExpenseService {

    private UserRepository userRepository;
    private ExpenseRepository expenseRepository;
    private ExpenseMapper expenseMapper;
    private ReceiptService receiptService;

    //
//
    @Transactional
    public ExpenseResponseDto createExpense(CreateExpenseRequestDto createExpenseRequestDto) {
        Expense expense = expenseMapper.toExpenseFromCreateExpenseRequestDto(createExpenseRequestDto);

        expense.setReceipts(receiptService.createReceipt(expense.getReceipts()));
        expense.setUser(userRepository.getReferenceById(createExpenseRequestDto.getUserId()));

        return expenseMapper.toExpenseResponseDtoFromExpense(expenseRepository.save(expense));
    }

    public void deleteExpenseId(Long id) {
        expenseRepository.deleteById(id);
    }

    public List<Expense> findAllExpenseByUserId(User user) {
        return expenseRepository.getByUser(user);
    }


//
//    public ExpenseResponseDto updateCharge(CreateExpenseRequestDto createExpenseRequestDto) {
//        Expense newCharge = new Expense();
////        newCharge.setName(enterChargeRequestDto.getName());
////        newCharge.setType(enterChargeRequestDto.getType());
////        newCharge.setDate(enterChargeRequestDto.getDate());
////        newCharge.setPrice(enterChargeRequestDto.getPrice());
////        newCharge.setDescription(enterChargeRequestDto.getDescription());
//        return null;
//    }


//    public Optional<Expense> findChargeById(Long id){
//        return expenseRepository.findById(id);
//    }
//


}
