package com.birkil.hospitalmonitoring.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
@Table(name = "yesilKartliHastaSevkBilgileri")
public class yesilKartliHastaSevkBilgileri {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "sevkEdilenBransKodu", nullable = false)
    private String sevkEdilenBransKodu;

    @Column(name = "sevkEdilenTesisKodu", nullable = false)
    private String sevkEdilenTesisKodu;

    @Column(name = "sevkEdilmeTarihi", nullable = false)
    private LocalDate sevkEdilmeTarihi;

    @Column(name = "takipNo", nullable = false)
    private String takipNo;

}
