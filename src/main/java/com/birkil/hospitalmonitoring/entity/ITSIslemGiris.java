package com.birkil.hospitalmonitoring.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "itsIslemGiris")
public class ITSIslemGiris {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "saglikTesisKodu", nullable = false)
    private int saglikTesisKodu;

    @Column(name = "hastaBasvuruNo", nullable = false)
    private String hastaBasvuruNo;

    @Column(name = "islemTipi", length = 1, nullable = false)
    private String islemTipi;

    @ElementCollection
    @CollectionTable(name = "takipNumaralar", joinColumns = @JoinColumn(name = "id"))
    @Column(name = "takipNumaralari", nullable = false)
    private List<String> takipNumaralari;
}
