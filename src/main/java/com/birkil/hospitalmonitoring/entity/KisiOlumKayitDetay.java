package com.birkil.hospitalmonitoring.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Data
@Table(name = "kisiOlumKayitDetay")
public class KisiOlumKayitDetay {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 11)
    private String tcKimlikNo;

    @Column
    private String adi;

    @Column
    private String soyadi;

    @Column
    private LocalDate olumTarihi;

    @Column
    private int saglikTesisKodu;

    @Column
    private LocalTime olumSaati;

    @Column(length = 50)
    private String olumBelgesiAdi;

    @Column
    private Byte olumBelgesiIcerik;
}
