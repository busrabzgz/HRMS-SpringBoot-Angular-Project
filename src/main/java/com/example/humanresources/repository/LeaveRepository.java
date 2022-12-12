package com.example.humanresources.repository;

import com.example.humanresources.entity.Leave;
import com.example.humanresources.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LeaveRepository extends JpaRepository<Leave,Long> {
    List<Leave> getByUserId(User user);
}
