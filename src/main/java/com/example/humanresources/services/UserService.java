package com.example.humanresources.services;

import com.example.humanresources.dto.requestDTO.CreateUserRequestDto;
import com.example.humanresources.dto.requestDTO.UpdateUserRequestDto;
import com.example.humanresources.dto.responseDTO.*;
import com.example.humanresources.entity.OvertimeWork;
import com.example.humanresources.entity.User;
import com.example.humanresources.exception.UserNotFoundException;
import com.example.humanresources.mapper.*;
import com.example.humanresources.repository.AdvanceRepository;
import com.example.humanresources.repository.LeaveRepository;
import com.example.humanresources.repository.OvertimeWorkRepository;
import com.example.humanresources.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RequiredArgsConstructor // final olmali yazdigim class
@Slf4j
@Service
public class UserService {



    private final UserRepository userRepository;

    private final UserMapper userMapper;

    private final LeaveService leaveService;
    private final LeaveRepository leaveRepository;
    private final LeaveMapper leaveMapper;
    private final ExpenseService expenseService;

    private final ExpenseMapper expenseMapper;

    private final AdvanceService advanceService;
    private final AdvanceRepository advanceRepository;
    private final AdvanceMapper advanceMapper;

    private final OvertimeWorkService overtimeWorkService;
    private final OvertimeWorkRepository overtimeWorkRepository;
    private final OvertimeWorkMapper overtimeWorkMapper;



    public UserResponseDto createUser(CreateUserRequestDto createUserRequestDto) throws Exception {
        // burada henüz database kayıt olmadığı için id yok
        User user = userMapper.toUserFromCreateUserRequestDto(createUserRequestDto);
        // id olduğu için tekrar user'a atıyoruz
        user = userRepository.save(user);
        UserResponseDto userResponseDto = userMapper.toUserResponseDtoFromUser(user);
        System.out.println(userResponseDto);
        return userResponseDto;
    }


    public UserResponseDto updateUser(UpdateUserRequestDto updateUserRequestDto) {
        Optional<User> userOptional = userRepository.findById(updateUserRequestDto.getUserId());

        userOptional.ifPresent(user -> {
            user.setFirstName(updateUserRequestDto.getFirstName());
            user.setBirthOfDate(updateUserRequestDto.getBirthOfDate());
            user.setLastName(updateUserRequestDto.getLastName());
            user.setCitizenNumber(updateUserRequestDto.getCitizenNumber());


            user = userRepository.save(user);
        });

        return userOptional.map(userMapper::toUserResponseDtoFromUser)
                .orElseThrow(() -> new UserNotFoundException("User not found!"));
    }

    @Transactional
    public UserResponseDto getUserResponseDtoById(Long id) {
        Optional<User> userOptional = userRepository.findById(id);

        return userOptional.map(userMapper::toUserResponseDtoFromUser)
                .orElseThrow(() -> new UserNotFoundException("user not exist!"));
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

    public List<UserResponseDto> getAllUsers(Pageable pageable) {
        Page<User> userList = userRepository.findAll(pageable);
        return userList.stream()
                .map(userMapper::toUserResponseDtoFromUser).collect(Collectors.toList());

    }

    public List<ExpenseResponseDto> getUserExpense(Long id) {
        User user = userRepository.getReferenceById(id);
        return expenseMapper.toExpenseResponseDtosFromExpenses(expenseService.findAllExpenseByUserId(user));
    }

    public List<LeaveResponseDto> getUserLeave(Long id) {
        User user = userRepository.getReferenceById(id);
        return leaveMapper.toLeaveResponseDtosFromLeaves(leaveService.findAllLeaveByUserId(user));
    }

    public List<AdvanceResponseDto> getUserAdvance(Long id) {
        User user = userRepository.getReferenceById(id);
        return advanceMapper.toAdvanceResponseDtosFromAdvances(advanceService.findAllAdvanceByUserId(user));
    }

    public List<OvertimeWorkResponseDto> getUserOvertimeWork(Long id) {
        User user = userRepository.getReferenceById(id);
        return overtimeWorkMapper.toOvertimeWorkResponseDtosFromOvertimeWorks(overtimeWorkService.findAllOvertimeWorkByUserId(user));
    }

    public List<UserResponseDto> getEmployeesBirthday() {
        return userMapper.toUserResponseDTOsFromUsers(userRepository.getEmployeesBirthday());
    }






}
