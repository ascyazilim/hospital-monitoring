package com.birkil.hospitalmonitoring.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "provizyonDegistirGiris")
public class ProvizyonDegistirGiris {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "takipNo", nullable = false)
    private String takipNo;

    @Column(name = "tesisKodu", nullable = false)
    private int tesisKodu;

    @Column(name = "yeniProvizyonTipi", nullable = false)
    private String yeniProvizyonTipi;
}
