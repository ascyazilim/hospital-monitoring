package com.birkil.hospitalmonitoring.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "ftrRaporBilgisi")
public class FTRRaporBilgisi {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private int ftrVucutBolgesiKodu;

    @Column(nullable = false)
    private int seansGun;

    @Column(nullable = false)
    private int seansSayi;

    @Column(nullable = false)
    private String butKodu;

    @Column(length = 1, nullable = false)
    private String tedaviTuru;

}
