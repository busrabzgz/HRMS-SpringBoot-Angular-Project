package com.example.humanresources.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private LocalDateTime createDate = LocalDateTime.now();
    @Version
    @Column(columnDefinition = "integer DEFAULT 0", nullable = false)
    private Long version = 0L;


    private String departmentName;
    private String place;
    private String type;
    private String description;



    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private List<User>  user;



}
