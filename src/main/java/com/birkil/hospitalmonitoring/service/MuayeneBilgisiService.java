package com.birkil.hospitalmonitoring.service;

import com.birkil.hospitalmonitoring.entity.MuayeneBilgisi;
import com.birkil.hospitalmonitoring.repository.MuayeneBilgisiRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MuayeneBilgisiService {

    private final MuayeneBilgisiRepository muayeneBilgisiRepository;

    public MuayeneBilgisiService(MuayeneBilgisiRepository muayeneBilgisiRepository) {
        this.muayeneBilgisiRepository = muayeneBilgisiRepository;
    }

    public List<MuayeneBilgisi> getAllMuayeneBilgisi(){
        return muayeneBilgisiRepository.findAll();
    }

    public MuayeneBilgisi getMuayeneBilgisiById(Long id){
        return muayeneBilgisiRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("MuayeneBilgisi not found with id: " +id));
    }

    public MuayeneBilgisi createMuayeneBilgisi(MuayeneBilgisi muayeneBilgisi){
        return muayeneBilgisiRepository.save(muayeneBilgisi);
    }

    public MuayeneBilgisi updateMuayeneBilgisi(Long id, MuayeneBilgisi muayeneBilgisi){
        if(!muayeneBilgisiRepository.existsById(id)){
            throw new RuntimeException("MuayeneBilgisi not found with id: "+id);
        }
        muayeneBilgisi.setId((id));
        return muayeneBilgisiRepository.save(muayeneBilgisi);
    }

    public void deleteMuayeneBilgisi(Long id){
        if(!muayeneBilgisiRepository.existsById(id)){
            throw new RuntimeException("MuayeneBilgisi not found with id: "+id);
        }
        muayeneBilgisiRepository.deleteById(id);
    }
}
