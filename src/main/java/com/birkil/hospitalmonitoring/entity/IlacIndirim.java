package com.birkil.hospitalmonitoring.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
@Table(name = "ilacIndirim")
public class IlacIndirim {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private double kamuIndOranAlt;

    @Column
    private double kamuIndOranUst;

    @Column
    private LocalDate gecerlilikTarihi;

    @Column
    private int ilac_id;

    @Column
    private double indirimOrani1;

    @Column
    private double indirimOrani2;

    @Column
    private double indirimOrani3;

    @Column
    private double indirimOrani4;


}
