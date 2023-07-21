package com.birkil.hospitalmonitoring.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "maluliyetBransGorusTaniBilgisi")
public class MaluliyetBransGorusTaniBilgisi {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String icd10Kodu;

    @Column(length = 500, nullable = false)
    private String aciklama;

    private String taniNeden;

    @ManyToOne
    @JoinColumn(name = "maluliyet_brans_gorus_bilgisi_id")
    private MaluliyetBransGorusBilgisi maluliyetBransGorusBilgisi;


}
