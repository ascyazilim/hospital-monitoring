package com.birkil.hospitalmonitoring.service;

import com.birkil.hospitalmonitoring.entity.TaniBilgisi;
import com.birkil.hospitalmonitoring.repository.TaniBilgisiRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaniBilgisiService {

    private final TaniBilgisiRepository taniBilgisiRepository;

    public TaniBilgisiService(TaniBilgisiRepository taniBilgisiRepository) {
        this.taniBilgisiRepository = taniBilgisiRepository;
    }

    public List<TaniBilgisi> getAllTaniBilgisi(){
        return taniBilgisiRepository.findAll();
    }

    public TaniBilgisi getTaniBilgisiById(Long id){
        return taniBilgisiRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("TanıBilgisi not found with id: " +id ));

    }

    public TaniBilgisi createTaniBilgisi(TaniBilgisi taniBilgisi){
        return taniBilgisiRepository.save(taniBilgisi);
    }

    public TaniBilgisi updateTaniBilgisi(Long id, TaniBilgisi taniBilgisi){
        if (!taniBilgisiRepository.existsById(id)){
            throw new RuntimeException("TaniBilgisi not found with id: " +id);
        }
        taniBilgisi.setId((id));
        return taniBilgisiRepository.save(taniBilgisi);
    }

    public void deleteTaniBilgisi(Long id){
        if (!taniBilgisiRepository.existsById(id)){
            throw new RuntimeException("TaniBilgisi not found with id: " +id);
        }
        taniBilgisiRepository.deleteById(id);
    }
}
