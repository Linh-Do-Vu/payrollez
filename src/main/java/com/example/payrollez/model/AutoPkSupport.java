package com.example.payrollez.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@Table(name = "auto_pk_support")
@AllArgsConstructor
@NoArgsConstructor
public class AutoPkSupport {
    @Id
    @Column
    private String tableName;
    @Column
    private Long nextId;
}
