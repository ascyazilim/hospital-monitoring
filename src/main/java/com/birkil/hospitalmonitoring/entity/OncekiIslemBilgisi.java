package com.birkil.hospitalmonitoring.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
@Table(name = "oncekiIslemBilgisi")
public class OncekiIslemBilgisi {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "islemAdedi", nullable = false)
    private int islemAdedi;

    @Column(name = "islemTarihi", nullable = false)
    private LocalDate islemTarihi;

    @Column(name = "saglikTesisKodu", length = 8, nullable = false)
    private int saglikTesisKodu;

    @Column(name = "tesisAdi", length = 100, nullable = false)
    private String tesisAdi;

}
