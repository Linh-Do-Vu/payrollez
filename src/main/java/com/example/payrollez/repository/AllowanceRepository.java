package com.example.payrollez.repository;

import com.example.payrollez.model.Allowance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AllowanceRepository extends JpaRepository<Allowance,Long> {
}
