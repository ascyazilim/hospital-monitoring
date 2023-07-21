package com.birkil.hospitalmonitoring.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table
public class FaturaIptalHataliKayit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "hataKodu", length = 4)
    private String hataKodu;

    @Column(name = "hataMesaji")
    private String hataMesaji;

    @Column(name = "faturaTeslimNo")
    private String faturaTeslimNo;

}
