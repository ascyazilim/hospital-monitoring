package com.birkil.hospitalmonitoring.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "takipFormuSilGiris")
public class TakipFormuSilGiris {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String takipFormuNo;

    @Column(nullable = false)
    private int saglikTesisKodu;
}
