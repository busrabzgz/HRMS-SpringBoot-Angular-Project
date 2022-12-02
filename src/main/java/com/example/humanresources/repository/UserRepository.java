package com.example.humanresources.repository;



import com.example.humanresources.dto.responseDTO.UserDto;
import com.example.humanresources.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends GenericRepository<User> {

}
