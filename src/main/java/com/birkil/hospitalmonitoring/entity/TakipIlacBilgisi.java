package com.birkil.hospitalmonitoring.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "takipIlacBilgisi")
public class TakipIlacBilgisi {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "takipNo")
    private String takipNo;

    @ManyToOne
    private ITSIlacBilgisi itsIlacBilgisi;

    @Column(name = "sonucKodu", length = 4)
    private String sonucKodu;

    @Column(name = "sonucMesaji")
    private String sonucMesaji;
}
