package com.birkil.hospitalmonitoring.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "hizmet")
public class Hizmet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private AmeliyatGirisimBilgisi ameliyatGirisimBilgisi;

    @ManyToOne
    private DigerIslemBilgisi digerIslemBilgisi;

    @ManyToOne
    private DisBilgisi disBilgisi;

    @ManyToOne
    private IlacBilgisi ilacBilgisi;

    @ManyToOne
    private KonsultasyonBilgisi konsultasyonBilgisi;

    @ManyToOne
    private MalzemeBilgisi malzemeBilgisi;

    @ManyToOne
    private MuayeneBilgisi muayeneBilgisi;

    @ManyToOne
    private TahlilBilgisi tahlilBilgisi;

    @Column(name = "takipNo")
    private String takipNo;

    @ManyToOne
    private TaniBilgisi taniBilgisi;

    @ManyToOne
    private TetkikveRadyolojiBilgisi tetkikveRadyolojiBilgisi;

    @ManyToOne
    private HastaYatisBilgisi hastaYatisBilgisi;

    @Column(name = "odemeSorguDurum")
    private String odemeSorguDurum;

    @Column(name = "triajBeyani")
    private String triajBeyani;




}
