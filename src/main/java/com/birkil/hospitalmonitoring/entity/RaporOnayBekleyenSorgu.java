package com.birkil.hospitalmonitoring.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "raporOnayBekleyenSorgu")
public class RaporOnayBekleyenSorgu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 8, nullable = false)
    private int saglikTesisKodu;

    @Column(length = 11, nullable = false)
    private String doktorTcKimlikNo;



}
