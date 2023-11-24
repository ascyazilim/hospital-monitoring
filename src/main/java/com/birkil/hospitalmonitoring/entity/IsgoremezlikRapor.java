package com.birkil.hospitalmonitoring.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
@Table(name = "isgoremezlikRapor")
public class IsgoremezlikRapor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String hastaAdiSoyadi;
    private String hastaTcKimNo;
    private String raporDurumu;
    private String meslekHastaligiSuphesi;
    private LocalDate ayaktaBaslamaTarihi;
    private LocalDate ayaktaBitisTarihi;
    private String doktorAdiSoyadi;
    private String doktorBrans;
    private String raporAciklama;
    private LocalDate duzenlendigiTarih;
    private LocalDate baslamaTarihi;
    private String vaka;
    private String duzenlemeTuru;
    private String adliVaka;
    private String yatisDurumu;
    private String yatarakGunSayisi;
    private String ayaktaGunSayisi;

}
