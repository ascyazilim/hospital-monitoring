package com.birkil.hospitalmonitoring.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "taahhutKayit")
public class TaahhutKayit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String takipNo;

    @Column(nullable = false)
    private int saglikTesisKodu;

    @OneToOne
    @JoinColumn(name = "taahhut_id", nullable = false)
    private Taahhut taahhut;


    @OneToMany(mappedBy = "taahhutKayit")
    @Column(name = "taahhutDis", nullable = false)
    private List<TaahhutDis> taahhutDis;
}
