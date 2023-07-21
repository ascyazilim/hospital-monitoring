package com.birkil.hospitalmonitoring.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
@Table(name = "yeniDoganBilgisi")
public class YeniDoganBilgisi {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "dogumTarihi", nullable = false)
    private LocalDate dogumTarihi;

    @Column(name = "cocukSira", nullable = false)
    private int cocukSira;

    @ManyToOne
    @JoinColumn(name = "provizyonGiris_id")
    private ProvizyonGiris provizyonGiris;


}
