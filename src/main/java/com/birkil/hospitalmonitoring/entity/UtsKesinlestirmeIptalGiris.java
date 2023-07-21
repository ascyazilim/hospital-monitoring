package com.birkil.hospitalmonitoring.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "utsKesinlestirmeIptalGiris")
public class UtsKesinlestirmeIptalGiris {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "saglikTesisKodu", nullable = false)
    private int saglikTesisKodu;

    @Column(name = "kullanimBildirimID", length = 36, nullable = false)
    private String kullanimBildirimID;


}
