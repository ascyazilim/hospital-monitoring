package com.birkil.hospitalmonitoring.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "saglikTesisiAraGiris")
public class SaglikTesisiAraGiris {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private int saglikTesisKodu;

    @Column(length = 100)
    private String saglikTesisAdi;

    @Column(length = 2)
    private String tesisIlKodu;

    @Column
    private int tesisKodu;

    @Column(length = 2)
    private String tesisTuru;
}
