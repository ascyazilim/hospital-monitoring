package com.birkil.hospitalmonitoring.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "doctor")
public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "surName", nullable = false)
    private String surName;

    @Column(name = "departmentId", insertable = false, updatable = false, nullable = false)
    private Long departmentId;

    @ManyToOne
    @JoinColumn(name="departmentId")
    private Department department;

}
