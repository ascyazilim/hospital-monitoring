package com.birkil.hospitalmonitoring.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "raporEtkinMadde")
public class RaporEtkinMadde {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String etkinMaddeKodu;

    @Column
    private int kullanimDoz1;

    @Column
    private int kullanimDoz2;

    @Column(length = 1)
    private String kullanimDozBirim;

    @Column
    private int kullanimPeriyot;

    @Column(length = 1)
    private String kullanimPeriyotBirim;



}
