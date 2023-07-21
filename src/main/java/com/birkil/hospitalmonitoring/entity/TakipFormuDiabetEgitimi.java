package com.birkil.hospitalmonitoring.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "takipFormuDiabetEgitimi")
public class TakipFormuDiabetEgitimi {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private int bireyselEgitimSayisi;

    @Column(nullable = false)
    private int grupEgitimiSayisi;

    @Column(nullable = false)
    private String dmEgitimiAlmisMi;



}
