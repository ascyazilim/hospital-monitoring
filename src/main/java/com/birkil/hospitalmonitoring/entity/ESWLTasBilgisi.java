package com.birkil.hospitalmonitoring.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "eswlTasBilgisi")
public class ESWLTasBilgisi {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String tasBoyutu;

    @Column(nullable = false)
    private int tasLokalizasyonKodu;


}
