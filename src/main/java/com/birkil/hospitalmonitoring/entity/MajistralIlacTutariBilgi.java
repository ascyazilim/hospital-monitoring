package com.birkil.hospitalmonitoring.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "majistralIlacTutariBilgi")
public class MajistralIlacTutariBilgi {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "takipNo")
    private String takipNo;

    @Column(name = "islemSiraNo", length = 20)
    private String islemSiraNo;

    @Column(name = "hizmetSunucuRefNo", length = 20)
    private String hizmetSunucuRefNo;

    @Column(name = "majistralIlacTutari")
    private Double majistralIlacTutari;
}
