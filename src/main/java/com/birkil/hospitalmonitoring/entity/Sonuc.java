package com.birkil.hospitalmonitoring.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "sonuc")
public class Sonuc {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String sonucKodu;

    @Column(nullable = false)
    private String sonucMesaji;

    @Column
    private String uyariMesaji;


}
