package com.birkil.hospitalmonitoring.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "taahhutDis")
public class TaahhutDis {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String sutKodu;

    @Column(nullable = false)
    private int disNo;

    @ManyToOne
    @JoinColumn(name = "taahhut_kayit_id", nullable = false)
    private TaahhutKayit taahhutKayit;

}
