package com.birkil.hospitalmonitoring.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Table(name = "ilacRaporHazirlama")
@Data
public class IlacRaporHazirlama {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate raporTarihi;
    private String raporBasligi;
    private String protokolNo;
    private String sayacNo;
    private String duzenlemeTuru;
    private String isteyenDoktor;

}
