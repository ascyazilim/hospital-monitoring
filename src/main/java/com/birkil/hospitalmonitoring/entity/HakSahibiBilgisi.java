package com.birkil.hospitalmonitoring.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
@Table(name = "hakSahibiBilgisi")
public class HakSahibiBilgisi {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 11)
    private String tckimlikNo;

    @Column
    private String karneNo;

    @Column
    private String sosyalGuvenlikNo;

    @Column(length = 4)
    private String yakinlikKodu;

    @Column(length = 1, nullable = false)
    private String sigortaliTuru;

    @Column(length = 1, nullable = false)
    private String devredilenKurum;


    @Column(length = 1, nullable = false)
    private String provizyonTipi;

    @Column(nullable = false)
    private LocalDate provizyonTarihi;

    @Column(length = 50)
    private String adi;

    @Column(length = 50)
    private String soyadi;

    @Column(length = 100)
    private String adres;

    @Column(length = 50)
    private String telefon;

    @Column(length = 50)
    private String bagliBulunanBirim;

    @Column(length = 50)
    private String emeklimi;


}
