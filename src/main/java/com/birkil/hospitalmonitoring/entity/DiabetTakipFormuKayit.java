package com.birkil.hospitalmonitoring.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@Table(name = "diabetTakipFormuKayit")
public class DiabetTakipFormuKayit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 11, nullable = false)
    private String tcKimlikNo;

    @Column(nullable = false)
    private String ad;

    @Column(nullable = false)
    private String soyad;

    @Column(length = 10, nullable = false)
    private String cepTel;

    @Column(nullable = false)
    private String protokolNo;

    @Column(nullable = false)
    private LocalDate vizitTarihi;

    @Column(nullable = false)
    private int saglikTesisiKodu;

    @Column(length = 1, nullable = false)
    private String cinsiyet;

    @Column(nullable = false)
    private int ikametTuru;

    @OneToMany
    @Column(name = "doktorBilgileri", nullable = false)
    private List<TakipFormuDoktorBilgisi> takipFormuDoktorBilgisi;

    @Column(nullable = false)
    private String tani;

    @Column
    private LocalDate taniTarihi;

    @OneToOne
    @JoinColumn(name = "diabetEgitimi", nullable = false)
    private TakipFormuDiabetEgitimi takipFormuDiabetEgitimi;

    @Column(nullable = false)
    private int tibbiBeslenmeTedavisi;

    @Column(nullable = false)
    private int egzersiz;

    @OneToMany
    @Column(name = "hastaliklar")
    private List<TakipFormuHastalik> takipFormuHastalik;

    @Column(nullable = false)
    private int basvuruNedeni;

    @OneToMany
    @Column(name = "aliskanliklar")
    private List<TakipFormuAliskanlik> takipFormuAliskanlik;

    @Column(nullable = false)
    private String glukoMetre;

    @Column(nullable = false)
    private int kanSekeriTakipSayisi;

    @OneToMany
    @Column(name = "kullanilanIlaclar")
    private List<TakipFormuKullanilanIlaclar> takipFormuKullanilanIlaclar;

    @Column
    private int sistolikKanBasinci;

    @Column
    private int diyastolikKanBasinci;

    @Column(nullable = false)
    private Double boy;

    @Column(nullable = false)
    private Double kilo;

    @Column(nullable = false)
    private Double vki;

    @Column(nullable = false)
    private Double apg;

    @Column(nullable = false)
    private Double tpg;

    @Column(nullable = false)
    private Double hbA1c;

    @Column(nullable = false)
    private Double kreatinin;

    @Column(nullable = false)
    private Double trigliserid;

    @Column(nullable = false)
    private Double ldlKol;

    @Column(nullable = false)
    private Double hdlKol;

    @Column(nullable = false)
    private Double alt;

    @Column(length = 1, nullable = false)
    private String antiGAD;

    @Column(nullable = false)
    private int ekg;

    @Column(length = 1, nullable = false)
    private String mikroalbuminuri;

    @Column(nullable = false)
    private int gozMuayenesi;

    @Column(length = 1, nullable = false)
    private String periferikSensoryal;

    @Column(length = 1)
    private String koronerArterH;

    @Column(length = 1, nullable = false)
    private String serebrovaskulerH;

    @Column(length = 1, nullable = false)
    private String ayakMuayenesi;

    @Column(nullable = false)
    private int akutKomplikasyon;

    @Column(nullable = false)
    private int yatisGun;

    @Column(length = 1, nullable = false)
    private String İnsulinPompasi;

    @Column
    private LocalDate insulinPompasiVerTarihi;

    @Column
    private LocalDate insulinPompasiDegTarihi;





}
