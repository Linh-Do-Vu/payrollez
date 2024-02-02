package com.example.payrollez.service.Payslip;

import com.example.payrollez.model.Payslip;
import com.example.payrollez.repository.PayslipRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PayslipService implements IPayslipService {
    private final PayslipRepository payslipRepository;

    @Override
    public Optional<Payslip> findById(Long aLong) {
        return payslipRepository.findById(aLong);
    }

    @Override
    public List<Payslip> findAll() {
        return payslipRepository.findAll();
    }

    @Override
    public Payslip save(Payslip payslip) {
        return payslipRepository.save(payslip);
    }

    @Override
    public void delete(Long aLong) {
        payslipRepository.deleteById(aLong);
    }
}
