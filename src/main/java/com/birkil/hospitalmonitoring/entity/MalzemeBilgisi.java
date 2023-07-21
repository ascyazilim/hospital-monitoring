package com.birkil.hospitalmonitoring.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@Table(name = "malzemeBilgisi")
public class MalzemeBilgisi {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "kodsuzMalzemeAdi", length = 200)
    private String kodsuzMalzemeAdi;

    @Column(name = "adet", nullable = false)
    private Double adet;

    @Column(name = "barkod", length = 20)
    private String barkod;

    @Column(name = "hizmetSunucuRefNo", length = 20, nullable = false)
    private String hizmetSunucuRefNo;

    @Column(name = "islemSiraNo", length = 15)
    private String islemSiraNo;

    @Column(name = "islemTarihi", nullable = false)
    private LocalDate islemTarihi;

    @Column(name = "kodsuzMalzemeFiyati", nullable = false)
    private Double kodsuzMalzemeFiyati;

    @Column(name = "malzemeKodu", length = 20)
    private String malzemeKodu;

    @Column(name = "malzemeTuru", length = 1, nullable = false)
    private String malzemeTuru;

    @Column(name = "paketHaric", length = 1, nullable = false)
    private String paketHaric;

    @Column(name = "katkiPayi", length = 1, nullable = false)
    private String katkiPayi;

    @Column(name = "ozelDurum", length = 1)
    private String ozelDurum;

    @Column(name = "kdv", nullable = false)
    private int kdv;

    @Column(name = "bransKodu", nullable = false)
    private String bransKodu;

    @Column(name = "drTescilNo", nullable = false)
    private String drTescilNo;

    @Column(name = "firmaTanimlayiciNo")
    private String firmaTanimlayiciNo;

    @ElementCollection
    @CollectionTable(name = "ozelDurumlar", joinColumns = @JoinColumn(name = "id"))
    @Column(name = "cokluOzelDurum")
    private List<String> cokluOzelDurum;

    @Column(name = "malzemeSatinAlisTarihi", nullable = false)
    private LocalDate malzemeSatinAlisTarihi;

    @Column(name = "donorId", length = 20)
    private String donorId;

    @Column(name = "ihaleKesinlesmeTarihi")
    private LocalDate ihaleKesinlesmeTarihi;

    @Column(name = "ikNoAlimNo", length = 25)
    private String ikNoAlimNo;

    @Column(name = "bayiNo", length = 13, nullable = false)
    private String bayiNo;

    @Column(name = "raporTakipNo")
    private String raporTakipNo;

}
