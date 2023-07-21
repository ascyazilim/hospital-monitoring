package com.birkil.hospitalmonitoring.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "doktorAraGiris")
public class DoktorAraGiris {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 30)
    private String drAdi;

    @Column(length = 30)
    private String drSoyadi;

    @Column(length = 4)
    private String drBransKodu;

    @Column(length = 20)
    private String drDiplomaNo;

    @Column(length = 16)
    private String drTescilNo;

    @Column(nullable = false)
    private int saglikTesisKodu;
}
