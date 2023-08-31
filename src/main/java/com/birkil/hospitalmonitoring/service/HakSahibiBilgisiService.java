package com.birkil.hospitalmonitoring.service;

import com.birkil.hospitalmonitoring.entity.HakSahibiBilgisi;
import com.birkil.hospitalmonitoring.repository.HakSahibiBilgisiRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HakSahibiBilgisiService {

    private final HakSahibiBilgisiRepository hakSahibiBilgisiRepository;

    public HakSahibiBilgisiService(HakSahibiBilgisiRepository hakSahibiBilgisiRepository) {
        this.hakSahibiBilgisiRepository = hakSahibiBilgisiRepository;
    }

    //All
    public List<HakSahibiBilgisi> getAllHakSahibiBilgisi(){
        return hakSahibiBilgisiRepository.findAll();
    }
    //ID
    public HakSahibiBilgisi getHakSahibiBilgisiById(Long id){
        return hakSahibiBilgisiRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Hak Sahibi Bilgisi not found with id: " +id));
    }
    //Create
    public HakSahibiBilgisi createHakSahibiBilgisi(HakSahibiBilgisi hakSahibiBilgisi){
        return hakSahibiBilgisiRepository.save(hakSahibiBilgisi);
    }
    //Update
    public HakSahibiBilgisi updateHakSahibiBilgisi(Long id, HakSahibiBilgisi hakSahibiBilgisi){
        if (!hakSahibiBilgisiRepository.existsById(id)){
            throw new RuntimeException("Hak Sahibi Bilgisi not found with id: " +id);
        }
        hakSahibiBilgisi.setId((id));
        return hakSahibiBilgisiRepository.save(hakSahibiBilgisi);
    }
    //Delete
    public void deleteHakSahibibilgisi(Long id){
        if (!hakSahibiBilgisiRepository.existsById(id)){
            throw new RuntimeException("Hak Sahibi Bilgisi not found with id: " +id);
        }
        hakSahibiBilgisiRepository.deleteById(id);
    }
}
