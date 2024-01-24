package com.example.payrollez.repository;

import com.example.payrollez.model.AllowanceType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AllowanceTypeRepository extends JpaRepository<AllowanceType,Long> {
}
