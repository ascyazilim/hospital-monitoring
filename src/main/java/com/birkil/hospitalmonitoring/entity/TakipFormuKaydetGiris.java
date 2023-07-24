package com.birkil.hospitalmonitoring.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "takipFormuKaydetGiris")
public class TakipFormuKaydetGiris {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "diabetTakipFormu", nullable = false)
    private DiabetTakipFormuKayit diabetTakipFormuKayit;

    @Column(nullable = false)
    private int kullaniciTesisKodu;
}
