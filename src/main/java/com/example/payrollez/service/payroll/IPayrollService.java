package com.example.payrollez.service.payroll;

import com.example.payrollez.model.Payroll;
import com.example.payrollez.service.IService;

import java.util.List;
import java.util.Optional;

public interface IPayrollService extends IService<Payroll,Long>{
    @Override
    Optional<Payroll> findById(Long aLong);

    @Override
    List<Payroll> findAll();

    @Override
    Payroll save(Payroll payroll);

    @Override
    void delete(Long aLong);
}
