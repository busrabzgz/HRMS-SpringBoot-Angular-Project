package com.example.humanresources.services;

import com.example.humanresources.dto.requestDTO.UserBusinessInfoRequestDto;
import com.example.humanresources.dto.requestDTO.UserContactInfoRequestDto;
import com.example.humanresources.dto.requestDTO.UserPersonalInfoRequestDto;
import com.example.humanresources.dto.requestDTO.UserRequestDto;
import com.example.humanresources.dto.responseDTO.UserBusinessInfoResponseDto;
import com.example.humanresources.dto.responseDTO.UserContactInfoResponseDto;
import com.example.humanresources.dto.responseDTO.UserPersonalInfoResponseDto;
import com.example.humanresources.dto.responseDTO.UserResponseDto;
import com.example.humanresources.entity.User;
import com.example.humanresources.exception.UserNotFoundException;
import com.example.humanresources.mapper.UserMapper;
import com.example.humanresources.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor // final olmali yazdigim class
@Service
public class UserService {

    private final UserRepository userRepository;

    private final UserMapper userMapper;

    public UserResponseDto addUser(UserRequestDto userRequestDto) throws Exception{
        User user = userMapper.toUserFromUserRequestDto(userRequestDto);
        userRepository.save(user);
        UserResponseDto userResponseDto = userMapper.toUserResponseDtoFromUser(user);
        System.out.println(userResponseDto);
        return userResponseDto;
    }
    public UserResponseDto updateUser(Long id, UserRequestDto userRequestDto) {
        Optional<User> userOptional = userRepository.findById(id);

        userOptional.ifPresent(user -> {
            user.setFirstName(userRequestDto.getFirstName());
            user.setBirthOfDate(userRequestDto.getBirthOfDate());
            userRepository.save(user);
        });

        return userOptional.map(userMapper::toUserResponseDtoFromUser)
                .orElseThrow(() -> new UserNotFoundException("User not found!"));
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
