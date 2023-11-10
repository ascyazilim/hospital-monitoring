package com.birkil.hospitalmonitoring.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "taburcuIstek")
public class TaburcuIstek {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String yatisBilgileri;

    @Column
    private LocalDateTime taburcuTarihi;

    @Column
    private String taburcuTipi;

    @Column
    private String doktor;

    @Column
    private String ekip;

    @Column
    private String aciklama;
}
