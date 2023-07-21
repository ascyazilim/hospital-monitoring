package com.birkil.hospitalmonitoring.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "tedaviIslemBilgisi")
public class TedaviIslemBilgisi {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @Column(name = "diyalizRaporBilgisi")
    private DiyalizRaporBilgisi diyalizRaporBilgisi;

    @OneToOne
    @Column(name = "eswlRaporBilgisi")
    private ESWLRaporBilgisi eswlRaporBilgisi;

    @OneToOne
    @Column(name = "eswtRaporBilgisi")
    private ESWTRaporBilgisi eswtRaporBilgisi;

    @OneToOne
    @Column(name = "ftrRaporBilgisi")
    private FTRRaporBilgisi ftrRaporBilgisi;

    @OneToOne
    @Column(name = "hotRaporBilgisi")
    private HOTRaporBilgisi hotRaporBilgisi;

    @OneToOne
    @Column(name = "tupBebekRaporBilgisi")
    private TupBebekRaporBilgisi tupBebekRaporBilgisi;

    @OneToOne
    @Column(name = "evHemodiyaliziRaporBilgisi")
    private EvHemodiyaliziRaporBilgisi evHemodiyaliziRaporBilgisi;
}
