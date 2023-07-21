package com.birkil.hospitalmonitoring.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "tahlilSonuc")
public class TahlilSonuc {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "islemSiraNo", length = 15, nullable = false)
    private String islemSiraNo;

    @Column(name = "sonuc", length = 15, nullable = false)
    private String sonuc;

    @Column(name = "tahlilTipi", length = 6, nullable = false)
    private String tahlilTipi;

    @Column(name = "birim", length = 15, nullable = false)
    private String birim;

    @Column(name = "sagSol", length = 1)
    private String sagSol;

    @Column(name = "ayniFarkliKesi", length = 1)
    private String ayniFarkliKesi;

    @Column(name = "aciklama")
    private String aciklama;

}
