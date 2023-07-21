package com.birkil.hospitalmonitoring.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "islemDetay")
public class IslemDetay {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "islemSiraNo", length = 20)
    private String islemSiraNo;

    @Column(name = "islemTutari")
    private Double islemTutari;

}
