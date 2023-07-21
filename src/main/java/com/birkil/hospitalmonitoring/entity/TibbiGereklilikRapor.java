package com.birkil.hospitalmonitoring.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@Table(name = "tibbiGereklilikRapor")
public class TibbiGereklilikRapor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String raporTakipNo;

    @Column(length = 11, nullable = false)
    private String tckimlikNo;

    @Column(length = 8, nullable = false)
    private int tesisKodu;

    @Column
    private String takipNo;

    @Column(nullable = false)
    private LocalDate raporTarihi;

    @Column(nullable = false)
    private String raporNo;

    @Column(nullable = false)
    private int istekNedeni;

    @OneToMany(mappedBy = "tibbiGereklilikRapor")
    @Column(name = "tanilar", nullable = false)
    private List<TaniBilgisi> tanilar;

    @Column(nullable = false)
    private String protokolNo;

    @Column(length = 2000, nullable = false)
    private String karar;

    @OneToMany(mappedBy = "tibbiGereklilikRapor")
    @Column(name = "islemler", nullable = false)
    private List<SutIslemBilgisi> islemler;

    @OneToMany(mappedBy = "tibbiGereklilikRapor")
    @Column(name = "doktorlar",nullable = false)
    private List<DoktorBilgisi> doktorlar;


}
