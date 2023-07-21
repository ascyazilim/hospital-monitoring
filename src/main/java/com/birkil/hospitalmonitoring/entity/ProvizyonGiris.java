package com.birkil.hospitalmonitoring.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@Table(name = "provizyonGiris")
public class ProvizyonGiris {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "saglikTesisKodu", nullable = false)
    private int saglikTesisKodu;

    @Column(name = "hastaTcKimlikNo", length = 11, nullable = false)
    private String hastaTcKimNo;

    @Column(name = "sigortaliTuru", length = 1, nullable = false)
    private String sigortaliTuru;

    @Column(name = "bransKodu", length = 4, nullable = false)
    private String bransKodu;

    @Column(name = "devredilenKurum", length = 1, nullable = false)
    private String devredilenKurum;

    @Column(name = "provizyonTarihi", nullable = false)
    private LocalDate provizyonTarihi;

    @Column(name = "provizyonTipi", length = 1, nullable = false)
    private String provizyonTipi;

    @Column(name = "takipTipi", length = 1, nullable = false)
    private String takipTipi;

    @Column(name = "takipNo")
    private String takipNo;

    @OneToMany(mappedBy = "provizyonGiris", cascade = CascadeType.ALL)
    private List<YeniDoganBilgisi> yeniDoganBilgisi;

    @Column(name = "yatisBilgisiTarihi")
    private LocalDate yatisBilgisiTarihi;

    @Column(name = "tedaviTuru", length = 1, nullable = false)
    private String tedaviTuru;

    @Column(name = "tedaviTipi", length = 1, nullable = false)
    private String tedaviTipi;

    @Column(name = "donorTcKimlikNo", length = 11)
    private String donorTcKimNo;

    @Column(name = "yakinlikKodu")
    private String yakinlikKodu;

    @Column(name = "plakaNo")
    private String plakaNo;

    @Column(name = "yesilKartSevkEdenTesisKodu")
    private int yesilKartSevkEdenTesisKodu;

    @Column(name = "hastaTelefon", length = 10, nullable = false)
    private String hastaTelefon;

    @Column(name = "hastaAdres", length = 100, nullable = false)
    private String hastaAdres;

    @Column(name = "vakaTarihi", nullable = false)
    private LocalDate vakaTarihi;

    @Column(name = "ktsHbysKodu")
    private String ktsHbysKodu;

    @Column(name = "kurumSevkTalepNo")
    private String kurumSevkTalepNo;

    @Column(name = "maluliyetSevkTarihi")
    private LocalDate maluliyetSevkTarihi;

    @Column(name = "vakaİl", nullable = false)
    private int vakaIl;

    @Column(name = "vakaİlçe", nullable = false)
    private int vakaIlce;

}
