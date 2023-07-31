package com.birkil.hospitalmonitoring.service;

import com.birkil.hospitalmonitoring.entity.HastaBilgileri;
import com.birkil.hospitalmonitoring.repository.HastaBilgileriRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HastaBilgileriService {

    private final HastaBilgileriRepository hastaBilgileriRepository;

    @Autowired
    public HastaBilgileriService(HastaBilgileriRepository hastaBilgileriRepository) {
        this.hastaBilgileriRepository = hastaBilgileriRepository;
    }

    public List<HastaBilgileri> getAllHasta() {
        return hastaBilgileriRepository.findAll();
    }

    public HastaBilgileri getHastaById(long id) {
        Optional<HastaBilgileri> optionalHasta = hastaBilgileriRepository.findById(id);
        return optionalHasta.orElse(null);
    }

    public HastaBilgileri createHasta(HastaBilgileri hastaBilgileri) {
        return hastaBilgileriRepository.save(hastaBilgileri);
    }

    public HastaBilgileri updateHasta(long id, HastaBilgileri hastaBilgileri) {

        HastaBilgileri existingHasta = getHastaById(id);
        if(existingHasta != null){
            existingHasta.setAd(hastaBilgileri.getAd());
            existingHasta.setSoyad(hastaBilgileri.getSoyad());
            existingHasta.setTcKimNo(hastaBilgileri.getTcKimNo());
            existingHasta.setCinsiyet(hastaBilgileri.getCinsiyet());
            existingHasta.setDogumTarihi(hastaBilgileri.getDogumTarihi());
            existingHasta.setSigortaliTuru(hastaBilgileri.getSigortaliTuru());
            existingHasta.setDevredilenKurum(hastaBilgileri.getDevredilenKurum());
            existingHasta.setKatilimPayindanMuaf(existingHasta.getKatilimPayindanMuaf());
            existingHasta.setKapsamAdi(existingHasta.getKapsamAdi());
            existingHasta.setIlaveUcrettenMuaf(existingHasta.getIlaveUcrettenMuaf());
            //existingHasta.setTakip(existingHasta.getTakip());

            return hastaBilgileriRepository.save(existingHasta);
        }
        else {
            return null;
        }
    }

    public boolean deleteHasta(long id) {
        if (hastaBilgileriRepository.existsById(id)) {
            hastaBilgileriRepository.deleteById(id);
            return true;
        } else {
            return false;
        }

    }
}
