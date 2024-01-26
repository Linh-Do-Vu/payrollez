package com.example.payrollez.service.HistorySalary;

import com.example.payrollez.model.HistorySalary;
import com.example.payrollez.repository.HistorySalaryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class HistorySalaryService implements IHistorySalaryService{
    private final HistorySalaryRepository historySalaryRepository;
    @Override
    public Optional<HistorySalary> findById(Long aLong) {
        return historySalaryRepository.findById(aLong);
    }

    @Override
    public List<HistorySalary> findAll() {
        return historySalaryRepository.findAll();
    }

    @Override
    public HistorySalary save(HistorySalary historySalary) {
        return historySalaryRepository.save(historySalary);
    }

    @Override
    public void delete(Long aLong) {
historySalaryRepository.deleteById(aLong);
    }
}
