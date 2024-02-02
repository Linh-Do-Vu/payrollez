package com.example.payrollez.controller;

import com.example.payrollez.model.AllowanceType;
import com.example.payrollez.service.AllowanceType.IAllowanceTypeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("allowance-types")
public class AllowanceTypeController {
    private final IAllowanceTypeService allowanceTypeService;

    @GetMapping("/all")
    public ResponseEntity<?> findAllAllowance() {
        return new ResponseEntity<>(allowanceTypeService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{allowancetypeid}")
    public ResponseEntity<?> findAllowanceTypeById(@PathVariable(value = "allowancetypeid") Long allowanceId) {
        return new ResponseEntity<>(allowanceTypeService.findById(allowanceId), HttpStatus.OK);
    }

    @PutMapping("/{allowancetypeid}")
    public ResponseEntity<?> updateAllowanceType(@RequestBody AllowanceType allowanceType,@PathVariable (value = "allowancetypeid") Long allowancetypeid) {
        allowanceType.setAllowanceTypeId(allowancetypeid);
        return new ResponseEntity<>(allowanceTypeService.save(allowanceType), HttpStatus.OK);
    }


}
