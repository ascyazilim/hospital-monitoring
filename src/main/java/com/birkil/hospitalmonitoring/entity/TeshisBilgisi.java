package com.birkil.hospitalmonitoring.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
@Table(name = "teshisBilgisi")
public class TeshisBilgisi {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private LocalDate baslangicTarihi;

    @Column(nullable = false)
    private LocalDate bitisTarihi;

    @Column(nullable = false)
    private int teshisKodu;
}
