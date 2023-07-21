package com.birkil.hospitalmonitoring.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "takipSilGiris")
public class TakipSilGiris {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "saglikTescilKodu", nullable = false)
    private int saglikTescilKodu;

    @Column(name = "takipNo", nullable = false)
    private String takipNo;

    @Column(name = "ktsHbysKodu", nullable = false)
    private String ktsHbysKodu;




}
