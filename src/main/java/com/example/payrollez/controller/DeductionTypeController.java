package com.example.payrollez.controller;

import com.example.payrollez.model.AllowanceType;
import com.example.payrollez.model.DeductionType;
import com.example.payrollez.service.AllowanceType.IAllowanceTypeService;
import com.example.payrollez.service.Deduction.IDeductionService;
import com.example.payrollez.service.DeductionType.IDeductionTypeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("deduction-types")
public class DeductionTypeController {
    private final IDeductionTypeService deductionService;

    @GetMapping("/all")
    public ResponseEntity<?> findAllAllowance() {
        return new ResponseEntity<>(deductionService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{deductionTypeId}")
    public ResponseEntity<?> findAllowanceTypeById(@PathVariable(value = "deductionTypeId") Long allowanceId) {
        return new ResponseEntity<>(deductionService.findById(allowanceId), HttpStatus.OK);
    }

    @PutMapping("/{deductionTypeId}")
    public ResponseEntity<?> updateAllowanceType(@RequestBody DeductionType deductionType, @PathVariable (value = "deductionTypeId") Long deductionTypeId) {
        deductionType.setDeductionTypeId(deductionTypeId);
        return new ResponseEntity<>(deductionService.save(deductionType), HttpStatus.OK);
    }


}
