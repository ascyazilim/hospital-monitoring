package com.birkil.hospitalmonitoring.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
@Table(name = "barkodSutEslesmeSorguGiris")
public class BarkodSutEslesmeSorguGiris {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private int saglikTesisKodu;

    @Column
    private LocalDate tarih;

    @Column
    private String barkod;

    @Column
    private String firmaTanimlayiciNo;

    @Column
    private String sutKodu;
}
