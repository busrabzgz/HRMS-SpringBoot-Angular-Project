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
import com.example.humanresources.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class UserService {

    private UserRepository userRepository;

    public UserResponseDto addUser(UserRequestDto userRequestDto) throws Exception{
        User newUser = userRepository.getReferenceById(userRequestDto.getId());
        if (newUser != null){
            throw new Exception("User already exsist!");
        }

        return null;
    }

    public UserPersonalInfoResponseDto updateUserPersonalInfo(UserPersonalInfoRequestDto userPersonalInfoRequestDto) throws Exception {
        User user = userRepository.getReferenceById(userPersonalInfoRequestDto.getId());
        user.setFirstName(userPersonalInfoRequestDto.getFirstName());
        user.setLastName(userPersonalInfoRequestDto.getLastName());
        user.setBirthOfDate(userPersonalInfoRequestDto.getBirthOfDate());
        user.setCitizenNumber(userPersonalInfoRequestDto.getCitizenNumber());
        return null;
    }
    public UserContactInfoResponseDto updateUserContactInfo(UserContactInfoRequestDto userContactInfoRequestDto)throws Exception{
        User user=userRepository.getReferenceById(userContactInfoRequestDto.getId());
        user.setPhoneNumber(userContactInfoRequestDto.getPhoneNumber());
        user.setEmail(userContactInfoRequestDto.getEmail());

        return null;
    }
    public UserBusinessInfoResponseDto updateUserBusinessInfo(UserBusinessInfoRequestDto userBusinessInfoRequestDto) throws Exception{
        User user=userRepository.getReferenceById(userBusinessInfoRequestDto.getId());
        user.setPosition(userBusinessInfoRequestDto.getPosition());
        user.setLevel(userBusinessInfoRequestDto.getLevel());
        user.setSalary(userBusinessInfoRequestDto.getSalary());
        return null;
    }

        public List<User> findAllUser(){
        return userRepository.findAll();
    }


        public void deleteUserById(Long id){
        userRepository.deleteById(id);
    }

        public Optional<User> findUserById(Long id){
        return userRepository.findById(id);
    }



}
