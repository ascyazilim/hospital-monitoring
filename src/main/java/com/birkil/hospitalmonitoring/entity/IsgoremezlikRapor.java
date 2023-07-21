package com.birkil.hospitalmonitoring.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
@Table(name = "isgoremezlikRapor")
public class IsgoremezlikRapor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private RaporBilgisi raporBilgisi;

    @Column(name = "isGoremezlikRaporTuru", length = 1, nullable = false)
    private int isGoremezlikRaporTuru;

    @Column(name = "bransKodu", length = 4, nullable = false)
    private String bransKodu;

    @Column(name = "protokolNo", length = 20)
    private String protokolNo;

    @Column(name = "protokolTarihi")
    private LocalDate protokolTarihi;

    @Column(name = "duzenlemeTuru", length = 1, nullable = false)
    private String duzenlemeTuru;

    @Column(name = "teshis", nullable = false)
    private String teshis;

    @Column(name = "aciklama",length = 255)
    private String aciklama;

    @Column(name = "saglikKuruluRaporTarih", length = 20)
    private String saglikKuruluRaporTarih;

    @Column(name = "olum", length = 1, nullable = false)
    private String olum;

    @Column(name = "ilkRaporTakipNo")
    private Long ilkRaporTakipNo;

    @OneToOne
    private IsKazasiRapor isKazasiRapor;

    @OneToOne
    private MeslekHastaligiRapor meslekHastaligiRapor;

    @OneToOne
    private AnalikRapor analikRapor;

    @OneToOne
    private EmzirmeRapor emzirmeRapor;

    @OneToOne
    private HastalikRapor hastalikRapor;

    @Column(name = "klinikBulgular", length = 20)
    private String klinikBulgular;

    @Column(name = "ronLabBilgileri")
    private String ronLabBilgileri;

    @Column(name = "karar", length = 20)
    private String karar;

    @OneToOne
    private DoktorBilgisi doktorBilgisi;

    @Column(name = "bashekimOnayDurumu")
    private int bashekimOnayDurumu;

    @Column(name = "bashekimTCNo", length = 20)
    private String bashekimTCNo;

    @OneToOne
    private HakSahibiBilgisi hakSahibiBilgisi;

    @Column(name = "devammi", length = 1, nullable = false)
    private int devammi;

    @Column(name = "yatisDevam", length = 1, nullable = false)
    private String yatisDevam;





}
