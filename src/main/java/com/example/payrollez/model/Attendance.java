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
@Table(name = "Attendance")
public class Attendance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "attendanceid")
    private Long attendanceId;

    @Column(name = "hoursworked")
    private Long hoursWorked;

    @Column(name = "status")
    private Long status;

    @Column(name = "date")
    private LocalDateTime date;

    @Column(name = "personid")
    private Long personId;

    @Column(name = "holidayid")
    private Long holidayId;

//    create table Attendance ( -- tham gia theo từng ngày
//            id int IDENTITY(1,1) primary key,
//    hoursWorked tinyint, --số giờ (mặc định sẽ là 8h, phụ thuộc vào status ví dụ status = 1 <=> số giờ trong ngày, 2,3,4 <=> 0
//                                   status tinyint, -- trạng thái phụ thuộc vào holiday, (1: có mặt, 2: nghỉ có lương, 3: nghỉ không lương, 4: nghỉ thông thường)
//    date datetime, -- ngày tham gia
//    personId int,
//    holidayId int,
//    constraint fk_person_attendance foreign key (personId) references Person(id),
//    constraint fk_holiday_attendance foreign key (holidayId) references Holiday(id),
//            );
//    go
}
