package com.birkil.hospitalmonitoring.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@Table(name = "engellilikRapor")
public class EngellilikRapor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String raporTakipNo;

    @Column(length = 11, nullable = false)
    private String tckimlikNo;

    @Column(nullable = false)
    private byte fotograf;

    @Column(length = 8, nullable = false)
    private int tesisKodu;

    @Column
    private String takipNo;

    @Column(nullable = false)
    private LocalDate muracaatTarihi;

    @Column(nullable = false)
    private LocalDate raporTarihi;

    @Column(nullable = false)
    private LocalDate raporBitisTarihi;

    @Column(nullable = false)
    private String raporNo;

    @Column(nullable = false)
    private int muracaatTuru;

    @Column(nullable = false)
    private String muracaatNedeni;

    @Column(length = 100, nullable = false)
    private String basvuruNedeni;

    @Column
    private int durum;

    @Column(nullable = false)
    private String kurulBaskaniDrTescilNo;

    @Column(length = 1000, nullable = false)
    private String aciklama;

    @Column(nullable = false)
    private int engelOrani;

    @Column(nullable = false)
    private int bagimlilikDegerlendirilmesi;

    @Column(length = 250, nullable = false)
    private String calistirilamayacagiIslerinNiteligi;

    @Column(length = 1, nullable = false)
    private String ortopedikEngelVar;

    @Column(length = 1, nullable = false)
    private String zihinselEngelVar;

    @Column(length = 1, nullable = false)
    private String gormeEngeliVar;

    @Column(length = 1, nullable = false)
    private String ruhsalVeDengeselEngelVar;

    @Column(length = 1, nullable = false)
    private String isitmeEngeliVar;

    @Column(length = 1, nullable = false)
    private String kronikEngeliVar;

    @Column(length = 1, nullable = false)
    private String dilVeKonusmaEngeliVar;

    @Column(length = 1, nullable = false)
    private String siniflanamayanEngeliVar;

    @OneToMany(mappedBy = "engellilikRapor")
    @Column(name = "tanilar", nullable = false)
    private List<TaniBilgisi> tanilar;

    @OneToMany(mappedBy = "engellilikRapor")
    @Column(name = "bransGorusler", nullable = false)
    private List<EngellilikBransGorusBilgisi> bransGorusler;

    @OneToMany(mappedBy = "engellilikRapor")
    @Column(name = "uyeler",nullable = false)
    private List<DoktorBilgisi> uyeler;

    @OneToMany(mappedBy = "engellilikRapor")
    @Column(name = "onayBekleyenDoktorlar",nullable = false)
    private List<DoktorBilgisi> onayBekleyenDoktorlar;

    @OneToOne(mappedBy = "engellilikRapor")
    private ImzaliRapor imzaliRapor;


}
