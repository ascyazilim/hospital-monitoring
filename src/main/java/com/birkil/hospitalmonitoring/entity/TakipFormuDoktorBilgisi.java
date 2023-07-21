package com.birkil.hospitalmonitoring.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "takipFormuDoktorBilgisi")
public class TakipFormuDoktorBilgisi {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String drTescilNo;

    @Column(length = 4, nullable = false)
    private String drBransKodu;

    @Column(nullable = false)
    private String dmEgitimiAlmisMi;


}
