package com.birkil.hospitalmonitoring.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
@Table(name = "basvuruYatisBilgileri")
public class BasvuruYatisBilgileri {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "baslangicTarihi", nullable = false)
    private LocalDate baslangicTarihi;

    @Column(name = "bitisTarihi", nullable = false)
    private LocalDate bitisTarihi;

    @Column(name = "durum", length = 1, nullable = false)
    private String durum;
}
