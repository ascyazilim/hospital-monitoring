package com.birkil.hospitalmonitoring.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "ilacList")
public class IlacList {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(cascade = CascadeType.ALL)
    private List<FiyatList> fiyatList;

    @Column()
    private double kullanimBirimi;

    @Column(length = 13)
    private String barkod;

    @Column(length = 50)
    private String ilacAdi;

    @Column(length = 1)
    private String eczAktifPasif;

    @Column(length = 1)
    private String hasAktifPasif;

    @Column(length = 1)
    private String ayaktanOdenme;

    @Column(length = 1)
    private String yatanOdenme;

    @Column
    private Double guncelKamuIndirimliFiyati;

    @OneToOne
    private IlacIndirim ilacIndirim;

    @Column
    private int yatanMaksimumKullanimPeriyot;

    @Column
    private int yatanMaksimumKullanimPeriyotBirim;

    @Column
    private int yatanMaksimumKullanimDoz1;

    @Column
    private Double yatanMaksimumKullanimDoz2;

    @Column
    private int ayaktanMaksimumKullanimPeriyot;

    @Column
    private int ayaktanMaksimumKullanimPeriyotBirim;

    @Column
    private int ayaktanMaksimumKullanimDoz1;

    @Column
    private Double ayaktanMaksimumKullanimDoz2;

    @Column
    private Double esdegerGrupFiyati;

    @Column
    private Double esdegerKullanimBirimi;

    @Column
    private String esdegerBarkod;

    @Column
    private String farmasotikFormAdi;


}
