package com.birkil.hospitalmonitoring.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
@Table(name = "disBilgisi")
public class DisBilgisi {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "drTescilNo", length = 16, nullable = false)
    private String drTescilNo;

    @Column(name = "anomali", length = 1, nullable = false)
    private String anomali;

    @Column(name = "adet", nullable = false)
    private int adet;

    @Column(name = "bransKodu", length = 4, nullable = false)
    private String bransKodu;

    @Column(name = "hizmetSunucuRefNo", length = 20, nullable = false)
    private String hizmetSunucuRefNo;

    @Column(name = "islemSiraNo", length = 15)
    private String islemSiraNo;

    @Column(name = "islemTarihi", nullable = false)
    private LocalDate islemTarihi;

    @Column(name = "sagAltCene", length = 8, nullable = false)
    private String sagAltCene;

    @Column(name = "sagSutAltCene", length = 5, nullable = false)
    private String sagSutAltCene;

    @Column(name = "sagSutUstCene", length = 5, nullable = false)
    private String sagSutUstCene;

    @Column(name = "sagUstCene", length = 8, nullable = false)
    private String sagUstCene;

    @Column(name = "solAltCene", length = 8, nullable = false)
    private String solAltCene;

    @Column(name = "solSutAltCene", length = 5, nullable = false)
    private String solSutAltCene;

    @Column(name = "solSutUstCene", length = 5, nullable = false)
    private String solSutUstCene;

    @Column(name = "solUstCene", length = 8, nullable = false)
    private String solUstCene;

    @Column(name = "sagAltCeneAnomaliDis", length = 1, nullable = false)
    private String sagAltCeneAnomaliDis;

    @Column(name = "sagUstCeneAnomaliDis", length = 1, nullable = false)
    private String sagUstCeneAnomaliDis;

    @Column(name = "solAltCeneAnomaliDis", length = 1, nullable = false)
    private String solAltCeneAnomaliDis;

    @Column(name = "solUstCeneAnomaliDis", length = 1, nullable = false)
    private String solUstCeneAnomaliDis;

    @Column(name = "sutKodu", length = 7, nullable = false)
    private String sutKodu;

    @Column(name = "ayniFarkliKesi", length = 1)
    private String ayniFarkliKesi;

    @Column(name = "ozelDurum", length = 1)
    private String ozelDurum;

    @Column(name = "disTaahhutNo")
    private int disTaahhutNo;

    @Column(name = "cokluOzelDurum")
    private String cokluOzelDurum;

    @Column(name = "raporTakipNo")
    private String raporTakipNo;


}
