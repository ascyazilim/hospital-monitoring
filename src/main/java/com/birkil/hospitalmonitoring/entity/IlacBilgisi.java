package com.birkil.hospitalmonitoring.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "ilacBilgisi")
public class IlacBilgisi {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "ad")
    private String ad;

    @Column(name = "aciklama", length = 255)
    private String aciklama;

    @Column(name = "adet", nullable = false)
    private Double adet;

    @Column(name = "barkod", length = 13)
    private String barkod;

    @Column(name = "hizmetSunucuRefNo", length = 20, nullable = false)
    private String hizmetSunucuRefNo;

    @Column(name = "ilacTuru", length = 1, nullable = false)
    private String ilacTuru;

    @Column(name = "islemSiraNo", length = 15)
    private String islemSiraNo;

    @Column(name = "islemTarihi", length = 10, nullable = false)
    private String islemTarihi;

    @Column(name = "tutar")
    private Double tutar;

    @Column(name = "paketHaric", length = 1, nullable = false)
    private String paketHaric;

    @Column(name = "ozelDurum", length = 1)
    private String ozelDurum;

    @Column(name = "cokluOzelDurum")
    private String cokluOzelDurum;

    @Column(name = "SN", length = 20)
    private String seriNo;

    @Column(name = "sonKullanimTarihi")
    private String sonKullanimTarihi;

    @Column(name = "batchNo", length = 20)
    private String batchNo;

    @Column(name = "itsBirimSarfId")
    private String itsBirimSarfId;

    @ManyToOne
    private MajistralIlac majistralIlac;

}
