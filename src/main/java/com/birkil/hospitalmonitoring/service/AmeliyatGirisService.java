package com.birkil.hospitalmonitoring.service;


import com.birkil.hospitalmonitoring.entity.AmeliyatGiris;
import com.birkil.hospitalmonitoring.repository.AmeliyatGirisRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AmeliyatGirisService {

    private final AmeliyatGirisRepository ameliyatGirisRepository;


    public AmeliyatGirisService(AmeliyatGirisRepository ameliyatGirisRepository) {
        this.ameliyatGirisRepository = ameliyatGirisRepository;
    }

    public List<AmeliyatGiris> getAllAmeliyatGiris(){
        return  ameliyatGirisRepository.findAll();
    }

    public AmeliyatGiris getAmeliyatGirisById(Long id){
        return ameliyatGirisRepository.findById(id).
                orElseThrow(() -> new RuntimeException("Ameliyat Giriş not found with id: "+id));
    }

    public AmeliyatGiris createAmeliyatGiris(AmeliyatGiris ameliyatGiris){
        return ameliyatGirisRepository.save(ameliyatGiris);
    }

    public AmeliyatGiris updateAmeliyatGiris(Long id, AmeliyatGiris ameliyatGiris){
        if(!ameliyatGirisRepository.existsById(id)){
            throw new RuntimeException("Ameliyat Giris Bilgisi not found with id: " +id);
        }
        ameliyatGiris.setId((id));
        return ameliyatGirisRepository.save(ameliyatGiris);

    }

    public void deleteAmeliyatGiris(Long id) {
        if(!ameliyatGirisRepository.existsById(id)){
            throw new RuntimeException("Ameliyat Giris Bilgisi not found with id: " +id);
        }
        ameliyatGirisRepository.deleteById(id);
    }
}
