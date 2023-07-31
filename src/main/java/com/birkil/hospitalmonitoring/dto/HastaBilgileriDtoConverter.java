package com.birkil.hospitalmonitoring.dto;

import org.springframework.stereotype.Component;

import com.birkil.hospitalmonitoring.entity.HastaBilgileri;

@Component
public class HastaBilgileriDtoConverter {

    public HastaBilgileriDto converterToDto(HastaBilgileri hastaBilgileri){
        
        HastaBilgileriDto dto = new HastaBilgileriDto();
        //dto.setId(hastaBilgileri.getId());
        dto.setTcKimNo(hastaBilgileri.getTcKimNo());
        dto.setAd(hastaBilgileri.getAd());
        dto.setSoyad(hastaBilgileri.getSoyad());
        dto.setCinsiyet(hastaBilgileri.getCinsiyet());
        dto.setDogumTarihi(hastaBilgileri.getDogumTarihi());
        dto.setSigortaliTuru(hastaBilgileri.getSigortaliTuru());
        dto.setDevredilenKurum(hastaBilgileri.getDevredilenKurum());
        dto.setKatilimPayindanMuaf(hastaBilgileri.getKatilimPayindanMuaf());
        dto.setKapsamAdi(hastaBilgileri.getKapsamAdi());
        dto.setIlaveUcrettenMuaf(hastaBilgileri.getIlaveUcrettenMuaf());
        
        return dto;
    }
    
}
