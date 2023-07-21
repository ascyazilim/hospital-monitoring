package com.birkil.hospitalmonitoring.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "kisiGecmisIslemlerGiris")
public class KisiGecmisIslemlerGiris {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private int saglikTesisKodu;

    @Column(length = 11, nullable = false)
    private String hastaTCKimlikNo;

    @Column(nullable = false)
    private String sutKodu;
}
