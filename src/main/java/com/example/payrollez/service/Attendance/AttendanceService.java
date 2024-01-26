package com.example.payrollez.service.Attendance;

import com.example.payrollez.model.Attendance;
import com.example.payrollez.repository.AttendanceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AttendanceService implements IAttendanceService {
    private final AttendanceRepository attendanceRepository;

    @Override
    public Optional<Attendance> findById(Long aLong) {
        return attendanceRepository.findById(aLong);
    }

    @Override
    public List<Attendance> findAll() {
        return attendanceRepository.findAll();
    }

    @Override
    public Attendance save(Attendance attendance) {
        return attendanceRepository.save(attendance);
    }

    @Override
    public void delete(Long aLong) {
        attendanceRepository.deleteById(aLong);
    }
}
