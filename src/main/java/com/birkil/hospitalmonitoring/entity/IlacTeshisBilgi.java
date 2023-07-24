package com.birkil.hospitalmonitoring.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@Table(name = "ilacTeshisBilgi")
public class IlacTeshisBilgi {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private LocalDate baslangicTarihi;

    @Column(nullable = false)
    private LocalDate bitisTarihi;

    @Column(nullable = false)
    private int teshisKodu;

    @OneToMany
    @JoinColumn(name = "ICD10Kodu", nullable = false)
    private List<TaniBilgisi> taniBilgiler;




}
