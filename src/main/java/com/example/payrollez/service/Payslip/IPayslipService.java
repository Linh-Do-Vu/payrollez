package com.example.payrollez.service.Payslip;

import com.example.payrollez.model.Payslip;
import com.example.payrollez.service.IService;

import java.util.List;
import java.util.Optional;

public interface IPayslipService extends IService<Payslip,Long> {
    @Override
    Optional<Payslip> findById(Long aLong);

    @Override
    List<Payslip> findAll();

    @Override
    Payslip save(Payslip payslip);

    @Override
    void delete(Long aLong);
}
