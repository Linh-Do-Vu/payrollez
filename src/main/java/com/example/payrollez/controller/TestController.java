package com.example.payrollez.controller;

import com.example.payrollez.repository.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequiredArgsConstructor
@RequestMapping("person")
public class TestController {
    private final PersonRepository repository ;
    @GetMapping("test")
    ResponseEntity<?> tss () {
        return new ResponseEntity<>(repository.findAll(), HttpStatus.OK);
    }
}
