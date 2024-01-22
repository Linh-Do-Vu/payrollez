package com.example.payrollez.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "allowancetype")
public class AllowanceType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "allowancetypeid")
    private Long allowanceTypeId;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;
}
