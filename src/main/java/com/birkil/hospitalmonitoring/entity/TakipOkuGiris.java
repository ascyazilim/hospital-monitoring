package com.birkil.hospitalmonitoring.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "takipOkuGiris")
public class TakipOkuGiris {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "saglikTesisKodu", nullable = false)
    private int saglikTesisKodu;

    @Column(name = "takipNo", nullable = false)
    private String takipNo;

    @Column(name = "yeniTedaviTipi", nullable = false)
    private int yeniTedaviTipi;

    @Column(name = "ktsHbysKodu", nullable = false)
    private String ktsHbysKodu;


}
