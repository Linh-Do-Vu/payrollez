package com.example.payrollez.service.Holiday;

import com.example.payrollez.model.Holiday;
import com.example.payrollez.service.IService;

import java.util.List;
import java.util.Optional;

public interface IHolidayService extends IService<Holiday,Long> {
    @Override
    Optional<Holiday> findById(Long aLong);

    @Override
    List<Holiday> findAll();

    @Override
    Holiday save(Holiday holiday);

    @Override
    void delete(Long aLong);
}
