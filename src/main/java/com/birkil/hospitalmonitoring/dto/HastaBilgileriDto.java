package com.birkil.hospitalmonitoring.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
public class HastaBilgileriDto {

    private String id;
    private String tcKimNo;
    private String ad;
    private String soyad;
    private String cinsiyet;
    private LocalDate dogumTarihi;
    private String sigortaliTuru;
    private String devredilenKurum;
    private String katilimPayindanMuaf;
    private String kapsamAdi;
    private String ilaveUcrettenMuaf;
}
