package com.birkil.hospitalmonitoring.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
@Table
public class BarkodSut {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String barkod;

    @Column
    private String firmaTanimlayiciNo;

    @Column
    private String sutKodu;

    @Column
    private LocalDate baslangicTarihi;

    @Column
    private LocalDate bitisTarihi;
}
