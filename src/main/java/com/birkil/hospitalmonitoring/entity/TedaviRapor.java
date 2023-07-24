package com.birkil.hospitalmonitoring.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "tedaviRapor")
public class TedaviRapor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(nullable = false)
    private Rapor rapor;

    @OneToOne
    @JoinColumn(nullable = false)
    private TedaviIslemBilgisi tedaviIslemBilgisi;

    @Column(name = "tedaviRaporTuru", nullable = false)
    private int tedaviRaporTuru;

}
