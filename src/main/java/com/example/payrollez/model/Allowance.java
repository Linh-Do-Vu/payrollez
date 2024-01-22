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
@Table(name = "Allowance")
public class Allowance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "allowanceid")
    private Long allowanceId;

    @Column(name = "amount")
    private Float amount;

    @Column(name = "startdate")
    private LocalDateTime startDate;

    @Column(name = "enddate")
    private LocalDateTime endDate;

    @Column(name = "createdat")
    private LocalDateTime createdAt;

    @Column(name = "personid")
    private Long personId;

    @Column(name = "allowancetypeid")
    private Long allowanceTypeId;
}
