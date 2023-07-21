package com.birkil.hospitalmonitoring.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalTime;

@Entity
@Data
@Table(name = "cocukBilgisi")
public class CocukBilgisi {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 1, nullable = false)
    private String cinsiyet;

    @Column(length = 5, nullable = false)
    private String kilo;

    @Column(length = 5, nullable = false)
    private LocalTime dogumSaati;


}
