package com.birkil.hospitalmonitoring.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "evrakTakip")
public class EvrakTakip {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String takipNo;

    @Column
    private double toplamTutar;

    @OneToMany
    private List<TakipIslemKesinti> kesintiler;

    @Column(length = 1)
    private String grupTuru;

    @Column
    private int grupKodu;


}
