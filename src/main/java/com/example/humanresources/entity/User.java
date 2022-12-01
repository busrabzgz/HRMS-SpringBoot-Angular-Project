package com.example.humanresources.entity;


import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name="user")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class User extends AbstractEntity{
    
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


//    @ManyToMany(cascade = { CascadeType.ALL })
//    @JoinTable(
//            name = "Users_Charges",
//            joinColumns = { @JoinColumn(name = "users_id") },
//            inverseJoinColumns = { @JoinColumn(name = "charges_id") }
//    )
//    private List<Charge> charges ;



//    @ManyToOne
//    private Department department;
//
//    @OneToMany(mappedBy = "employee")
//    private List<Leave> leaves;








}
