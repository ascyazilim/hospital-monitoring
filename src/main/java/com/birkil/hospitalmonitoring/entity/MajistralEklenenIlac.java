package com.birkil.hospitalmonitoring.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "majistralEklenenIlac")
public class MajistralEklenenIlac {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "islemSiraNo", length = 15)
    private String islemSiraNo;

    @Column(name = "barkod", length = 14, nullable = false)
    private String barkod;

    @Column(name = "adet", length = 4, nullable = false)
    private Double adet;

}
