package com.birkil.hospitalmonitoring.service;

import com.birkil.hospitalmonitoring.entity.AmeliyatGirisimBilgisi;
import com.birkil.hospitalmonitoring.repository.AmeliyatGirisimBilgisiRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AmeliyatGirisimBilgisiService {
    private final AmeliyatGirisimBilgisiRepository ameliyatGirisimBilgisiRepository;

    public AmeliyatGirisimBilgisiService(AmeliyatGirisimBilgisiRepository ameliyatGirisimBilgisiRepository) {
        this.ameliyatGirisimBilgisiRepository = ameliyatGirisimBilgisiRepository;
    }

    //All
    public List<AmeliyatGirisimBilgisi> getAllAmeliyatGirisimBilgisi(){
        return ameliyatGirisimBilgisiRepository.findAll();
    }

    //Id
    public AmeliyatGirisimBilgisi getAmeliyatGirisimBilgisiById(Long id){
        return ameliyatGirisimBilgisiRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Ameliyat Girisim Bilgisi not found with id: " +id));
    }

    //Create
    public AmeliyatGirisimBilgisi createAmeliyatGirisimBilgisi(AmeliyatGirisimBilgisi ameliyatGirisimBilgisi){
        return ameliyatGirisimBilgisiRepository.save(ameliyatGirisimBilgisi);
    }

    //Update
    public AmeliyatGirisimBilgisi updateAmeliyatGirisimBilgisi(Long id, AmeliyatGirisimBilgisi ameliyatGirisimBilgisi){
        if(!ameliyatGirisimBilgisiRepository.existsById(id)){
            throw new RuntimeException("Ameliyat Girisim Bilgisi not found with id: " +id);
        }
        ameliyatGirisimBilgisi.setId((id));
        return ameliyatGirisimBilgisiRepository.save(ameliyatGirisimBilgisi);
    }

    public void deleteAmeliyatGirisimBilgisi(Long id) {
        if(!ameliyatGirisimBilgisiRepository.existsById(id)){
            throw new RuntimeException("Ameliyat Girisim Bilgisi not found with id: " +id);
        }
        ameliyatGirisimBilgisiRepository.deleteById(id);
    }

}
