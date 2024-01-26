package com.example.payrollez.service.HistorySalary;

import com.example.payrollez.model.HistorySalary;
import com.example.payrollez.service.IService;

import java.util.List;
import java.util.Optional;

public interface IHistorySalaryService extends IService<HistorySalary,Long> {
    @Override
    Optional<HistorySalary> findById(Long aLong);

    @Override
    List<HistorySalary> findAll();

    @Override
    HistorySalary save(HistorySalary historySalary);

    @Override
    void delete(Long aLong);
}
