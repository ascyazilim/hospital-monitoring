package com.birkil.hospitalmonitoring.service;

import com.birkil.hospitalmonitoring.entity.BransGorusBilgisi;
import com.birkil.hospitalmonitoring.repository.BransGorusBilgisiRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BransGorusBilgisiService {

    private final BransGorusBilgisiRepository bransGorusBilgisiRepository;

    public BransGorusBilgisiService(BransGorusBilgisiRepository bransGorusBilgisiRepository) {
        this.bransGorusBilgisiRepository = bransGorusBilgisiRepository;
    }

    //All
    public List<BransGorusBilgisi> getAllBransGorusBilgisi(){
        return bransGorusBilgisiRepository.findAll();
    }
    //Id
    public BransGorusBilgisi getBransGorusBilgisiById(Long id){
        return bransGorusBilgisiRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Brans Gorus Bilgisi not found with id: "+id));
    }
    //Create
    public BransGorusBilgisi createBransGorusBilgisi(BransGorusBilgisi bransGorusBilgisi){
        return bransGorusBilgisiRepository.save(bransGorusBilgisi);
    }
    //Update
    public BransGorusBilgisi updateBransGorusBilgisi(Long id, BransGorusBilgisi bransGorusBilgisi){
        if (!bransGorusBilgisiRepository.existsById(id)){
            throw new RuntimeException("Brans Gorus Bilgisi not found with id: "+id);
        }
        bransGorusBilgisi.setId((id));
        return bransGorusBilgisiRepository.save(bransGorusBilgisi);
    }
    //Delete
    public void deleteBransGorusBilgisi(Long id){
        if (!bransGorusBilgisiRepository.existsById(id)){
            throw new RuntimeException("Brans Gorus Bilgisi not found with id: "+id);
        }
        bransGorusBilgisiRepository.deleteById(id);
    }

}
