package com.example.humanresources.repository;

import com.example.humanresources.entity.Charge;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChargesRepository extends JpaRepository<Charge,Long> {
}
