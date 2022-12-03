package com.example.humanresources.services;

import com.example.humanresources.dto.GenericDTO;
import com.example.humanresources.dto.requestDTO.UserRequestDto;
import com.example.humanresources.dto.responseDTO.UserResponseDto;
import com.example.humanresources.entity.User;
import com.example.humanresources.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserService extends AbstractService<User, UserRequestDto, UserResponseDto> {

    private UserRepository userRepository;

    @Override
    public UserResponseDto update(UserRequestDto requestDTO) throws Exception {
        User user = userRepository.getReferenceById(requestDTO.getId());
        requestDTO.setCitizenNumber(user.getCitizenNumber());
        return super.update(requestDTO);
    }

    //    public User update(UserRequestDto userRequestDto) throws Exception {
//
//        User user = repository.getReferenceById(userRequestDto.getId());
//        user.setFirsName(userRequestDto.getFirsName());
//        user.setLastName(userRequestDto.getLastName());
//        user.setSalary(userRequestDto.getSalary());
//        user.setLevel(userRequestDto.getLevel());
//        user.setPosition(userRequestDto.getPosition());
//        return super.update(user);
//    }

}
