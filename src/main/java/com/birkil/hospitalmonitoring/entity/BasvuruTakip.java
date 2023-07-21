package com.birkil.hospitalmonitoring.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "basvuruTakip")
public class BasvuruTakip {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "takipNo", nullable = false)
    private String takipNo;

    @Column(name = "takipFaturaDurmu", nullable = false)
    private String takipFaturaDurumu;
}
