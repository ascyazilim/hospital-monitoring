package com.birkil.hospitalmonitoring.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
@Table
public class TakipAraGiris {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 11, nullable = false)
    private String hastaTCK;

    @Column(nullable = false)
    private LocalDate baslangicTarihi;

    @Column(nullable = false)
    private LocalDate bitisTarihi;

    @Column(length = 1, nullable = false)
    private String sevkDurumu;

    @Column(nullable = false)
    private int saglikTesisKodu;

    @Column(nullable = false)
    private String ktsHbysKodu;
}
