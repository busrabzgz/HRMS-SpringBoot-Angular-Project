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
public class Leave  extends AbstractEntity{


    private String name;
    private LocalDateTime startOfLeave;
    private LocalDateTime endOfLeave;
    private String description;

    @Enumerated
    private LeaveEnum type;


    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;



}
