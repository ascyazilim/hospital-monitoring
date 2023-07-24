package com.birkil.hospitalmonitoring.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@Table(name = "ilacRaporDuzelt")
public class IlacRaporDuzelt {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 20, nullable = false)
    private String drTescilNo;

    @Column(length = 2000, nullable = false)
    private String duzeltmeBilgisi;

    @Column(nullable = false)
    private LocalDate duzeltmeTarihi;

    @Column(length = 20, nullable = false)
    private String raporNo;

    @Column(nullable = false)
    private LocalDate raporTarihi;

    @Column(length = 1, nullable = false)
    private String raporTuru;

    @Column(nullable = false)
    private int tesisKodu;

    @OneToMany
    @JoinColumn(name = "raporEtkinMaddeler")
    private List<RaporEtkinMadde> raporEtkinMaddeler;

    @OneToMany
    @JoinColumn(name = "tanilar")
    private List<TaniBilgisi> tanilar;

    @OneToMany
    @JoinColumn(name = "ilacTeshisler")
    private List<IlacTeshisBilgi> ilacTeshisler;


}
