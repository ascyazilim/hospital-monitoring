package com.birkil.hospitalmonitoring.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
@Table(name = "hastaCikisIptal")
public class HastaCikisIptal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "hastaBasvuruNo", nullable = false)
    private String hastaBasvuruNo;

    @Column(name = "hastaCikisTarihi", nullable = false)
    private LocalDate hastaCikisTarihi;

    @Column(name = "yeniHastaCikisTarihi")
    private LocalDate yeniHastaCikisTarihi;

    @Column(name = "saglikTesisKodu", nullable = false)
    private int saglikTesisKodu;
}
