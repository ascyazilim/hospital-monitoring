package com.birkil.hospitalmonitoring.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "ilacRapor")
public class IlacRapor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Rapor rapor;

    @OneToOne
    private RaporEtkinMadde raporEtkinMadde;

    @Column(name = "takipFormuNo")
    private String takipFormuNo;

}
