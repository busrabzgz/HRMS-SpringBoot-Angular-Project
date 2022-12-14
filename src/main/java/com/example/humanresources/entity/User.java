package com.example.humanresources.entity;


import com.example.humanresources.enums.*;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="employee")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private LocalDateTime createDate = LocalDateTime.now();
    @Version
    @Column(columnDefinition = "integer DEFAULT 0", nullable = false)
    private Long version = 0L;
    private String firstName;
    private String lastName;
    private String citizenNumber;

    private Date birthOfDate;

    private BigDecimal salary;

    private LocalDateTime startToWork;



    @Enumerated
    private DepartmentEnum department;
    @Enumerated
    private GenderTypeEnum gender;

    @Enumerated
    private PositionTypeEnum position;

    @Enumerated
    private LevelTypeEnum level;
    private String email;
    private String phoneNumber;
    private String address;

    @Override
    public String toString() {
        return "User{" +
                "firsName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", citizenNumber='" + citizenNumber + '\'' +
                ", gender='" + gender + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                ", level='" + level + '\'' +
                ", email='" + email + '\'' +
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

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "user")
    private List<Expense> expense;

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "user")
    private List<OvertimeWork> overtimeWork;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
    private List<Leave> leaves;

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "user")
    private List<Advance> advances;

}
