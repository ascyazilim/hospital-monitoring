package com.birkil.hospitalmonitoring.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Data
@Table(name = "damarIziDogrulamaDetay")
public class DamarIziDogrulamaDetay {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 11)
    private String tckNo;

    @Column
    private LocalDate islemTarihi;

    @Column
    private String brans;

    @Column
    private int tesisKodu;

    @Column
    private String firmaId;

    @Column
    private LocalTime islemSaati;
}
