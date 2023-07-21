package com.birkil.hospitalmonitoring.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "yesilKartliHastaGiris")
public class YesilKartliSevkliHastaGiris {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "hastaTcKimlikNo", length = 10, nullable = false)
    private String hastaTcKimNo;

    @Column(name = "tesisKodu", nullable = false)
    private int tesisKodu;
}
