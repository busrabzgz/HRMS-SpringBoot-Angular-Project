package com.example.humanresources.repository;

import com.example.humanresources.entity.Leave;
import com.example.humanresources.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface LeaveRepository extends JpaRepository<Leave,Long> {
    List<Leave> findAllByUserId(Long id);
}
