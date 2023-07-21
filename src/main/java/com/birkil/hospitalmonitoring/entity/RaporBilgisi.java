package com.birkil.hospitalmonitoring.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
@Table(name = "raporBilgisi")
public class RaporBilgisi {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private int raporTesisKodu;

    @Column(nullable = false)
    private LocalDate tarih;

    @Column(length = 20, nullable = false)
    private String no;

    @Column(length = 20, nullable = false)
    private String raporTakipNo;

    @Column(nullable = false)
    private int raporSiraNo;

    @Column(nullable = false)
    private int aVakaTKaza;

}
