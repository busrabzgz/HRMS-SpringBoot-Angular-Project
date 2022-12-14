package com.example.humanresources.repository;

import com.example.humanresources.entity.OvertimeWork;
import com.example.humanresources.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface OvertimeWorkRepository extends JpaRepository<OvertimeWork,Long> {
    List<OvertimeWork> getOvertimeByUserId(Long id);
}
