package com.birkil.hospitalmonitoring.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
@Table(name = "meslekHastaligiRapor")
public class MeslekHastaligiRapor {

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

    @Column(name = "hastaneYatisTarihi")
    private LocalDate hastaneYatisTarihi;

    @Column(name = "hastaneCikisTarihi")
    private LocalDate hastaneCikisTarihi;

    @Column(name = "nuks", length = 1)
    private String nuks;

    @Column(name = "yatisDevam", length = 1, nullable = false)
    private String yatisDevam;

    @Column(name = "yaraninTuru")
    private String yaraninTuru;

    @Column(name = "yaraninYeri")
    private String yaraninYeri;

    @Column(name = "taburcuTarihi")
    private LocalDate taburcuTarihi;

    @Column(name = "taburcuKodu")
    private int taburcuKodu;


}
