package com.birkil.hospitalmonitoring.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "utsKesinlestirmeKayit")
public class UTSKesinlestirmeKayit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "kullanimBildirimID", length = 36)
    private String kullanimBildirimID;

    @Column(name = "saglikTesisKodu")
    private int saglikTesisKodu;

    @Column(name = "tcKimlikNo", length = 11)
    private String tcKNo;

    @Column(name = "seriNo")
    private String seriNo;

    @Column(name = "lotNo")
    private String lotNo;

    @Column(name = "hizmetSunucuReferansNo")
    private String hizmetSunucuReferansNo;

    @Column(name = "takipNo")
    private String takipNo;

    @Column(name = "durum", length = 1)
    private String durum;
}
