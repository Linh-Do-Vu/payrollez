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
}
