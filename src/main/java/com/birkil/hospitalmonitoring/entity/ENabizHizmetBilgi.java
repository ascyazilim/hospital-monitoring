package com.birkil.hospitalmonitoring.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
@Table(name = "eNabizHizmetBilgi")
public class ENabizHizmetBilgi {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String hizmetSunucuRefNo;

    @Column
    private String islemKodu;

    @Column
    private LocalDate islemTarihi;

}
