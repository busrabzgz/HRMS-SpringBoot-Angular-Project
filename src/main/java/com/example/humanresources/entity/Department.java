package com.example.humanresources.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    private String departmentName;
    private String place;
    private String type;
    private String description;

    @OneToMany(mappedBy = "department",fetch = FetchType.LAZY)
    private List<User>  employees;



}
