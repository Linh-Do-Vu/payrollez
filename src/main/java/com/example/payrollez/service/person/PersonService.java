package com.example.payrollez.service.person;

import com.example.payrollez.model.Person;
import com.example.payrollez.repository.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PersonService implements IPersonService {
    private final PersonRepository personRepository;


    @Override
    public Optional<Person> findById(Long aLong) {
        return personRepository.findById(aLong);
    }

    @Override
    public List<Person> findAll() {
        return personRepository.findAll();
    }

    @Override
    public Person save(Person person) {
        return personRepository.save(person);
    }

    @Override
    public void delete(Long aLong) {
        personRepository.deleteById(aLong);
    }
}
