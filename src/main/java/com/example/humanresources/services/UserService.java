package com.example.humanresources.services;

import com.example.humanresources.entity.User;
import com.example.humanresources.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;


    public User createUser(User user) throws Exception {
        User newUser = userRepository.getReferenceById(user.getId());
        if (newUser != null) {
            throw new Exception("User already exits");
        }
        return userRepository.save(user);
    }

    public void deleteUserById(Long id){
        userRepository.deleteById(id);
    }
    public User updateUser(User user){
        User updatedUser=userRepository.getReferenceById(user.getId());
        updatedUser.setFirsName(user.getFirsName());
        updatedUser.setLastName(user.getLastName());
        updatedUser.setEmail(user.getEmail());
        updatedUser.setPassword(user.getPassword());
        updatedUser.setPosition(user.getPosition());
        updatedUser.setLevel(user.getLevel());
        updatedUser.setSalary(user.getSalary());
        return userRepository.save(updatedUser);
    }
    public List<User> findAllUser(){
        return userRepository.findAll();
    }


}
