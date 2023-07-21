package com.birkil.hospitalmonitoring.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "takipBilgisiList")
public class TakipBilgisiList {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String takipNo;

    @Column
    private String grupTuru;

    @Column
    private String grupAdi;

    @Column
    private Double toplamTutar;
}
