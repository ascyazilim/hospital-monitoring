package com.birkil.hospitalmonitoring.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "raporOkuRaporTakipNodan")
public class RaporOkuRaporTakipNodan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String raporTakipNo;

    @Column(nullable = false)
    private int kullaniciTesisKodu;

    @Column(nullable = false)
    private String raporSiraNo;


}
