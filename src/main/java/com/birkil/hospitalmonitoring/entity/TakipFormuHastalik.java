package com.birkil.hospitalmonitoring.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "takipFormuHastalik")
public class TakipFormuHastalik {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private int hastalikKodu;

    @Column
    private String digerHastalikTaniKodu;

}
