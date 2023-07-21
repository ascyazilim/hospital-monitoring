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
    @Column(name = "maluliyetRaporu")
    private MaluliyetRapor maluliyetRapor;

    @OneToOne
    @Column(name = "engellilikRapor")
    private EngellilikRapor engellilikRapor;

    @OneToOne
    @Column(name = "tibbiGereklilikRapor")
    private TibbiGereklilikRapor tibbiGereklilikRapor;
}
