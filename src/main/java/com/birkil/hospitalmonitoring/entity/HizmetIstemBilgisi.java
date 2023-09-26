package com.birkil.hospitalmonitoring.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "hizmetIstemBilgisi")
public class HizmetIstemBilgisi {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String hizmetKodu;

    @Column
    private String istemAdi;

    @Column
    private String sutKodu;

}
