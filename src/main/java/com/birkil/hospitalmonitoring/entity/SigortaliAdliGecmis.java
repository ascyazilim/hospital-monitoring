package com.birkil.hospitalmonitoring.entity;


import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
@Table(name = "sigortaliAdliGecmis")
public class SigortaliAdliGecmis {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "tcKimlikNo", nullable = false, length = 11)
    private String tcKNo;

    @Column(name = "provizyonTipi", nullable = false)
    private String provTipi;

    @Column(name = "provizyonTarihi", nullable = false)
    private LocalDate provTarihi;

    @Column(name = "vakaTarihi", nullable = false)
    private LocalDate vakaTarihi;

    @Column(name = "plakaNo")
    private String plakaNo;

    @Column(name = "vakaİl", nullable = false)
    private int vakaIl;

    @Column(name = "vakaİlce", nullable = false)
    private int vakaIlce;


}
