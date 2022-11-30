package com.example.humanresources.services;


import com.example.humanresources.entity.Charge;
import com.example.humanresources.entity.Department;
import com.example.humanresources.repository.DepartmentRepository;
import com.example.humanresources.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class DepartmentService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private DepartmentRepository departmentRepository;

    public Department saveDepartment(Department department) {
        Department newDepartment = new Department();
        newDepartment.setEmployees(userRepository.findAllById(department.getEmployees().stream().map(em -> em.getId()).collect(Collectors.toList())));
        return departmentRepository.save(newDepartment);
    }
    public void deleteByDepartmentId(Long id){
        departmentRepository.deleteById(id);
    }
    public List<Department> findAlDepartment(){
        return departmentRepository.findAll();
    }
    public Optional<Department> findDepartmentById(Long id){
        return departmentRepository.findById(id);
    }



}
