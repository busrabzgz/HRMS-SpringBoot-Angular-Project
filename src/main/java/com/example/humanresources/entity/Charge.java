package com.example.humanresources.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Charge {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private LocalDateTime createDate = LocalDateTime.now();
    @Version
    @Column(columnDefinition = "integer DEFAULT 0", nullable = false)
    private Long version = 0L;



    private String name;
    private LocalDateTime date;
    private String type;
    private String description;
    private BigDecimal price;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;


//    @OneToMany
//    private List<Charge> charges;

//    @ManyToMany(mappedBy = "charges")
//    private List<User> employees;







}
