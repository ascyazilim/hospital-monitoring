package com.birkil.hospitalmonitoring.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table
public class EvrakKesintiGiris {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private int evrakReferansNo;

    @Column(nullable = false)
    private int tesisKodu;

    @Column(length = 1, nullable = false)
    private String grupTuru;

    @Column(nullable = false)
    private String grupKodu;
}
