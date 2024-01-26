package com.example.payrollez.service.Attendance;

import com.example.payrollez.model.Attendance;
import com.example.payrollez.service.IService;

import java.util.List;
import java.util.Optional;

public interface IAttendanceService extends IService<Attendance,Long> {
    @Override
    Optional<Attendance> findById(Long aLong);

    @Override
    List<Attendance> findAll();

    @Override
    Attendance save(Attendance attendance);

    @Override
    void delete(Long aLong);
}
