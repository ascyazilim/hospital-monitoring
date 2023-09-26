package com.birkil.hospitalmonitoring.service;

import com.birkil.hospitalmonitoring.entity.HizmetIstemBilgisi;
import com.birkil.hospitalmonitoring.repository.HizmetIstemBilgisiRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HizmetIstemBilgisiService {

    private final HizmetIstemBilgisiRepository hizmetIstemBilgisiRepository;

    public HizmetIstemBilgisiService(HizmetIstemBilgisiRepository hizmetIstemBilgisiRepository) {
        this.hizmetIstemBilgisiRepository = hizmetIstemBilgisiRepository;
    }

    public List<HizmetIstemBilgisi> getAllHizmetIstemBilgisi() {
        return hizmetIstemBilgisiRepository.findAll();
    }

    public HizmetIstemBilgisi getHizmetIstemBilgisiById(Long id){
        return hizmetIstemBilgisiRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Hizmet-İstem bilgisi bulunamadı id: " +id));
    }

    public HizmetIstemBilgisi createHizmetIstemBilgisi(HizmetIstemBilgisi hizmetIstemBilgisi){
        return hizmetIstemBilgisiRepository.save(hizmetIstemBilgisi);
    }

    public HizmetIstemBilgisi updateHizmetIstemBilgisi(Long id, HizmetIstemBilgisi hizmetIstemBilgisi){
        if (!hizmetIstemBilgisiRepository.existsById(id)){
            throw new RuntimeException("Hizmet-İstem Bilgisi bulunamadı id: "+id);
        }
        hizmetIstemBilgisi.setId((id));
        return hizmetIstemBilgisiRepository.save(hizmetIstemBilgisi);
    }

    public void deleteHizmetIstemBilgisi(Long id){
        if (!hizmetIstemBilgisiRepository.existsById(id)){
            throw new RuntimeException("Hizmet-İstem Bilgisi bulunamadı id: "+id);
        }
        hizmetIstemBilgisiRepository.deleteById(id);
    }
}
