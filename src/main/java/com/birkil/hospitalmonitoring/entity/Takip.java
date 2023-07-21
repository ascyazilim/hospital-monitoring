package com.birkil.hospitalmonitoring.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@Table(name = "takip")
public class Takip {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "sonucKodu", length = 4, nullable = false)
    private String sonucKodu;

    @Column(name = "sonucMesajı", nullable = false)
    private String sonucMesajı;

    @Column(name = "takipNo", nullable = false)
    private String takipNo;

    @Column(name = "ilkTakipNo", nullable = false)
    private String ilkTakipNo;

    @Column(name = "takipTarihi", nullable = false)
    private LocalDate takipTarihi;

    @Column(name = "kayitTarihi", nullable = false)
    private LocalDate kayitTarihi;

    @Column(name = "tesisKodu", nullable = false)
    private int tesisKodu;

    @Column(name = "bransKodu", length = 4, nullable = false)
    private String bransKodu;

    @Column(name = "donorTcKimlikNo", length = 11)
    private String donorTcKimNo;

    @Column(name = "hastaBasvuruNo", nullable = false)
    private String hastaBasvuruNo;

    @Column(name = "takipTipi", length = 1, nullable = false)
    private String takipTipi;

    @Column(name = "tedaviTuru", length = 1, nullable = false)
    private String tedaviTuru;

    @Column(name = "takipDurumu", length = 1, nullable = false)
    private String takipDurumu;

    @Column(name = "provizyonTipi", length = 1, nullable = false)
    private String provizyonTipi;

    @Column(name = "tedaviTipi", length = 1, nullable = false)
    private String tedaviTipi;

    @Column(name = "faturaTeslimNo", nullable = false)
    private String faturaTeslimNo;

    @Column(name = "sevkDurumu", length = 1, nullable = false)
    private String sevkDurumu;

    @Column(name = "yeniDoganDogumTarihi")
    private LocalDate yeniDoganDogumTarihi;

    @Column(name = "yeniDoganCocukSiraNo")
    private String yeniDoganCocukSiraNo;

    @Column(name = "istisnaiHal")
    private String istisnaiHal;

    @Column(name = "faturaIptalHakki", nullable = false)
    private int faturaIptalHakki;

    @Column(name = "faturaTarihi", nullable = false)
    private LocalDate faturaTarihi;

    @Column(name = "hastaTelefon", length = 10, nullable = false)
    private String hastaTel;

    @Column(name = "hastaAdres", nullable = false)
    private String hastaAdres;

    @Column(name = "kurumSevkTalepNo", nullable = false)
    private String kurumSevkTalepNo;

    @Column(name = "maluliyetSevkTarihi", nullable = false)
    private String maluliyetSevkTarihi;

    @OneToMany(mappedBy = "takip", cascade = CascadeType.ALL)
    private List<HastaBilgileri> hastaBilgileri;
}
