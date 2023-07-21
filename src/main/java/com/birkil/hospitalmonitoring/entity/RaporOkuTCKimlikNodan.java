package com.birkil.hospitalmonitoring.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table
public class RaporOkuTCKimlikNodan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 11, nullable = false)
    private String tckimlikNo;

    @Column(length = 1, nullable = false)
    private String raporTuru;

    @Column(nullable = false)
    private int kullaniciTesisKodu;
}
