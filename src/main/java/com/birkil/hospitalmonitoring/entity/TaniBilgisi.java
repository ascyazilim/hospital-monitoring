package com.birkil.hospitalmonitoring.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "taniBilgisi")
public class TaniBilgisi {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "islemSiraNo", length = 15, nullable = false)
    private String islemSiraNo;

    @Column(name = "birincilTani", length = 1, nullable = false)
    private String birincilTani;

    @Column(name = "hizmetSunucuRefNo", length = 20, nullable = false)
    private String hizmetSunucuRefNo;

    @Column(name = "taniKodu", length = 10, nullable = false)
    private String taniKodu;

    @Column(name = "taniTipi", length = 1, nullable = false)
    private String taniTipi;

    @Column(name = "ozelDurum", length = 1)
    private String ozelDurum;

    @ElementCollection
    @CollectionTable(name = "ozelDurumlar", joinColumns = @JoinColumn(name = "id"))
    @Column(name = "cokluOzelDurum")
    private List<String> cokluOzelDurum;

}
