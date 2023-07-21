package com.birkil.hospitalmonitoring.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
@Table(name = "damarIziDogrulamaSorguGiris")
public class DamarIziDogrulamaSorguGiris {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 11)
    private String tckNo;

    @Column(nullable = false)
    private LocalDate islemTarihi;

    @Column(nullable = false)
    private int tesisKodu;
}
