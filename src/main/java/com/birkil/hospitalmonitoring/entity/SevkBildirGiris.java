package com.birkil.hospitalmonitoring.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
@Table(name = "sevkBildirGiris")
public class SevkBildirGiris {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "takipNo", nullable = false)
    private String takipNo;

    @Column(name = "tesisKodu", nullable = false)
    private int tesisKodu;

    @Column(name = "sevkEdilisTarihi", nullable = false)
    private LocalDate sevkEdilisTarihi;

    @Column(name = "sevkEdilenBransKodu", nullable = false)
    private String sevkEdilenBransKodu;


}
