package com.birkil.hospitalmonitoring.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
@Table(name = "mustehaklikGiris")
public class MustehaklikGiris {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "tcKimlikNo", length = 11, nullable = false)
    private String tcKimlikNo;

    @Column(name = "tarih", nullable = false)
    private LocalDate tarih;

    @Column(name = "saglikTesisKodu", nullable = false)
    private int saglikTesisKodu;
}
