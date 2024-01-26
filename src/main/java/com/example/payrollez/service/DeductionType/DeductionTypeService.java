package com.example.payrollez.service.DeductionType;

import com.example.payrollez.model.DeductionType;
import com.example.payrollez.repository.DeductionTypeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class DeductionTypeService implements IDeductionTypeService {
    private final DeductionTypeRepository deductionTypeRepository;

    @Override
    public Optional<DeductionType> findById(Long aLong) {
        return deductionTypeRepository.findById(aLong);
    }

    @Override
    public List<DeductionType> findAll() {
        return deductionTypeRepository.findAll();
    }

    @Override
    public DeductionType save(DeductionType deductionType) {
        return deductionTypeRepository.save(deductionType);
    }

    @Override
    public void delete(Long aLong) {
        deductionTypeRepository.deleteById(aLong);
    }
}
