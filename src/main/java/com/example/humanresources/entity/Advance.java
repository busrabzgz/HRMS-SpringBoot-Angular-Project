package com.example.humanresources.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@EqualsAndHashCode
@ToString
public class Advance {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private LocalDateTime createDate = LocalDateTime.now();
    @Version
    @Column(columnDefinition = "integer DEFAULT 0", nullable = false)
    private Long version = 0L;

    private Long id;
    private BigDecimal amount;
    private LocalDateTime date;
    private Integer repayment;
    private String description;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;








}
