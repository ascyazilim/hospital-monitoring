package com.birkil.hospitalmonitoring.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
@Table(name = "tesisYatakBilgi")
public class TesisYatakBilgi {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 15)
    private String yatakKodu;

    @Column(length = 1)
    private String turu;

    @Column
    private int tescilTuru;

    @Column
    private int seviye;

    @Column
    private LocalDate gecerlilikBaslangicTarihi;

    @Column
    private LocalDate gecerlilikBitisTarihi;
}
