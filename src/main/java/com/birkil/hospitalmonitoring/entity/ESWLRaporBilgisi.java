package com.birkil.hospitalmonitoring.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "eswlRaporBilgisi")
public class ESWLRaporBilgisi {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String butKodu;

    @Column(nullable = false)
    private int eswlRaporuTasSayisi;

    @Column(nullable = false)
    private int eswlRaporuSeansSayisi;

    @Column(nullable = false)
    private int bobrekBilgisi;

    @OneToOne
    @Column(name = "eswlTasBilgisi", nullable = false)
    private ESWLTasBilgisi eswlTasBilgisi;

}
