package com.birkil.hospitalmonitoring.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "eswtRaporBilgisi")
public class ESWTRaporBilgisi {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private int eswtVucutBolgesiKodu;

    @Column(nullable = false)
    private int seansGun;

    @Column(nullable = false)
    private int seansSayi;

    @Column(nullable = false)
    private String butKodu;
}
