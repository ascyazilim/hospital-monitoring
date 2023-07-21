package com.birkil.hospitalmonitoring.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "hotRaporBilgisi")
public class HOTRaporBilgisi {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private int seansGun;

    @Column(nullable = false)
    private int seansSayi;

    @Column(nullable = false)
    private int tedaviSuresi;



}
