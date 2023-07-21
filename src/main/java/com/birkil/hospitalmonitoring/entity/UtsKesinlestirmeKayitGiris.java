package com.birkil.hospitalmonitoring.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "utsKesinlestirmeKayitGiris")
public class UtsKesinlestirmeKayitGiris {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "saglikTesisKodu", nullable = false)
    private int saglikTesisKodu;

    @ManyToOne
    private UTSKesinlestirmeKayitMalzeme utsKesinlestirmeKayitMalzeme;



}
