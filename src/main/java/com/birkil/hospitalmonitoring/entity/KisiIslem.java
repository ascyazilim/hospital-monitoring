package com.birkil.hospitalmonitoring.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
@Table(name = "kisiIslem")
public class KisiIslem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String tesisKodu;

    @Column
    private String tesisAdi;

    @Column
    private LocalDate islemTarihi;
}
