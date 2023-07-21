package com.birkil.hospitalmonitoring.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "kayitliIslemBilgisi")
public class KayitliIslemBilgisi {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "hizmetSunucuRefNo", length = 20)
    private String hizmetSunucuRefNo;

    @Column(name = "islemSiraNo", length = 15)
    private String islemSiraNo;
}
