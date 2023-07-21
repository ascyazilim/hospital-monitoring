package com.birkil.hospitalmonitoring.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "takipFormuOkuGiris")
public class TakipFormuOkuGiris {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String tcKimlikNo;

    @Column(nullable = false)
    private int saglikTesisKodu;

}
