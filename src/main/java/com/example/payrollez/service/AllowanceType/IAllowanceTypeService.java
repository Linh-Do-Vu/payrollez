package com.example.payrollez.service.AllowanceType;

import com.example.payrollez.model.AllowanceType;
import com.example.payrollez.service.IService;

import java.util.List;
import java.util.Optional;

public interface IAllowanceTypeService extends IService<AllowanceType,Long> {
    @Override
    Optional<AllowanceType> findById(Long aLong);

    @Override
    List<AllowanceType> findAll();

    @Override
    AllowanceType save(AllowanceType allowanceType);

    @Override
    void delete(Long aLong);
}
