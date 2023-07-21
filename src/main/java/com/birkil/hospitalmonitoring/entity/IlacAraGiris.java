package com.birkil.hospitalmonitoring.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "ilacAraGiris")
public class IlacAraGiris {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 13)
    private String barkod;

    @Column(length = 50)
    private String ilacAdi;

    @Column(nullable = false)
    private int saglikTesisKodu;

    
}
