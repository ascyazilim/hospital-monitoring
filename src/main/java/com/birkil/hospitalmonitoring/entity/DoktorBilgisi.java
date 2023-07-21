package com.birkil.hospitalmonitoring.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "doktorBilgisi")
public class DoktorBilgisi {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 16, nullable = false)
    private String drTescilNo;

    @Column(length = 50)
    private String drAdi;

    @Column(length = 50)
    private String drSoyadi;

    @Column(length = 4)
    private String drBransKodu;

    @Column(length = 1)
    private String tipi;

    @ManyToOne
    @JoinColumn(name = "maluliyet_rapor_id")
    private MaluliyetRapor maluliyetRapor;

    @ManyToOne
    @JoinColumn(name = "engellilik_rapor_id")
    private EngellilikRapor engellilikRapor;

    @ManyToOne
    @JoinColumn(name = "tibbi_gereklilik_rapor_id")
    private TibbiGereklilikRapor tibbiGereklilikRapor;
}
