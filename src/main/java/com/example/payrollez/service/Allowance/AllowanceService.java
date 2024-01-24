package com.example.payrollez.service.Allowance;

import com.example.payrollez.model.Allowance;
import com.example.payrollez.repository.AllowanceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AllowanceService implements IAllowanceService {
    private final AllowanceRepository allowanceRepository;

    @Override
    public Optional<Allowance> findById(Long aLong) {
        return allowanceRepository.findById(aLong);
    }

    @Override
    public List<Allowance> findAll() {
        return allowanceRepository.findAll();
    }

    @Override
    public Allowance save(Allowance allowance) {
        return allowanceRepository.save(allowance);
    }

    @Override
    public void delete(Long aLong) {
        allowanceRepository.deleteById(aLong);
    }
}
