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
//    create table Payroll ( -- tạo thời gian trả lương cho toàn bộ nhân viên theo tháng
//            id int IDENTITY(1,1) primary key,
//    refNo varchar(255), -- tự sinh ví dụ (date = 01/2024 <=> thang1/2024)
//    date dateTime,-- tạo tháng trả lương
//    status tinyint, --trạng thái (1: tạo mới, 2: caculated)
//    createAt datetime -- thời gian tạo bản ghi
//
}