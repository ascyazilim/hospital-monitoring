package com.birkil.hospitalmonitoring.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
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

    /*@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "muayene_tani", joinColumns = {@JoinColumn(name = "muayene_id")},
            inverseJoinColumns = {@JoinColumn(name = "tani_id")}
    )
    @JsonManagedReference
    private List<TaniList> taniList = new ArrayList<>();*/

}
