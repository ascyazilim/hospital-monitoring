package com.birkil.hospitalmonitoring.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@Table(name = "diabetTakipFormu")
public class DiabetTakipFormu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String takipFormuNo;

    @Column(length = 11)
    private String tcKimlikNo;

    @Column
    private String ad;

    @Column
    private String soyad;

    @Column
    private String cepTel;

    @Column
    private String protokolNo;

    @Column
    private LocalDate vizitTarihi;

    @Column
    private String saglikTesisKodu;

    @Column(length = 1)
    private String cinsiyet;

    @Column
    private int ikametTuru;

    @OneToMany
    @Column(name = "doktorBilgileri")
    private List<TakipFormuDoktorBilgisi> takipFormuDoktorBilgisi;

    @Column
    private String tani;

    @Column
    private LocalDate taniTarihi;

    @OneToOne
    @Column(name = "diabetEgitimi")
    private TakipFormuDiabetEgitimi takipFormuDiabetEgitimi;

    @Column
    private int tibbiBeslenmeTedavisi;

    @Column
    private int egzersiz;

    @OneToMany
    @Column(name = "hastaliklar")
    private List<TakipFormuHastalik> takipFormuHastalik;

    @Column
    private int basvuruNedeni;

    @OneToMany
    @Column(name = "aliskanliklar")
    private List<TakipFormuAliskanlik> takipFormuAliskanlik;

    @Column(length = 1)
    private String glukoMetre;

    @Column
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
