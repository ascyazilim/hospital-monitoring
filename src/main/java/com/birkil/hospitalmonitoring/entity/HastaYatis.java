package com.birkil.hospitalmonitoring.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "hastaYatis")
@Data
public class HastaYatis {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String bolum;
    private String birim;

    private String istekDoktor;

    private String istekAsistan;
    private String yatisTip;
    private String yatakGrubu;
    private String yatakTuru;
    private String aciklama;
    private LocalDateTime yatisTarihi;
    private String yatisSure;
    private String yatisSureTur;
    private LocalDate taburcuTarihi;
}
