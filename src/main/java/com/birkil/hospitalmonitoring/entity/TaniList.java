package com.birkil.hospitalmonitoring.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
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
    @JsonBackReference
    private List<MuayeneKaydet> muayeneKaydetList;*/
}
