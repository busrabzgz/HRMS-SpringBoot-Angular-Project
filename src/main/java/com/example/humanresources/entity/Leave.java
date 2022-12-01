package com.example.humanresources.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Leave  extends AbstractEntity{


    private String name;
    private LocalDateTime startOfLeave;
    private LocalDateTime endOfLeave;
    private String description;
    private String type;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;



}
