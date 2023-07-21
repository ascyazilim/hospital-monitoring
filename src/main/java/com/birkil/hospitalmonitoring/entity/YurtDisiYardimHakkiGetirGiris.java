package com.birkil.hospitalmonitoring.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
@Table(name = "yurtDisiYardimHakkiGetirGiris")
public class YurtDisiYardimHakkiGetirGiris {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String kisiNo;

    @Column(nullable = false)
    private LocalDate provizyonTarihi;

    @Column(nullable = false)
    private int saglikTesisKodu;
}
