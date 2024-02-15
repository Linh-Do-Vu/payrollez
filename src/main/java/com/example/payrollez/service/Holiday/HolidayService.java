package com.example.payrollez.service.Holiday;

import com.example.payrollez.model.Constant;
import com.example.payrollez.model.Holiday;
import com.example.payrollez.repository.HolidayRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class HolidayService implements IHolidayService{
    private final HolidayRepository holidayRepository ;
    @Override
    public Optional<Holiday> findById(Long aLong) {
        return holidayRepository.findById(aLong);
    }

    @Override
    public List<Holiday> findAll() {
        return holidayRepository.findAll();
    }

    @Override
    public Holiday save(Holiday holiday) {
        return holidayRepository.save(holiday);
    }

    @Override
    public void delete(Long aLong) {
    holidayRepository.deleteById(aLong);
    }

    @Override
    public List<Holiday> autoCreateHolidayInMonth() {
        LocalDateTime currentDateTime = LocalDateTime.now();
        int lastDayOfMonth = currentDateTime.toLocalDate().lengthOfMonth();
        List<Holiday> holidayInMonth = new ArrayList<>() ;
        for (int day = 1; day <= lastDayOfMonth; day++) {
            LocalDateTime dateTime = currentDateTime.toLocalDate().atTime(0, 0).withDayOfMonth(day);
            DayOfWeek dayOfWeek = dateTime.getDayOfWeek();

            if (dayOfWeek == DayOfWeek.SUNDAY || dayOfWeek == DayOfWeek.SATURDAY||day == 1 && dateTime.getMonthValue() == 1) {
                Holiday freeDay = new Holiday() ;
                freeDay.setHolidayTypeId(Constant.HOLIDAY_TYPE);
                freeDay.setDate(dateTime);
                holidayInMonth.add(save(freeDay)) ;
            }
        }
        return holidayInMonth;
    }
}
