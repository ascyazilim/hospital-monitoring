package com.birkil.hospitalmonitoring.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@Table(name = "kanBilgisi")
public class KanBilgisi {

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

    @Column(name = "adet", nullable = false)
    private int adet;

    @Column(name = "isbtBilesenNo")
    private String isbtBilesenNo;

    @Column(name = "isbtUniteNo")
    private String isbtUniteNo;

    @Column(name = "islemTarihi", nullable = false)
    private LocalDate islemTarihi;

    @Column(name = "ozelDurum", length = 1)
    private String ozelDurum;

    @ElementCollection
    @CollectionTable(name = "ozelDurumlar", joinColumns = @JoinColumn(name = "id"))
    @Column(name = "cokluOzelDurum")
    private List<String> cokluOzelDurum;

}
