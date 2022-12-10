package com.example.humanresources.entity;

import com.example.humanresources.enums.ExpenseReceiptEnum.CategoryEnum;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@EqualsAndHashCode
@ToString
public class Receipt {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private LocalDateTime createDate = LocalDateTime.now();
    @Version
    @Column(columnDefinition = "integer DEFAULT 0", nullable = false)
    private Long version = 0L;

    private byte[] billImage;

    @Enumerated
    private CategoryEnum category;
    private BigDecimal amount;

    private LocalDate dateOfReceipt;

    private String salesTaxRate;
    private String description;


    @ManyToOne
    @JoinColumn(name = "expense_id")
    private Expense expense;


}
