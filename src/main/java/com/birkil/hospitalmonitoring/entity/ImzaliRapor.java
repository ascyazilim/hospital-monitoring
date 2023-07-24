package com.birkil.hospitalmonitoring.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "imzaliRapor")
public class ImzaliRapor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private int turu;

    @OneToOne
    @JoinColumn(name = "maluliyetRaporId")
    private MaluliyetRapor maluliyetRapor;

    @OneToOne
    @JoinColumn(name = "engellilikRaporId")
    private EngellilikRapor engellilikRapor;

    @OneToOne
    @JoinColumn(name = "tibbiGereklilikRaporId")
    private TibbiGereklilikRapor tibbiGereklilikRapor;
}
