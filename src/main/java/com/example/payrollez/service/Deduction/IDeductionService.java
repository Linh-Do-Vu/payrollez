package com.example.payrollez.service.Deduction;

import com.example.payrollez.model.Deduction;
import com.example.payrollez.service.IService;

import java.util.List;
import java.util.Optional;

public interface IDeductionService extends IService<Deduction,Long> {
    @Override
    Optional<Deduction> findById(Long aLong);

    @Override
    List<Deduction> findAll();

    @Override
    Deduction save(Deduction deduction);

    @Override
    void delete(Long aLong);
}
