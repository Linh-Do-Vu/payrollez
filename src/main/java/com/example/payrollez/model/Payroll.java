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
@Table(name = "payroll")
public class Payroll {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "payrollid")
    private Long payrollId;

    @Column(name = "refno")
    private String refNo;

    @Column(name = "date")
    private LocalDateTime date;

    @Column(name = "status")
    private Boolean status;

    @Column(name = "createdat")
    private LocalDateTime createdAt;
}