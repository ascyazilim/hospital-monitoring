package com.birkil.hospitalmonitoring.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Data
@Table(name = "hastaCikis")
public class HastaCikis {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "hastaBasvuranNo", nullable = false)
    private String hastaBasvuranNo;

    @Column(name = "hastaCikisTarihi", nullable = false)
    private LocalDate hastaCikisTarihi;

    @Column(name = "saglikTesisKodu", nullable = false)
    private int saglikTesisKodu;
}
