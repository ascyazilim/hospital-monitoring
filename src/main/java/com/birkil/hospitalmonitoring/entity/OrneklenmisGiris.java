package com.birkil.hospitalmonitoring.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "orneklenmisGiris")
public class OrneklenmisGiris {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private int evrakRefNo;

    @Column(nullable = false)
    private int saglikTesisKodu;

    @Column(length = 1, nullable = false)
    private String grupTuru;

    @Column
    private int grupKodu;
}
