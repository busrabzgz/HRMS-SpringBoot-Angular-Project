package com.example.humanresources.entity;


import com.example.humanresources.enums.LeaveTypeEnum;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@EqualsAndHashCode
@ToString
public class Leave  {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private LocalDateTime createDate = LocalDateTime.now();
    @Version
    @Column(columnDefinition = "integer DEFAULT 0", nullable = false)
    private Long version = 0L;


    @Enumerated
    private LeaveTypeEnum type;

    private Integer totalDays;
    private LocalDateTime startOfLeave;
    private LocalDateTime endOfLeave;
    private String description;
    private LocalDateTime dateOfReturn;




    @ManyToOne
    private User user;



}
