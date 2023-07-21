package com.birkil.hospitalmonitoring.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table
public class SaglikTesisiList {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 2)
    private String tesisIl;

    @Column(length = 100)
    private String tesisAdi;

    @Column
    private int tesisKodu;

    @Column(length = 2)
    private String tesisSinifKodu;

    @Column(length = 2)
    private String tesisTuru;

    @Column(length = 2)
    private String tesisIlAdi;

    @Column(length = 2)
    private String tesisIlceKodu;

    @Column(length = 100)
    private String tesisIlceAdi;

    @Column(length = 300)
    private String tesisTuruAdi;



}
