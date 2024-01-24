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

//    create table Payslip ( -- Phiếu lương cho toàn bộ nhân viên theo tháng
//            id int IDENTITY(1,1) primary key,
//    leavePaid tinyint, --số ngày nghỉ có lương
//    leaveUnpaid tinyint, --số ngày nghỉ không lương
//    absent tinyint, --số ngày có mặt
//    allowanceAmount float, --tổng số tiền phụ cấp
//    deductionAmount float,--tổng số tiền khấu trừ
//    taxAmount float, -- thuế thu nhập cá nhân, cách tính (https://ketoanthienung.vn/cach-tinh-thue-thu-nhap-ca-nhan.htm)
//            advanceAmount float, -- số tiền tạm ứng
//                                                                  net float, -- số tiền lương thực nhận được
//                                                                  accumulateDaysOff tinyint, -- số ngày nghỉ lũy kế (tính theo ngày bắt đầu làm việc startDate của bảng Person)
//    fristPayDay datetime, -- ngày trả lương đợt 1
//    secondPayDay datetime,-- ngày trả lương đợt 2
//    createAt datetime, -- thời gian tạo bản ghi
//    personId int,
//    payrollId int,
//    constraint fk_person_payslip foreign key (personId) references Person(id),
//    constraint fk_payroll_payslip foreign key (payrollId) references Payroll(id),
}
