package com.example.payrollez.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "holidaytype")
public class HolidayType {
    @Id
    @Column(name = "holidaytypeid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long holidayTypeId;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;
}
