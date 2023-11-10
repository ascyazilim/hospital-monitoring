package com.birkil.hospitalmonitoring.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Entity
@Data
@Table(name = "ameliyatGiris")
public class AmeliyatGiris {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column()
    private LocalDateTime baslangicTarihi;

    @Column()
    private LocalDateTime bitisTarihi;

    @Column()
    private String ameliyathane;

    @Column()
    private String anestezi;

    @Column()
    private String ameliyatTipi;

    @Column
    private String norolojik;

    @Column
    private String abdomen;

    @Column
    private String preopTani;

    @Column
    private String postopTani;

    @Column
    private String sonuc;

    @Column
    private String risk;

    @Column
    private String kalp;

    @Column
    private String gogus;

    @Column
    private String selections;

    @Column
    private String cerrahiEkip;

    @Column
    private String cerrahiPersonel;

    @Column
    private String anesteziEkibi;

    @Column
    private String anesteziPersonel;
}
