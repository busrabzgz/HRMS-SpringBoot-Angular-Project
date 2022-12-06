package com.example.humanresources.controller;
import com.example.humanresources.dto.requestDTO.UserRequestDto;
import com.example.humanresources.dto.responseDTO.UserResponseDto;
import com.example.humanresources.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// TODO: Requiedconstravtion ile allconstraction ile farkina bak
//TODO: user yerine client den dto almam ve donmem lazim
@RestController
@RequestMapping("/api/user")
public class UserController {

//    @PostMapping('/updateUserInformation')
//    public ResponseEntity<UserResponseDto> updateUserInformation() {
//        return null;
//    }
}
