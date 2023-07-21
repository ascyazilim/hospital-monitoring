package com.birkil.hospitalmonitoring.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
@Table(name = "analikRapor")
public class AnalikRapor {

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

    @Column(name = "bebekDogumTarihi", nullable = false)
    private LocalDate bebekDogumTarihi;

    @Column(name = "dogumOncBasTarihi", nullable = false)
    private LocalDate dogumOncBasTarihi;

    @Column(name = "canliCocukSayisi")
    private int canliCocukSayisi;

    @Column(name = "doganCocukSayisi")
    private int doganCocukSayisi;

    @Column(name = "norSezFor", length = 1, nullable = false)
    private String norSezFor;

    @Column(name = "yatisDevam", length = 1, nullable = false)
    private String yatisDevam;

    @Column(name = "aktarmaRaporVarmi", length = 1, nullable = false)
    private String aktarmaRaporVarmi;

    @Column(name = "aktarmaRaporTarihi", nullable = false)
    private LocalDate aktarmaRaporTarihi;

    @Column(name = "gebelikHaftasi")
    private int gebelikHaftasi;

    @Column(name = "taburcuTarihi")
    private LocalDate taburcuTarihi;

    @Column(name = "taburcuKodu")
    private int taburcuKodu;

    @Column(name = "analikRaporTipi")
    private int analikRaporTipi;

    @Column(name = "gebelikTipi")
    private int gebelikTipi;

    @Column(name = "gebelikHaftasi1")
    private int gebelikHaftasi1;

    @Column(name = "gebelikHaftasi2")
    private int gebelikHaftasi2;

    @Column(name = "bebekDogumHaftasi")
    private int bebekDogumHaftasi;

    @Column(name = "aktarmaHaftasi")
    private int aktarmaHaftasi;






}
