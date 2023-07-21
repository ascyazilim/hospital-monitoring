package com.birkil.hospitalmonitoring.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "katilimPayi")
public class KatilimPayi {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String takipNo;

    @Column
    private Double muayeneKatilimTutari;

    @Column
    private Double malzemeKatilimTutari;

    @Column
    private Double tupBebekKatilimTutari;


}
