package com.example.humanresources.repository;

import com.example.humanresources.entity.Department;
import com.example.humanresources.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department,Long> {
}
