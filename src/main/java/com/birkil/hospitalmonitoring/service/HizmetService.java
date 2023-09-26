package com.birkil.hospitalmonitoring.service;

import com.birkil.hospitalmonitoring.entity.Hizmet;
import com.birkil.hospitalmonitoring.repository.HizmetRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HizmetService {

    private final HizmetRepository hizmetRepository;

    public HizmetService(HizmetRepository hizmetRepository) {
        this.hizmetRepository = hizmetRepository;
    }

    //All
    public List<Hizmet> getAllHizmet(){
        return hizmetRepository.findAll();
    }

    //ID
    public Hizmet getHizmetById(Long id){
        return hizmetRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Hizmet not found with id: " +id));
    }
    //Create
    public Hizmet createHizmet(Hizmet hizmet){
        return hizmetRepository.save(hizmet);
    }
    //Update
    public Hizmet updateHizmet(Long id, Hizmet hizmet){
        if (!hizmetRepository.existsById(id)){
            throw new RuntimeException("Hizmet not found with id: " +id);
        }
        hizmet.setId((id));
        return hizmetRepository.save(hizmet);
    }
    //Delete
    public void deleteHizmet(Long id){
        if (!hizmetRepository.existsById(id)){
            throw new RuntimeException("Hizmet not found with id: " +id);
        }
        hizmetRepository.deleteById(id);
    }

}
