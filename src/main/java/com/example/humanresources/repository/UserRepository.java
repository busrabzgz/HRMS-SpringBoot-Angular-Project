package com.example.humanresources.repository;



import com.example.humanresources.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface UserRepository extends JpaRepository<User,Long> {

    @Query("SELECT user FROM User user WHERE date_part('month', user.birthOfDate) = date_part('month', CURRENT_DATE)")
    List<User> getEmployeesBirthday();

}
