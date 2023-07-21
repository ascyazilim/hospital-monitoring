package com.birkil.hospitalmonitoring.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "eNabizBildirimSorguGiris")
public class ENabizBildirimSorguGiris {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private int saglikTesisKodu;

    @Column(nullable = false)
    private String takipNo;

    @Column
    private String hizmetSunucuRefNo;
}
