package com.birkil.hospitalmonitoring.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "majistralIlacTutariSorguGiris")
public class MajistralIlacTutariSorguGiris {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "takipNo")
    private String takipNo;

    @Column(name = "saglikTesisKodu")
    private int saglikTesisKodu;

    @Column(name = "hizmetSunucuRefNo", length = 20)
    private String hizmetSunucuRefNo;



}
