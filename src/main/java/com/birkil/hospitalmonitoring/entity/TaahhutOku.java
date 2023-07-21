package com.birkil.hospitalmonitoring.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "taahhutOku")
public class TaahhutOku {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String saglikTesisKodu;

    @Column(nullable = false)
    private String taahhutNo;
}
