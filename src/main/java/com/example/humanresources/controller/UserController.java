package com.example.humanresources.controller;


import com.example.humanresources.entity.User;
import com.example.humanresources.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// TODO: Requiedconstravtion ile allconstraction ile farkina bak
//TODO: user yerine client den dto almam ve donmem lazim
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/user")
public class UserController {


    private final UserService userService;


    @PostMapping("/create")
    public ResponseEntity<User> createUser(@RequestBody User user) throws Exception {
        return new ResponseEntity<User>(userService.create(user), HttpStatus.OK);
    }




}
