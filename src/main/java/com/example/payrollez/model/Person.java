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
@Table(name = "crm_person")
public class Person {
    @Id
    @Column(name = "personid")
    private Long id;
    @Column(name = "code")
    private String code;
    @Column(name = "salary")
    private float salary;
    @Column(name = "startdate")
    private LocalDateTime startDate;
    @Column(name = "enddate")
    private LocalDateTime endDate;
    @Column(name = "departmentid")
    private Long departmentId;
    @Column(name = "positionid")
    private Long positionId;
    @Column(name = "isactive")
    private boolean isActive;
//    create table Person ( -- nhân viên
//	id int IDENTITY(1,1) primary key,
//    code varchar(255), -- mã nhân viên tự sinh, example: NV001, NV002
//    salary float, -- mức lương nhân viên (gross)
//    startDate datetime, -- thời gian bắt đầu đi làm
//    endDate datetime, -- thời gian nghỉ làm
//    isActive bit DEFAULT 1, -- còn hoạt động không phụ thuộc vào endDate
//    departmentId int,
//    positionId int,
//    constraint fk_department_person foreign key (departmentId) references Department(id),
//    constraint fk_position_person foreign key (positionId) references Position(id),
//            );
//    go
}
