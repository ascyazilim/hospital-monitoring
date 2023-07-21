package com.birkil.hospitalmonitoring.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "faturaDetay")
public class FaturaDetay {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "takipNo")
    private String takipNo;

    @Column(name = "takipToplamTutar")
    private Double takipToplamTutar;

    @ManyToOne
    private IslemDetay islemDetay;

}
