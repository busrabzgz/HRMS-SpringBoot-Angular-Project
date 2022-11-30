package com.example.humanresources.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name="employee")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    
    private String firsName;
    private String lastName;
    private String citizenNumber;
    private LocalDateTime birtOfDate;
    private LocalDateTime firstStartedWork;
    private String position;
    private BigDecimal salary;
    private String  level;
    private String email;
    
    private String password;

    @ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
            name = "Users_Charges",
            joinColumns = { @JoinColumn(name = "users_id") },
            inverseJoinColumns = { @JoinColumn(name = "charges_id") }
    )
    private List<Charge> charges ;

    @ManyToOne
    private Department department;

    @OneToMany(mappedBy = "employee")
    private List<Leave> leaves;








}
