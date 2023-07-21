package com.birkil.hospitalmonitoring.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "faturaHata")
public class FaturaHata {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "takipNo")
    private String takipNo;

    @Column(name = "hataKodu", length = 4)
    private String hataKodu;

    @Column(name = "hataMesaji")
    private String hataMesaji;

    @Column(name = "hizmetSunucuRefNo")
    private String hizmetSunucuRefNo;
}
