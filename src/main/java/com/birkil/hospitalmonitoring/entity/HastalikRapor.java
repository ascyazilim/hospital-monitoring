package com.birkil.hospitalmonitoring.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
@Table
public class HastalikRapor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "baslangicTarihi")
    private LocalDate baslangicTarihi;

    @Column(name = "bitisTarihi")
    private LocalDate bitisTarihi;

    @Column(name = "raporDurumu", length = 1)
    private String raporDurumu;

    @Column(name = "isKontTarihi", nullable = false)
    private LocalDate isKontTarihi;

    @Column(name = "nuks")
    private String nuks;

    @Column(name = "hastaneYatisTarihi")
    private LocalDate hastaneYatisTarihi;

    @Column(name = "hastaneCikisTarihi")
    private LocalDate hastaneCikisTarihi;

    @Column(name = "yatisDevam", length = 1, nullable = false)
    private String yatisDevam;

    @Column(name = "taburcuTarihi")
    private LocalDate taburcuTarihi;

    @Column(name = "taburcuKodu")
    private int taburcuKodu;








}
