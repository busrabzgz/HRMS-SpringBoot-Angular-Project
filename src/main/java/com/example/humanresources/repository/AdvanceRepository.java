package com.example.humanresources.repository;

import com.example.humanresources.entity.Advance;

import com.example.humanresources.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.util.List;
@Repository
public interface AdvanceRepository extends JpaRepository<Advance,Long> {
//    @Query(value = "select ex from Advance ex where ex.user = ?1")
    List<Advance> getByUser(User user);
}
