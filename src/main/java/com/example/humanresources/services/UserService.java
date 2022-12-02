package com.example.humanresources.services;

import com.example.humanresources.dto.requestDTO.UserRequestDto;
import com.example.humanresources.entity.Charge;
import com.example.humanresources.entity.User;
import com.example.humanresources.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class UserService extends AbstractService<User> {


    private UserRepository userRepository;

    public User update(UserRequestDto entity) throws Exception {

        User user = repository.getReferenceById(entity.getId());
        user.setFirsName(entity.getFirsName());
        user.setLastName(entity.getLastName());
        user.setSalary(entity.getSalary());



        return super.update(user);
    }
}
