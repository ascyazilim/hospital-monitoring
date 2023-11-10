package com.birkil.hospitalmonitoring.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "tahlilSonuc")
public class TahlilSonuc {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String rontgenSonuc;

    @Column
    private String kanSonuc;

    @Column
    private String idrarSonuc;

    @Column
    private String tomografiSonuc;

}
