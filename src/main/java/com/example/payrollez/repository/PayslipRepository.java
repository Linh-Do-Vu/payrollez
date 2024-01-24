package com.example.payrollez.repository;

import com.example.payrollez.model.Payslip;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PayslipRepository extends JpaRepository<Payslip,Long> {
}
