package com.birkil.hospitalmonitoring.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "evHemodiyaliziRaporBilgisi")
public class EvHemodiyaliziRaporBilgisi {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String butKodu;

    @Column(nullable = false)
    private int seansSayi;

    @Column(nullable = false)
    private int tedaviSuresi;


}
