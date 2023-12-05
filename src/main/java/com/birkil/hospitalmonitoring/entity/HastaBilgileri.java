package com.birkil.hospitalmonitoring.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.hibernate.annotations.GenericGenerator;


import java.time.LocalDate;
import java.util.UUID;

@Data
@NoArgsConstructor
@Entity
@Table(name = "hastaBilgileri")
public class HastaBilgileri {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "tcKimlikNo", nullable = false)
    private String tcKimNo;

    @Column(name = "ad", length = 50, nullable = false)
    private String ad;

    @Column(name = "soyad", length = 50, nullable = false)
    private String soyad;

    @Column(name = "cinsiyet", length = 1, nullable = false)
    private String cinsiyet;

    @Column(name = "dogumTarihi", nullable = false)
    private LocalDate dogumTarihi;

    @Column(name = "sigortaliTuru", length = 1, nullable = false)
    private String sigortaliTuru;

    @Column(name = "devredilenKurum", length = 1)
    private String devredilenKurum;

    @Column(name = "katilimPayindanMuaf", nullable = false)
    private String katilimPayindanMuaf;

    @Column(name = "kapsamAdi", nullable = false)
    private String kapsamAdi;

    @Column(name = "ilaveUcrettenMuaf", nullable = false)
    private String ilaveUcrettenMuaf;

    @ManyToOne
    @JoinColumn(name = "takip_id")
    private Takip takip;

}
