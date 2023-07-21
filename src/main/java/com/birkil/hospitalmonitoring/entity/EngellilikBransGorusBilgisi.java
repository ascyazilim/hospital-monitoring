package com.birkil.hospitalmonitoring.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "EngellilikBransGorusBilgisi")
public class EngellilikBransGorusBilgisi {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String bransKodu;

    @Column(nullable = false)
    private String drTescilNo;

    @Column(nullable = false)
    private String doktorTipi;

    @Column(length = 1000, nullable = false)
    private String tetkikTeshisBulguAciklama;

    @Column(nullable = false)
    private int engelOrani;


    @ManyToOne
    @JoinColumn(name = "engellilik_rapor_id")
    private EngellilikRapor engellilikRapor;



}
