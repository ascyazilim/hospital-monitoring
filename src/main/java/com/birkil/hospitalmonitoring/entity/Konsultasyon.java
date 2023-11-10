package com.birkil.hospitalmonitoring.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "konsultasyon")
public class Konsultasyon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String istekBolumAdi;

    @Column
    private String istekBirimAdi;

    @Column
    private String istekDoktorAdi;

    @Column
    private String istekDoktorIletisim;

    @Column
    private String istekAsistanAdi;

    @Column
    private LocalDateTime istekTarih;

    @Column
    private String istekNedeni;

    @Column
    private String karsilamaBolumAdi;

    @Column
    private String karsilamaBirimAdi;

    @Column
    private String karsilamaDoktorAdi;

    @Column
    private String karsilamaAsistanAdi;

    @Column
    private String karsilamaEkip;

    @Column
    private LocalDateTime karsilamaTarih;

    @Column
    private String karsilamaCevap;

    @Column
    private String istekNotu;

    @Column
    private String karsilamaNotu;
}
