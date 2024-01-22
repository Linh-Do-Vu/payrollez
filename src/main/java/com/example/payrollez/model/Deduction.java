package com.example.payrollez.model;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Deduction")
public class Deduction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "deductionid")
    private Long deductionId;

    @Column(name = "amount")
    private Float amount;

    @Column(name = "startdate")
    private LocalDateTime startDate;

    @Column(name = "enddate")
    private LocalDateTime endDate;

    @Column(name = "createdat")
    private LocalDateTime createdAt;

    @Column(name = "personId")
    private Long personId;

    @Column(name = "deductionTypeId")
    private Long deductionTypeId;
}
