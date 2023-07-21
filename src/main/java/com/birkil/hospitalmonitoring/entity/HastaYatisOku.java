package com.birkil.hospitalmonitoring.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "hastaYatisOku")
public class HastaYatisOku {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "hastaBasvuruNo", nullable = false)
    private String hastaBasvuruNo;

    @Column(name = "saglikTesisKodu", nullable = false)
    private int saglikTesisKodu;
}
