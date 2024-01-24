package com.example.payrollez.repository;

import com.example.payrollez.model.HistorySalary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HistorySalaryRepository extends JpaRepository<HistorySalary,Long> {
}
