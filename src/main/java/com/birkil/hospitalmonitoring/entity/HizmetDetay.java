package com.birkil.hospitalmonitoring.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "hizmetDetay")
public class HizmetDetay {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "aciklama", length = 2000)
    private String aciklama;

    @Column(name = "protokolNo")
    private String protokolNo;

    @Column(name = "taburcuKodu")
    private String taburcuKodu;

    @Column(name = "takipNo")
    private String takipNo;
}
