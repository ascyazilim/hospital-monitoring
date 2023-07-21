package com.birkil.hospitalmonitoring.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "katilimPayiGiris")
public class KatilimPayiGiris {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private int evrakRefNo;

    @Column(nullable = false)
    private int saglikTesisKodu;

}
