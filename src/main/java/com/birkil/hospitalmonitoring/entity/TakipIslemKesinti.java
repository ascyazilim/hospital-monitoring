package com.birkil.hospitalmonitoring.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
@Table(name = "takipIslemKesinti")
public class TakipIslemKesinti {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 20)
    private String islemSiraNo;

    @Column(length = 20)
    private String hizmetSunucuRefNo;

    @Column
    private LocalDate islemTarihi;

    @Column(length = 15)
    private String sutKodu;

    @Column(length = 100)
    private String islemAdi;

    @Column
    private double tutar;

    @Column
    private double kesintiTutari;

    @Column(length = 255)
    private String aciklama;
}
