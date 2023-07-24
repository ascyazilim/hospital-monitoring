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
    @JoinColumn(name = "diyalizRaporBilgisi")
    private DiyalizRaporBilgisi diyalizRaporBilgisi;

    @OneToOne
    @JoinColumn(name = "eswlRaporBilgisi")
    private ESWLRaporBilgisi eswlRaporBilgisi;

    @OneToOne
    @JoinColumn(name = "eswtRaporBilgisi")
    private ESWTRaporBilgisi eswtRaporBilgisi;

    @OneToOne
    @JoinColumn(name = "ftrRaporBilgisi")
    private FTRRaporBilgisi ftrRaporBilgisi;

    @OneToOne
    @JoinColumn(name = "hotRaporBilgisi")
    private HOTRaporBilgisi hotRaporBilgisi;

    @OneToOne
    @JoinColumn(name = "tupBebekRaporBilgisi")
    private TupBebekRaporBilgisi tupBebekRaporBilgisi;

    @OneToOne
    @JoinColumn(name = "evHemodiyaliziRaporBilgisi")
    private EvHemodiyaliziRaporBilgisi evHemodiyaliziRaporBilgisi;
}
