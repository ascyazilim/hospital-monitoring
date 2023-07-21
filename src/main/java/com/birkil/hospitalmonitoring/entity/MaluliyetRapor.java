package com.birkil.hospitalmonitoring.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@Table(name = "maluliyetRapor")
public class MaluliyetRapor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
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
    private LocalDate raporTarihi;

    @Column(nullable = false)
    private int maluliyetRaporTuru;

    @Column(nullable = false)
    private String raporNo;

    @Column(nullable = false)
    private LocalDate sevkTarihi;

    @Column(nullable = false)
    private int sevkNedeni;

    @Column(nullable = false)
    private int basvuruSekli;

    @Column
    private int durum;

    @Column(length = 11, nullable = false)
    private String kurulBaskaniDrTescilNo;

    @Column(length = 4000, nullable = false)
    private String aciklama;

    @Column(length = 4000, nullable = false)
    private String karar;

    @OneToMany(mappedBy = "maluliyetRapor")
    @Column(name = "bransGorusler", nullable = false)
    private List<MaluliyetBransGorusBilgisi> maluliyetBransGorusBilgisi;

    @OneToMany(mappedBy = "maluliyetRapor")
    @Column(name = "uyeler",nullable = false)
    private List<DoktorBilgisi> uyeler;

    @OneToMany(mappedBy = "maluliyetRapor")
    @Column(name = "onayBekleyenDoktorlar",nullable = false)
    private List<DoktorBilgisi> onayBekleyenDoktorlar;

    @OneToOne(mappedBy = "maluliyetRapor")
    private ImzaliRapor imzaliRapor;


}
