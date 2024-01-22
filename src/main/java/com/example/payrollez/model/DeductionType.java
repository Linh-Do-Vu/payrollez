package com.example.payrollez.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "deductiontype")
public class DeductionType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long deductionTypeId;
    private String name;
    private String description;
}
