package com.birkil.hospitalmonitoring.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
@Table(name = "kurumSevkTalepNoSorguDetay")
public class KurumSevkTalepNoSorguDetay {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 11)
    private String kurumSevkTalepNo;

    @Column(length = 11)
    private String tcKimlikNo;

    @Column
    private LocalDate sevkTarihi;

    @Column
    private int saglikTesisKodu;

    @Column
    private String hastaBasvuruNo;

    @Column
    private String raporTakipNo;

    @Column
    private String aciklama;

    @Column(length = 11)
    private String sigortaliTcNo;

    @Column
    private String ucret;

    @Column
    private String araKarar;
}
