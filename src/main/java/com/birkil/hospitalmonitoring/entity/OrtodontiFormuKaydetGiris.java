package com.birkil.hospitalmonitoring.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
@Table(name = "ortodontiFormuKaydetGiris")
public class OrtodontiFormuKaydetGiris {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private int saglikTesisKodu;

    @Column(nullable = false)
    private String provizyonNo;

    @Column(nullable = false)
    private String sutKodu;

    @Column(nullable = false)
    private int formNo;

    @Column(nullable = false)
    private LocalDate islemTarihi;

    @Column(length = 11,nullable = false)
    private String tcKimlikNo;
}
