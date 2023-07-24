package com.birkil.hospitalmonitoring.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
@Table(name = "isgoremezlikRaporEk")
public class IsgoremezlikRaporEk {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String aciklama;

    @Column(nullable = false)
    private LocalDate bitisTarihi;

    @Column(nullable = false)
    private String durum;

    @Column(nullable = false)
    private String duzenlemeTuru;

    @Column(length = 1, nullable = false)
    private String hastaYatisVarMi;

    @Column(nullable = false)
    private String kontrolMu;

    @Column(nullable = false)
    private String kontrolTarihi;

    @Column
    private String protokolNo;

    @Column
    private LocalDate protokolTarihi;

    @OneToOne
    @JoinColumn(name = "yatislar", nullable = false)
    private HastaYatisBilgisi hastaYatisBilgisi;

    @OneToOne
    @JoinColumn(name = "raporBilgisi", nullable = false)
    private RaporBilgisi raporBilgisi;

    @OneToOne
    @JoinColumn(name = "doktorlar", nullable = false)
    private DoktorBilgisi doktorBilgisi;

    @OneToOne
    @JoinColumn(name = "tanilar", nullable = false)
    private TaniBilgisi taniBilgisi;

    @Column(nullable = false)
    private int kullaniciTesisKodu;



}
