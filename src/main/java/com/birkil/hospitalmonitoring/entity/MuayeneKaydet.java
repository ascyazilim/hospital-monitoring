package com.birkil.hospitalmonitoring.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Table(name = "muayeneKaydet")
public class MuayeneKaydet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String sikayet;

    @Column
    private String hikaye;

    @Column
    private String ozgecmis;

    @Column
    private String soygecmis;

    @Column
    private String alerji;

    @Column
    private String sigara;

    @Column
    private String sigaraAciklama;

    @Column
    private String gripAsisi;

    @Column
    private String gripAsisiAciklama;

    /*@ManyToMany
    @JoinTable(
            name = "muayene_tani", joinColumns = @JoinColumn(name = "muayene_id"),
            inverseJoinColumns = @JoinColumn(name = "tani_id")

    )
    private List<TaniList> taniList;*/

}
