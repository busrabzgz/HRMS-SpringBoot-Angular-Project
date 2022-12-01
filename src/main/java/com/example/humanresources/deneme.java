package com.example.humanresources;

import com.example.humanresources.entity.User;
import com.example.humanresources.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;

public class deneme {
    public static void main(String[] args) throws Exception {
        UserService userService = new UserService();
//        User user = new User().builder()
//                .firsName("Aygun")
//                .lastName("Ozdemir")
//                .citizenNumber("2116480245").build();
        User user = new User();
        user.setFirsName("aygun");
        user.setLastName("oz");
        System.out.println(user);

        System.out.println(userService.create(user));
    }
}
