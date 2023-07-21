package com.birkil.hospitalmonitoring.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "ortodontiFormuOkuGiris")
public class OrtodontiFormuOkuGiris {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private int saglikTesisKodu;

    @Column(nullable = false)
    private String sutKodu;

    @Column(nullable = false)
    private int formNo;

    @Column(length = 11, nullable = false)
    private String tcKimlikNo;

}
