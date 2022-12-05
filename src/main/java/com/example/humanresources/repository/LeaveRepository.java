package com.example.humanresources.repository;

import com.example.humanresources.entity.Leave;
import com.example.humanresources.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LeaveRepository extends JpaRepository<Leave,Long> {
}
