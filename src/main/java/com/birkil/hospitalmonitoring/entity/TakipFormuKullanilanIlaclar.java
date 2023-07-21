package com.birkil.hospitalmonitoring.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "takipFormuKullanilanIlaclar")
public class TakipFormuKullanilanIlaclar {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String barkod;

    @Column(nullable = false)
    private String gunlukDoz;





}
