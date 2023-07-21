package com.birkil.hospitalmonitoring.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "kurumSevkTalepNoSorguGiris")
public class KurumSevkTalepNoSorguGiris {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 11, nullable = false)
    private String tcKimlikNo;

    @Column(nullable = false)
    private String saglikTesisKodu;


}
