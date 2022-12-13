package com.example.humanresources.repository;

import com.example.humanresources.entity.Receipt;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ReceiptRepository extends JpaRepository<Receipt,Long> {
    List<Receipt> findAllByExpense_Id(Long id);
}
