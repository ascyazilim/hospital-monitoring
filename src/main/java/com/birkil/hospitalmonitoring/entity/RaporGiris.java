package com.birkil.hospitalmonitoring.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "raporGiris")
public class RaporGiris {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private IlacRapor ilacRapor;

    @ManyToOne
    private MaluliyetRapor maluliyetRapor;

    @ManyToOne
    private TedaviRapor tedaviRapor;

    @ManyToOne
    private IsgoremezlikRapor isgoremezlikRapor;

    @Column(name = "kullaniciTesisKodu", nullable = false)
    private int kullaniciTesisKodu;
}
