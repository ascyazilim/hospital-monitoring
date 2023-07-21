package com.birkil.hospitalmonitoring.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@Table(name = "tetkikveRadyolojiBilgisi")
public class TetkikveRadyolojiBilgisi {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "bransKodu", length = 4, nullable = false)
    private String bransKodu;

    @Column(name = "drTescilNo", length = 16, nullable = false)
    private String drTescilNo;

    @Column(name = "istemYapanDrTescilNo", length = 16, nullable = false)
    private String istemYapanDrTescilNo;

    @Column(name = "sutKodu", length = 7, nullable = false)
    private String sutKodu;

    @Column(name = "hizmetSunucuRefNo", length = 20, nullable = false)
    private String hizmetSunucuRefNo;

    @Column(name = "islemSiraNo", length = 15)
    private String islemSiraNo;

    @Column(name = "adet", nullable = false)
    private int adet;

    @Column(name = "islemTarihi", nullable = false)
    private LocalDate islemTarihi;

    @Column(name = "ozelDurum", length = 1)
    private String ozelDurum;

    @Column(name = "birim", length = 15)
    private String birim;

    @Column(name = "aciklama", length = 3000)
    private String aciklama;

    @Column(name = "sonuc", length = 15)
    private String sonuc;

    @Column(name = "ayniFarkliKesi", length = 1)
    private String ayniFarkliKesi;

    @Column(name = "sagSol", length = 15)
    private String sagSol;

    @ElementCollection
    @CollectionTable(name = "ozelDurumlar", joinColumns = @JoinColumn(name = "id"))
    @Column(name = "cokluOzelDurum")
    private List<String> cokluOzelDurum;

    @Column(name = "raporTakipNo")
    private String raporTakipNo;

    @Column(name = "istemYapanDrBrans", length = 4)
    private String istemYapanDrBrans;




}
