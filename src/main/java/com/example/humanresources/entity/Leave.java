package com.example.humanresources.entity;


import com.example.humanresources.enums.LeaveEnum;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Leave  {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private LocalDateTime createDate = LocalDateTime.now();
    @Version
    @Column(columnDefinition = "integer DEFAULT 0", nullable = false)
    private Long version = 0L;


    @Enumerated
    private LeaveEnum type;

    private Integer totalDays;
    private LocalDateTime startOfLeave;
    private LocalDateTime endOfLeave;
    private String description;
    private LocalDateTime dateOfReturn;




    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;



}
