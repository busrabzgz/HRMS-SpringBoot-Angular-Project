package com.example.humanresources;

import com.example.humanresources.entity.User;
import com.example.humanresources.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;

public class deneme {
    public static void main(String[] args) throws Exception {
        UserService userService = new UserService();
        User user = new User();
        userService.create(user);
    }
}
