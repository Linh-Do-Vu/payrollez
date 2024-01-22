package com.example.payrollez.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "crm_person")
public class Person {
    private Long id;
    private String code;
    private float salary;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private Long departmentId;
    private Long positionId;
    private boolean isActive;
}
