package com.birkil.hospitalmonitoring.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "klinikSeyir")
public class KlinikSeyir {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private LocalDateTime tarih;

    @Column
    private String doktor;

    @Column
    private String konsultasyon;

    @Column
    private String asistan;

    @Column
    private String bulgular;

    @Column
    private String tetkik;

    @Column
    private String tedavi;


}
