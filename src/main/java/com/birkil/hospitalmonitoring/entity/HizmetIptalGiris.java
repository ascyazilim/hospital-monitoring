package com.birkil.hospitalmonitoring.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "hizmetIptalGiris")
public class HizmetIptalGiris {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ElementCollection
    @CollectionTable(name = "islemSiraNumaralar", joinColumns = @JoinColumn(name = "id"))
    @Column(name = "islemSiraNumaralari")
    private List<String> islemSiraNumaralari;

    @Column(name = "saglikTesisKodu", nullable = false)
    private int saglikTesisKodu;

    @Column(name = "takipNo", nullable = false)
    private String takipNo;

    @Column(name = "ktsHbysKodu", nullable = false)
    private String ktsHbysKodu;


}
