package com.birkil.hospitalmonitoring.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "maluliyetBransGorusBilgisi")
public class MaluliyetBransGorusBilgisi {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String bransKodu;

    @Column(length = 11, nullable = false)
    private String drTescilNo;

    @Column(nullable = false)
    private String doktorTipi;

    @Column(length = 500, nullable = false)
    private String basvuruNedeni;

    @Column(length = 4000, nullable = false)
    private String anamnez;

    @Column(length = 500, nullable = false)
    private String ozgecmis;

    @Column(length = 500, nullable = false)
    private String soygecmis;

    @Column(length = 4000, nullable = false)
    private String muayeneBulgulari;

    @Column(length = 4000, nullable = false)
    private String tetkikVeLabaratuarBulgulari;

    @OneToMany(mappedBy = "maluliyetBransGorusBilgisi")
    @Column(name = "tanilar", nullable = false)
    private List<MaluliyetBransGorusTaniBilgisi> tanilar;


    @ManyToOne
    @JoinColumn(name = "maluliyet_rapor_id")
    private MaluliyetRapor maluliyetRapor;
}
