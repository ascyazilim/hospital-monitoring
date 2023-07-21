package com.birkil.hospitalmonitoring.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "tupBebekRaporBilgisi")
public class TupBebekRaporBilgisi {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private int tupBebekRaporTuru;

    @Column(nullable = false)
    private String butKodu;

}
