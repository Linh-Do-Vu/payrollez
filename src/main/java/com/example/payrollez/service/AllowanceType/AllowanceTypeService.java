package com.example.payrollez.service.AllowanceType;

import com.example.payrollez.model.Allowance;
import com.example.payrollez.model.AllowanceType;
import com.example.payrollez.repository.AllowanceTypeRepository;
import com.example.payrollez.service.Allowance.IAllowanceService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AllowanceTypeService implements IAllowanceTypeService {
    private final AllowanceTypeRepository allowanceTypeRepository ;

    @Override
    public Optional<AllowanceType> findById(Long aLong) {
        return allowanceTypeRepository.findById(aLong);
    }

    @Override
    public List<AllowanceType> findAll() {
        return allowanceTypeRepository.findAll();
    }

    @Override
    public AllowanceType save(AllowanceType allowanceType) {
        return allowanceTypeRepository.save(allowanceType);
    }

    @Override
    public void delete(Long aLong) {
        allowanceTypeRepository.deleteById(aLong);
    }
}
