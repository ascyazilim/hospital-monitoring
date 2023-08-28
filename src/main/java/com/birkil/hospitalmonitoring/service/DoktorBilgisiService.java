package com.birkil.hospitalmonitoring.service;

import com.birkil.hospitalmonitoring.entity.DoktorBilgisi;

import com.birkil.hospitalmonitoring.repository.DoktorBilgisiRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoktorBilgisiService {

    private final DoktorBilgisiRepository doktorBilgisiRepository;

    public DoktorBilgisiService(DoktorBilgisiRepository doktorBilgisiRepository) {
        this.doktorBilgisiRepository = doktorBilgisiRepository;
    }

    public List<DoktorBilgisi> getAllDoktorList(){
        return doktorBilgisiRepository.findAll();
    }

    public DoktorBilgisi getDoktorBilgisiById(Long id){
        return doktorBilgisiRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("DoktorBilgisi not found with id: " +id));
    }

    public DoktorBilgisi createDoktorBilgisi(DoktorBilgisi doktorBilgisi){
        return doktorBilgisiRepository.save(doktorBilgisi);
    }

    public DoktorBilgisi updateDoktorBilgisi(Long id, DoktorBilgisi doktorBilgisi){
        if(!doktorBilgisiRepository.existsById(id)){
            throw new RuntimeException("DoktorBilgisi not found with id: "+id);
        }
        doktorBilgisi.setId((id));
        return doktorBilgisiRepository.save(doktorBilgisi);
    }

    public void deleteDoktorBilgisi(Long id){
        if(!doktorBilgisiRepository.existsById(id)){
            throw new RuntimeException("DoktorBilgisi not found with id: "+id);
        }
        doktorBilgisiRepository.deleteById(id);
    }


}
