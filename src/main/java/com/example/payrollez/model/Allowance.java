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

//    create table Allowance ( -- Khoản phụ cấp
//            id int IDENTITY(1,1) primary key,
//    amount float, -- số tiền
//    endDate datetime,-- thời gian kết thúc áp dụng
//    startdate datetime,-- thời gian bắt đầu áp dụng
//    createAt datetime,-- thời gian tạo bản ghi
//    personId int,
//    allowanceTypeId tinyint,
//    constraint fk_person_allowance foreign key (personId) references Person(id),
//    constraint fk_allowance_type_allowance foreign key (allowanceTypeId) references Allowance_type(id),
//            );
//    go

}
