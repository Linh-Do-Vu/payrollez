package com.example.payrollez.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "historysalary")
public class HistorySalary {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "salaryid")
    private Long salaryId;
    @Column(name = "amount")
    private float amount;
    @Column(name = "startdate")
    private Date startDate;
    @Column(name = "enddate")
    private Date endDate;
    @Column(name = "personId")
    private Long personId;
//    create table Salary ( -- lịch sử tăng giảm lương
//            id int IDENTITY(1,1) primary key,
//    amount float, -- số tiền
//    startDate datetime, -- từ ngày
//    endDate datetime, --đén ngày
//    personId int,
//    constraint fk_person_salary foreign key (personId) references Person(id),
//            );
//    go
}
