package com.example.payrollez.service.Payroll;

import com.example.payrollez.model.Payroll;
import com.example.payrollez.repository.PayrollRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PayrollService implements IPayrollService{
private final PayrollRepository payrollRepository ;


    @Override
    public Optional<Payroll> findById(Long aLong) {
        return payrollRepository.findById(aLong);
    }

    @Override
    public List<Payroll> findAll() {
        return payrollRepository.findAll();
    }

    @Override
    public Payroll save(Payroll payroll) {
        return payrollRepository.save(payroll);
    }

    @Override
    public void delete(Long aLong) {
payrollRepository.deleteById(aLong);
    }
}
