package com.example.humanresources.services;

import com.example.humanresources.dto.requestDTO.CreateUserRequestDto;
import com.example.humanresources.dto.requestDTO.UpdateUserRequestDto;
import com.example.humanresources.dto.responseDTO.ExpenseResponseDto;
import com.example.humanresources.dto.responseDTO.UserResponseDto;
import com.example.humanresources.entity.User;
import com.example.humanresources.exception.UserNotFoundException;
import com.example.humanresources.mapper.ExpenseMapper;
import com.example.humanresources.mapper.UserMapper;
import com.example.humanresources.repository.AdvanceRepository;
import com.example.humanresources.repository.LeaveRepository;
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
    private final ExpenseService expenseService;

    private final ExpenseMapper expenseMapper;

    private AdvanceService advanceService;
    private AdvanceRepository advanceRepository;

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


//    public UserResponseDto addUser(UserRequestDto userRequestDto) throws Exception{
////        User newUser = userRepository.getReferenceById(userRequestDto.getId());
////        if (newUser != null){
////            throw new Exception("User already exsist!");
////        }
//
//    public UserPersonalInfoResponseDto updateUserPersonalInfo(UserPersonalInfoRequestDto userPersonalInfoRequestDto) throws Exception {
//        User user = userRepository.getReferenceById(userPersonalInfoRequestDto.getId());
//        user.setFirstName(userPersonalInfoRequestDto.getFirstName());
//        user.setLastName(userPersonalInfoRequestDto.getLastName());
//        user.setBirthOfDate(userPersonalInfoRequestDto.getBirthOfDate());
//        user.setCitizenNumber(userPersonalInfoRequestDto.getCitizenNumber());
//        return null;
//    }
//    public UserContactInfoResponseDto updateUserContactInfo(UserContactInfoRequestDto userContactInfoRequestDto)throws Exception{
//        User user=userRepository.getReferenceById(userContactInfoRequestDto.getId());
//        user.setPhoneNumber(userContactInfoRequestDto.getPhoneNumber());
//        user.setEmail(userContactInfoRequestDto.getEmail());
//
//        return null;
//    }
//    public UserBusinessInfoResponseDto updateUserBusinessInfo(UserBusinessInfoRequestDto userBusinessInfoRequestDto) throws Exception{
//        User user=userRepository.getReferenceById(userBusinessInfoRequestDto.getId());
//        user.setPosition(userBusinessInfoRequestDto.getPosition());
//        user.setLevel(userBusinessInfoRequestDto.getLevel());
//        user.setSalary(userBusinessInfoRequestDto.getSalary());
//        return null;
//    }
//
//        public List<User> findAllUser(){
//        return userRepository.findAll();
//    }
//
//
//        public void deleteUserById(Long id){
//        userRepository.deleteById(id);
//    }
//
//        public Optional<User> findUserById(Long id){
//        return userRepository.findById(id);
//    }


}
