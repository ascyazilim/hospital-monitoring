package com.birkil.hospitalmonitoring.service;

import com.birkil.hospitalmonitoring.entity.HastaBilgileri;
import com.birkil.hospitalmonitoring.repository.HastaBilgileriRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HastaBilgileriService {

    private final HastaBilgileriRepository hastaBilgileriRepository;

    public HastaBilgileriService(HastaBilgileriRepository hastaBilgileriRepository) {
        this.hastaBilgileriRepository = hastaBilgileriRepository;
    }

    public List<HastaBilgileri> getAllHasta() {
        return hastaBilgileriRepository.findAll();
    }

    public HastaBilgileri getHastaById(Long id) {
        Optional<HastaBilgileri> optionalHasta = hastaBilgileriRepository.findById(id);
        return optionalHasta.orElse(null);
    }

    public HastaBilgileri createHasta(HastaBilgileri hastaBilgileri) {
        return hastaBilgileriRepository.save(hastaBilgileri);
    }

    public HastaBilgileri updateHasta(HastaBilgileri hastaBilgileri) {
        return hastaBilgileriRepository.save(hastaBilgileri);
    }

    public void deleteHasta(Long id) {
        hastaBilgileriRepository.deleteById(id);
    }
}
