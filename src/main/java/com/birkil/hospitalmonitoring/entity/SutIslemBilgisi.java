package com.birkil.hospitalmonitoring.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "sutIslemBilgisi")
public class SutIslemBilgisi {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "tibbi_gereklilik_rapor_id")
    private TibbiGereklilikRapor tibbiGereklilikRapor;
}
