package com.birkil.hospitalmonitoring.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "utsKesinlestirmeKayitMalzeme")
public class UTSKesinlestirmeKayitMalzeme {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "hizmetSunucuRefNo", nullable = false)
    private String hizmetSunucuRefNo;

    @Column(name = "takipNo", nullable = false)
    private String takipNo;



}
