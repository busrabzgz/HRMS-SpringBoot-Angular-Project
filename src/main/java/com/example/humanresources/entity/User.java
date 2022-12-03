package com.example.humanresources.entity;


import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name="employee")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class User extends AbstractEntity{
    
    private String firsName;
    private String lastName;
    private String citizenNumber;
    private String gender;
    private String position;
    private BigDecimal salary;
    private String  level;
    private String email;
    private String password;

    @Override
    public String toString() {
        return "User{" +
                "firsName='" + firsName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", citizenNumber='" + citizenNumber + '\'' +
                ", gender='" + gender + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                ", level='" + level + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

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
