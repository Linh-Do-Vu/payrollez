package com.example.payrollez.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "deductiontype")
public class DeductionType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long deductionTypeId;
    private String name;
    private String description;
//    create table Deduction_type ( -- Loại khấu trừ
//            id tinyint primary key, --(1: Bảo hiểm,2: giảm trừ gia cảnh, ...)
//    name varchar(255), -- tên
//    description varchar(255) -- chi tiết
//);
//    go
}
