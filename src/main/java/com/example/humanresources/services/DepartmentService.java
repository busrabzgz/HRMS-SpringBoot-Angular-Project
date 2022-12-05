package com.example.humanresources.services;


import com.example.humanresources.dto.requestDTO.DepartmentRequestDto;
import com.example.humanresources.dto.responseDTO.DepartmentResponseDto;
import com.example.humanresources.entity.Department;
import com.example.humanresources.repository.DepartmentRepository;
import com.example.humanresources.repository.UserRepository;
import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class DepartmentService extends AbstractService<Department, DepartmentRequestDto, DepartmentResponseDto> {

    private UserRepository userRepository;
    private DepartmentRepository departmentRepository;

//    public Department createCharge(Department department) {
//        Department newDepartment = new Department();
//        newDepartment.setUser(userRepository.getReferenceById(department.getUser().getId()));
//        return departmentRepository.save(newDepartment);
//    }

//    public Department saveDepartment(Department department) {
//        Department newDepartment = new Department();
//        newDepartment.setEmployees(userRepository.findAllById(department.getEmployees().stream().map(em -> em.getId()).collect(Collectors.toList())));
//        return departmentRepository.save(newDepartment);
//    }
//    public void deleteByDepartmentId(Long id){
//        departmentRepository.deleteById(id);
//    }
//    public List<Department> findAlDepartment(){
//        return departmentRepository.findAll();
//    }
//    public Optional<Department> findDepartmentById(Long id){
//        return departmentRepository.findById(id);
//    }



}
