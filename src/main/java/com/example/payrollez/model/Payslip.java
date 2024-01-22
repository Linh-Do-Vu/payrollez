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
@Table(name = "Payslip")
public class Payslip {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "payslipid")
    private Long payslipId;

    @Column(name = "leavepaid")
    private Long leavePaid;

    @Column(name = "leaveunpaid")
    private Long leaveUnpaid;

    @Column(name = "absent")
    private Long absent;

    @Column(name = "allowanceamount")
    private Float allowanceAmount;

    @Column(name = "deductionamount")
    private Float deductionAmount;

    @Column(name = "taxamount")
    private Float taxAmount;

    @Column(name = "advanceamount")
    private Float advanceAmount;

    @Column(name = "net")
    private Float net;

    @Column(name = "accumulate_days_off")
    private Double accumulateDaysOff;

    @Column(name = "first_pay_day")
    private LocalDateTime firstPayDay;

    @Column(name = "second_pay_day")
    private LocalDateTime secondPayDay;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "person_id")
    private Long personId;

    @Column(name = "payroll_id")
    private Long payrollId;
}
