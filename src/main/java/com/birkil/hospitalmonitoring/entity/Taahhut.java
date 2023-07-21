package com.birkil.hospitalmonitoring.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "taahhut")
public class Taahhut {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 11, nullable = false)
    private String hastaTCKimlikNo;

    @Column(nullable = false)
    private int adressIlPlaka;

    @Column(nullable = false)
    private String adressIlce;

    @Column(length = 6, nullable = false)
    private String adressPostaKodu;

    @Column(length = 50, nullable = false)
    private String adressCaddeSokak;

    @Column(length = 15, nullable = false)
    private String adressDisKapiNo;

    @Column(length = 15, nullable = false)
    private String adressIcKapiNo;

    @Column(length = 10, nullable = false)
    private String adressTelefon;

    @Column(length = 50, nullable = false)
    private String adressEposta;

    @Column(length = 30, nullable = false)
    private String taahhutAlanAd;

    @Column(length = 30, nullable = false)
    private String taahhutAlanSoyad;

    @OneToOne(mappedBy = "taahhut")
    private TaahhutKayit taahhutKayit;
}
