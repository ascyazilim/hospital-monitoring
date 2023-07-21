package com.birkil.hospitalmonitoring.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "majistralHammadde")
public class MajistralHammadde {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "islemSiraNo", length = 15)
    private String islemSiraNo;

    @Column(name = "majistralHamMadde", nullable = false)
    private int majistralHamMadde;

    @Column(name = "miktar", nullable = false)
    private int miktar;

    @Column(name = "hamMaddeBirimi", length = 1, nullable = false)
    private String hamMaddeBirimi;

}
