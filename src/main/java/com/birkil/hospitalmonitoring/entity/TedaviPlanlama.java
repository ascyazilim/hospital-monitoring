package com.birkil.hospitalmonitoring.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "tedaviPlanlama")
public class TedaviPlanlama {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String turu;

    @OneToMany(cascade = CascadeType.ALL)
    private List<TedaviListesi> tedaviAdi;

    @Column
    private String aciklama;

}
