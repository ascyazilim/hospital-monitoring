package com.birkil.hospitalmonitoring.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "faturaIptalGiris")
public class FaturaIptalGiris {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "saglikTesisKodu", nullable = false)
    private int saglikTesisKodu;

    @ElementCollection
    @CollectionTable(name = "faturaTeslimNos", joinColumns = @JoinColumn(name = "id"))
    @Column(name = "faturaTeslimNo", nullable = false)
    private List<String> faturaTeslimNo;

    @Column(name = "ktsHbysKodu", nullable = false)
    private String ktsHbysKodu;
}
