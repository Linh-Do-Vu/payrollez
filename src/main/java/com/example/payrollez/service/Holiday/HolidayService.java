package com.example.payrollez.service.Holiday;

import com.example.payrollez.model.Holiday;
import com.example.payrollez.repository.HolidayRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

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



}
