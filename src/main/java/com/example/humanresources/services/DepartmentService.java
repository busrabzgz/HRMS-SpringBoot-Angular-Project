package com.example.humanresources.services;


import com.example.humanresources.dto.requestDTO.DepartmentInfoRequestDto;
import com.example.humanresources.dto.responseDTO.DepartmentInfoResponseDto;
import com.example.humanresources.entity.Department;
import com.example.humanresources.entity.Department;
import com.example.humanresources.repository.DepartmentRepository;
import com.example.humanresources.repository.UserRepository;
import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class DepartmentService {

    private UserRepository userRepository;
    private DepartmentRepository departmentRepository;

    public DepartmentInfoResponseDto addDepartment(DepartmentInfoRequestDto departmentInfoRequestDto) {
        Department newDepartment = departmentRepository.getReferenceById(departmentInfoRequestDto.getId());
        return null;
    }
    
    public DepartmentInfoResponseDto updateDepartment(DepartmentInfoRequestDto departmentInfoRequestDto){
        Department department = departmentRepository.getReferenceById(departmentInfoRequestDto.getId());
        department.setDepartmentName(departmentInfoRequestDto.getDepartmentName());
        department.setPlace(departmentInfoRequestDto.getPlace());
        department.setType(departmentInfoRequestDto.getType());
        department.setDescription(departmentInfoRequestDto.getDescription());
        return null;
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

//    public Department saveDepartment(Department department) {
//        Department newDepartment = new Department();
//        newDepartment.setEmployees(userRepository.findAllById(department.getEmployees().stream().map(em -> em.getId()).collect(Collectors.toList())));
//        return departmentRepository.save(newDepartment);
//    }




}
