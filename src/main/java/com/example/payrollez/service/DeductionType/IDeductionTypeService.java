package com.example.payrollez.service.DeductionType;

import com.example.payrollez.model.DeductionType;
import com.example.payrollez.service.IService;

import java.util.List;
import java.util.Optional;

public interface IDeductionTypeService extends IService<DeductionType,Long> {
    @Override
    Optional<DeductionType> findById(Long aLong);

    @Override
    List<DeductionType> findAll();

    @Override
    DeductionType save(DeductionType deductionType);

    @Override
    void delete(Long aLong);
}
