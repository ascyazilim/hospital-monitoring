package com.birkil.hospitalmonitoring.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
@Table(name = "sutFiyat")
public class SutFiyat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String sutKodu;

    @Column
    private String adi;

    @Column
    private String fiyat;

    @Column
    private String turu;

    @Column
    private LocalDate gecerlilikTarihi;
}
