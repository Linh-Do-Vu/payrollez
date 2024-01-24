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

//    create table Deduction (-- Khoản khấu trừ
//            id int IDENTITY(1,1) primary key,
//    amount float, -- số tiền
//    endDate datetime,-- thời gian kết thúc áp dụng
//    startdate datetime,-- thời gian bắt đầu áp dụng
//    createAt datetime, -- thời gian tạo bản ghi
//    personId int,
//    deductionTypeId tinyint,
//    constraint fk_person_deduction foreign key (personId) references Person(id),
//    constraint fk_deductionType_deduction foreign key (deductionTypeId) references Deduction_type(id),
//            );
//    go
}
