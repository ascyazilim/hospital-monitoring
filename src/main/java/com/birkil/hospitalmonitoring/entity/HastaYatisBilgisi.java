package com.birkil.hospitalmonitoring.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@Table(name = "hastaYatisBilgisi")
public class HastaYatisBilgisi {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "bransKodu", length = 4, nullable = false)
    private String bransKodu;

    @Column(name = "drTescilNo", length = 16, nullable = false)
    private String drTescilNo;

    @Column(name = "sutKodu", length = 7, nullable = false)
    private String sutKodu;

    @Column(name = "hizmetSunucuRefNo", length = 20, nullable = false)
    private String hizmetSunucuRefNo;

    @Column(name = "islemSiraNo", length = 15)
    private String islemSiraNo;

    @Column(name = "refakatciGunSayisi", length = 4)
    private String refakatciGunSayisi;

    @Column(name = "yatisBaslangicTarihi", nullable = false)
    private LocalDate yatisBaslangicTarihi;

    @Column(name = "yatisBitisTarihi", nullable = false)
    private LocalDate yatisBitisTarihi;

    @Column(name = "ozelDurum", length = 1)
    private String ozelDurum;

    @Column(name = "aciklama", length = 1000)
    private String aciklama;

    @ElementCollection
    @CollectionTable(name = "ozelDurumlar", joinColumns = @JoinColumn(name = "id"))
    @Column(name = "cokluOzelDurum")
    private List<String> cokluOzelDurum;

    @Column(name = "yatakKodu", length = 15, nullable = false)
    private String yatakKodu;

}
