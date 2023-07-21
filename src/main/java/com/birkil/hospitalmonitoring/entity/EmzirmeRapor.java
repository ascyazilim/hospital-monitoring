package com.birkil.hospitalmonitoring.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
@Table
public class EmzirmeRapor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "bebekDogumTarihi", nullable = false)
    private LocalDate bebekDogumTarihi;

    @Column(name = "dogumOncBasTarihi", nullable = false)
    private LocalDate dogumOncBasTarihi;

    @Column(name = "canliCocukSayisi")
    private int canliCocukSayisi;

    @Column(name = "anneTcKimlikNo", length = 11)
    private String anneTcKimlikNo;

    @Column(name = "doganCocukSayisi")
    private int doganCocukSayisi;



}
