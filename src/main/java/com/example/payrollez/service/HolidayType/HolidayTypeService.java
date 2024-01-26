package com.example.payrollez.service.HolidayType;

import com.example.payrollez.model.HolidayType;
import com.example.payrollez.repository.HolidayTypeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class HolidayTypeService implements IHolidayTypeService {
    private final HolidayTypeRepository holidayTypeRepository ;

    @Override
    public Optional<HolidayType> findById(Long aLong) {
        return holidayTypeRepository.findById(aLong);
    }

    @Override
    public List<HolidayType> findAll() {
        return holidayTypeRepository.findAll();
    }

    @Override
    public HolidayType save(HolidayType holidayType) {
        return holidayTypeRepository.save(holidayType);
    }

    @Override
    public void delete(Long aLong) {
holidayTypeRepository.deleteById(aLong);
    }
}
