package com.birkil.hospitalmonitoring.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
@Table(name = "rapor")
public class Rapor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(nullable = false)
    private RaporBilgisi raporBilgisi;

    @Column(nullable = false)
    private String turu;

    @Column(name = "baslangicTarihi")
    private LocalDate baslangicTarihi;

    @Column(name = "bitisTarihi")
    private LocalDate bitisTarihi;

    @Column(length = 1, nullable = false)
    private String duzenlemeTuru;

    @OneToOne
    @JoinColumn(name = "hakSahibi", nullable = false)
    private HakSahibiBilgisi hakSahibiBilgisi;

    @Column(length = 20)
    private String protokolNo;

    @Column
    private LocalDate protokolTarihi;

    @Column(length = 1)
    private String durum;

    @Column(length = 1000)
    private String aciklama;

    @OneToOne
    @JoinColumn(name = "doktorlar", nullable = false)
    private DoktorBilgisi doktorBilgisi;

    @OneToOne
    @JoinColumn(name = "tanilar")
    private TaniBilgisi taniBilgisi;

    @OneToOne
    @JoinColumn(name = "teshisler")
    private TeshisBilgisi teshisBilgisi;

    @OneToOne
    @JoinColumn(name = "ilacTeshisler")
    private IlacTeshisBilgi ilacTeshisBilgi;

    @Column
    private String takipNo;

    @Column(length = 255)
    private String klinikTanı;

    @Column
    private int ozelDurum;


}
