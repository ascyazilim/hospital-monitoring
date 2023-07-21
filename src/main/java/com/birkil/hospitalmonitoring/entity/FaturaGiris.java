package com.birkil.hospitalmonitoring.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
@Table(name = "faturaGiris")
public class FaturaGiris {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "saglikTesisKodu", nullable = false)
    private int saglikTesisKodu;

    @Column(name = "faturaTarihi", nullable = false)
    private LocalDate faturaTarihi;

    @Column(name = "hastaBasvuruNo", nullable = false)
    private String hastaBasvuruNo;

    @Column(name = "faturaRefNo", nullable = false)
    private String faturaRefNo;

    @ManyToOne
    private HizmetDetay hizmetDetay;

    @Column(name = "yesilKartSevkEdilenBransKodu")
    private String yesilKartSevkEdilenBransKodu;

    @Column(name = "yesilKartSevkEdilenTesisKodu")
    private String yesilKartSevkEdilenTesisKodu;

    @Column(name = "yesilKartSevkEdilenTesisAdi")
    private String yesilKartSevkEdilenTesisAdi;

    @Column(name = "yesilKartSevkEdilenTakipTipi")
    private String yesilKartSevkEdilenTakipTipi;

    @Column(name = "yesilKartSevkEdilenAciklama")
    private String yesilKartSevkEdilenAciklama;

    @Column(name = "trafikKazasiOdemeYuzdesi", nullable = false)
    private int trafikKazasiOdemeYuzdesi;

    @Column(name = "ilaveUcret", nullable = false)
    private Double ilaveUcret;

    @Column(name = "ktsHbysKodu", nullable = false)
    private String ktsHbysKodu;

    @Column(name = "hastaTelefon", length = 10)
    private String hastaTelefon;

    @Column(name = "hastaAdres")
    private String hastaAdres;
}
