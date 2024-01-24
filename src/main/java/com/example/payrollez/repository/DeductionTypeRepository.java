package com.example.payrollez.repository;

import com.example.payrollez.model.DeductionType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeductionTypeRepository extends JpaRepository<DeductionType,Long> {
}
