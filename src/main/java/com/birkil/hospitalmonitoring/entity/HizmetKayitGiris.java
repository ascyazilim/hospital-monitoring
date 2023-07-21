package com.birkil.hospitalmonitoring.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "hizmetKayitGiris")
public class HizmetKayitGiris {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private AmeliyatGirisimBilgisi ameliyatGirisimBilgisi;

    @ManyToOne
    private DigerIslemBilgisi digerIslemBilgisi;

    //168 .sayfadan devam et

}
