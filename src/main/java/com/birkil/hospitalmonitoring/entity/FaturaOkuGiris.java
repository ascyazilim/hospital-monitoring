package com.birkil.hospitalmonitoring.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
@Table(name = "faturaOkuGiris")
public class FaturaOkuGiris {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "saglikTesisKodu", nullable = false)
    private int saglikTesisKodu;

    @Column(name = "faturaTeslimNo", nullable = false)
    private String faturaTeslimNo;

    @Column(name = "faturaRefNo", length = 20, nullable = false)
    private String faturaRefNo;

    @Column(name = "faturaTarihi", nullable = false)
    private LocalDate faturaTarihi;

    @Column(name = "ktsHbysKodu", nullable = false)
    private String ktsHbysKodu;
}
