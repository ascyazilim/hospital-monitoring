package com.birkil.hospitalmonitoring.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
@Table(name = "raporOku")
public class RaporOku {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private int raporTesisKodu;

    @Column(length = 20, nullable = false)
    private String no;

    @Column(nullable = false)
    private LocalDate tarih;

    @Column(length = 1, nullable = false)
    private String turu;

    @Column(nullable = false)
    private String raporSiraNo;


}
