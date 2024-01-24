package com.example.payrollez.repository;

import com.example.payrollez.model.HolidayType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HolidayTypeRepository extends JpaRepository<HolidayType,Long> {
}
