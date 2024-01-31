package com.example.payrollez.controller;

import com.example.payrollez.service.person.IPersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequiredArgsConstructor
@RequestMapping("")
public class PersonController {
    private final IPersonService personService;
    @GetMapping("")
    ResponseEntity<?> tss () {
        return new ResponseEntity<>(personService.findAll(), HttpStatus.OK);
    }
}
