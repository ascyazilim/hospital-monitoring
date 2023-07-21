package com.birkil.hospitalmonitoring.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
@Table(name = "sevkBildirSonuc")
public class SevkBildirSonuc {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "takipNo")
    private String takipNo;

    @Column(name = "sevkEdilisTarihi")
    private LocalDate sevkEdilisTarihi;

    @Column(name = "sonucKodu", length = 4, nullable = false)
    private String sonucKodu;

    @Column(name = "sonucMesajı", nullable = false)
    private String sonucMesajı;
}
