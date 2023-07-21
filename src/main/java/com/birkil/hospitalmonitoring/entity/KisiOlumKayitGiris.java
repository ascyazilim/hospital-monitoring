package com.birkil.hospitalmonitoring.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Data
@Table(name = "kisiOlumKayitGiris")
public class KisiOlumKayitGiris {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 11, nullable = false)
    private String tcKimlikNo;

    @Column(nullable = false)
    private LocalDate olumTarihi;

    @Column(nullable = false)
    private String saglikTesisKodu;

    @Column(nullable = false)
    private LocalTime olumSaati;

    @Column(length = 50, nullable = false)
    private String olumBelgesiAdi;

    @Column
    private Byte olumBelgesiIcerik;

}
