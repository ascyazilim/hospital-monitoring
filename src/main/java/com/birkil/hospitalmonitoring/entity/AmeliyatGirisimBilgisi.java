package com.birkil.hospitalmonitoring.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
@Table(name = "surgeryAndIntervention")
public class AmeliyatGirisimBilgisi {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "tanim", nullable = false)
    private String tanim;

    @Column(name = "adet", nullable = false)
    private int adet;

    @Column(name = "ayniFarkliKesi", nullable = false)
    private String ayniFarkliKesi;

    @Column(name = "bransKodu", nullable = false)
    private String bransKodu;

    @Column(name = "drTescilNo", nullable = false)
    private String drTescilNo;

    @Column(name = "hizmetSonucuRefNo", nullable = false)
    private String hizmetSonucuRefNo;

    @Column(name = "islemSiraNo", nullable = false)
    private String islemSiraNo;

    @Column(name = "islemTarihi", nullable = false)
    private LocalDate islemTarihi;

    @Column(name = "sagSol", nullable = false)
    private String sagSol;

    @Column(name = "sutKodu", nullable = false)
    private String sutKodu;

    @Column(name = "euroScore", nullable = false)
    private String euroScore;

    @Column(name = "ozelDurum", nullable = false)
    private String ozelDurum;

    @Column(name = "cokluOzelDurum", nullable = false)
    private String cokluOzelDurum;

    @Column(name = "raporTakipNo", nullable = false)
    private String raporTakipNo;


}
