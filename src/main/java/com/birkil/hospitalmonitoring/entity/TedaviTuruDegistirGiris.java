package com.birkil.hospitalmonitoring.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
@Table(name = "tedaviTuruDegistirGiris")
public class TedaviTuruDegistirGiris {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "takipNo", nullable = false)
    private String takipNo;

    @Column(name = "tesisKodu", nullable = false)
    private int tesisKodu;

    @Column(name = "yeniTedaviTuru", nullable = false)
    private String yeniTedaviTuru;

    @Column(name = "yatisBitisTarihi", nullable = false)
    private LocalDate yatisBitisTarihi;

}
