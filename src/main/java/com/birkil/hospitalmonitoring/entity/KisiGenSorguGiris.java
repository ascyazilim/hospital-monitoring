package com.birkil.hospitalmonitoring.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "kisiGenSorguGiris")
public class KisiGenSorguGiris {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 11, nullable = false)
    private String hastaTCKimlikNo;

    @Column(nullable = false)
    private String saglikTesisKodu;

    @Column
    private String sutKodu;

    @Column(nullable = false)
    private String genKodu;

}
