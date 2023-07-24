package com.birkil.hospitalmonitoring.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "raporSorgu")
public class RaporSorgu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "raporOku", nullable = false)
    private RaporOku raporOku;

    @Column(nullable = false)
    private int kullaniciTesisKodu;

}
