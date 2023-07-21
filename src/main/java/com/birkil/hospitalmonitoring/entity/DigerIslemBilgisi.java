package com.birkil.hospitalmonitoring.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class DigerIslemBilgisi {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "adet", nullable = false)
    private int adet;

    @Column(name = "bransKodu", nullable = false)
    private String bransKodu;

    @Column(name = "sutKodu", nullable = false)
    private String sutKodu;

    @Column(name = "drTescilKodu", nullable = false)
    private String drTescilKodu;

    @Column(name = "hizmetSonucuRefNo", nullable = false)
    private String hizmetSunucuRefNo;

    @Column(name = "islemSiraNo", nullable = false)
    private String islemSiraNo;

    @Column(name = "islemTarihi", nullable = false)
    private String islemTarihi;

    @Column(name = "raporTakipNo", nullable = false)
    private String raporTakipNo;

    @Column(name = "ozelDurum", nullable = false)
    private String ozelDurum;

    @Column(name = "ayniFarkliKesi", nullable = false)
    private String ayniFarkliKesi;

    @Column(name = "cokluOzelDurum", nullable = false)
    private String cokluOzelDurum;

    @Column(name = "aciklama", nullable = false)
    private String aciklama;

    @Column(name = "sagSol", nullable = false)
    private String sagSol;

    @Column(name = "istemYapanDrTescilNo", nullable = false)
    private String istemYapanDrTescilNo;

    @Column(name = "istemYapanDrBrans", nullable = false)
    private String istemYapanDrBrans;




}
