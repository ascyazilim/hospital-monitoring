package com.birkil.hospitalmonitoring.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "hizmetOkuGiris")
public class HizmetOkuGiris {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ElementCollection
    @CollectionTable(name = "islemSiraNumaralar", joinColumns = @JoinColumn(name = "id"))
    @Column(name = "islemSiraNumaralari")
    private List<String> islemSiraNumaralari;

    @ElementCollection
    @CollectionTable(name = "hizmetSunucuRefNolar", joinColumns = @JoinColumn(name = "id"))
    @Column(name = "hizmetSunucuRefNolari")
    private List<String> hizmetSunucuRefNolari;

    @Column(name = "saglikTesisKodu", nullable = false)
    private int saglikTesisKodu;

    @Column(name = "takipNo", nullable = false)
    private String takipNo;

    @Column(name = "ktsHbysKodu", nullable = false)
    private String ktsHbysKodu;





}
