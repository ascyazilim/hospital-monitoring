package com.birkil.hospitalmonitoring.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "takipTipiDegistirGiris")
public class TakipTipiDegistirGiris {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "takipNo", nullable = false)
    private String takipNo;

    @Column(name = "tesisKodu", nullable = false)
    private int tesisKodu;

    @Column(name = "yeniTakipTipi", nullable = false)
    private String yeniTakipTipi;


}
