package com.birkil.hospitalmonitoring.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "HataliIslemBilgisi")
public class HataliIslemBilgisi {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "hataKodu", length = 4, nullable = false)
    private String hataKodu;

    @Column(name = "hataMesaji", nullable = false)
    private String hataMesaji;

    @Column(name = "hizmetSunucuRefNo", length = 20, nullable = false)
    private String hizmetSunucuRefNo;

    @ManyToOne
    @Column(name = "oncekiIslemBilgisi")
    private OncekiIslemBilgisi oncekiIslemBilgisi;
}
