package com.birkil.hospitalmonitoring.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
@Table(name = "itsIlacBilgisi")
public class ITSIlacBilgisi {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "itsBirimSarfId")
    private String itsBirimSarfId;

    @Column(name = "islemSiraNo")
    private String islemSiraNo;

    @Column(name = "islemTarihi")
    private LocalDate islemTarihi;

    @Column(name = "barkod")
    private String barkod;

    @Column(name = "seriNo")
    private String seriNo;

    @Column(name = "adet")
    private int adet;

    @Column(name = "sonucKodu", length = 4)
    private String sonucKodu;

    @Column(name = "sonucMesaji")
    private String sonucMesaji;



}
