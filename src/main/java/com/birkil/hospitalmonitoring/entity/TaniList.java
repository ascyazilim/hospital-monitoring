package com.birkil.hospitalmonitoring.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "taniList")
public class TaniList {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String icd10Kodu;

    @Column
    private String taniAdi;


    /*@ManyToMany(mappedBy = "taniList")
    private List<MuayeneKaydet> muayeneKaydetList;*/

}
