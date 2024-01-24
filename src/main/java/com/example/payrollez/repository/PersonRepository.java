package com.example.payrollez.repository;

import com.example.payrollez.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableJpaRepositories
public interface PersonRepository extends JpaRepository<Person,Long> {

}
