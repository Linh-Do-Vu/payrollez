package com.example.payrollez.service.Deduction;

import com.example.payrollez.model.Deduction;
import com.example.payrollez.repository.DeductionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class DeductionService implements IDeductionService {
  private final DeductionRepository deductionRepository ;
    @Override
    public Optional<Deduction> findById(Long aLong) {
        return deductionRepository.findById(aLong);
    }

    @Override
    public List<Deduction> findAll() {
        return deductionRepository.findAll();
    }

    @Override
    public Deduction save(Deduction deduction) {
        return deductionRepository.save(deduction);
    }

    @Override
    public void delete(Long aLong) {
deductionRepository.deleteById(aLong);
    }
}
