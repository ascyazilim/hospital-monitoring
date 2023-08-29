package com.birkil.hospitalmonitoring.service;

import com.birkil.hospitalmonitoring.entity.Takip;
import com.birkil.hospitalmonitoring.repository.TakipRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TakipService {
    private final TakipRepository takipRepository;

    public TakipService(TakipRepository takipRepository) {
        this.takipRepository = takipRepository;
    }

    //All
    public List<Takip> getAllTakip(){
        return takipRepository.findAll();
    }
    //Id
    public Takip getTakipById(Long id) {
        return takipRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("Takip not found with id: " +id));
    }
    //Create
    public Takip createTakip(Takip takip){
        return takipRepository.save(takip);
    }
    //Update
    public Takip updateTakip(Long id, Takip takip){
        if(!takipRepository.existsById(id)){
            throw new RuntimeException("Takip not found with id: " +id);
        }
        takip.setId((id));
        return takipRepository.save(takip);
    }
    //Delete
    public void deleteTakip(Long id){
        if(!takipRepository.existsById(id)){
            throw new RuntimeException("Takip not found with id: " +id);
        }
        takipRepository.deleteById(id);
    }

}
