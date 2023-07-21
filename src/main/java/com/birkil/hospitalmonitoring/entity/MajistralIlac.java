package com.birkil.hospitalmonitoring.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "majistralIlac")
public class MajistralIlac {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "islemSiraNo", length = 15)
    private String islemSiraNo;

    @Column(name = "preparatTuru", length = 1, nullable = false)
    private String preparatTuru;

    @Column(name = "bolunmusTozTuru", length = 1, nullable = false)
    private String bolunmusTozTuru;

    @Column(name = "preparatAdet", length = 4, nullable = false)
    private String preparatAdet;

    @Column(name = "ambalajTuru", length = 1, nullable = false)
    private String ambalajTuru;

    @Column(name = "ambalajBoyutu", length = 4, nullable = false)
    private String ambalajBoyutu;

    @Column(name = "ambalajAdet", length = 4, nullable = false)
    private String ambalajAdet;

    @ManyToOne
    private MajistralHammadde hammaddeler;

    @ManyToOne
    private MajistralEklenenIlac eklenenIlac;

}
