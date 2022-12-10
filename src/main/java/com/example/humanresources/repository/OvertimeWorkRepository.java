package com.example.humanresources.repository;

import com.example.humanresources.entity.OvertimeWork;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface OvertimeWorkRepository extends JpaRepository<OvertimeWork,Long> {
}
