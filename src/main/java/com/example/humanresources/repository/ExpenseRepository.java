package com.example.humanresources.repository;

import com.example.humanresources.entity.Expense;
import com.example.humanresources.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;

public interface ExpenseRepository extends JpaRepository<Expense,Long> {

    @Query(value = "select ex from Expense ex where ex.user = ?1")
    List<Expense> getByUser(User user);
}
