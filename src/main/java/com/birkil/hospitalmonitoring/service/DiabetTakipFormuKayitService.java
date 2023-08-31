package com.birkil.hospitalmonitoring.service;

import com.birkil.hospitalmonitoring.entity.DiabetTakipFormuKayit;
import com.birkil.hospitalmonitoring.repository.DiabetTakipFormuKayitRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiabetTakipFormuKayitService {

    private final DiabetTakipFormuKayitRepository diabetTakipFormuKayitRepository;

    public DiabetTakipFormuKayitService(DiabetTakipFormuKayitRepository diabetTakipFormuKayitRepository) {
        this.diabetTakipFormuKayitRepository = diabetTakipFormuKayitRepository;
    }

    //All
    public List<DiabetTakipFormuKayit> getAllDiabetKayit(){
        return diabetTakipFormuKayitRepository.findAll();
    }

    //Id
    public DiabetTakipFormuKayit getDiabetKayitById(Long id){
        return diabetTakipFormuKayitRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Diabet Takip Formu not found with id" +id));
    }

    //create
    public DiabetTakipFormuKayit createDiabetKayit(DiabetTakipFormuKayit diabetTakipFormuKayit){
        return diabetTakipFormuKayitRepository.save(diabetTakipFormuKayit);
    }

    //update
    public DiabetTakipFormuKayit updateDiabetKayit(Long id, DiabetTakipFormuKayit diabetTakipFormuKayit){
        if (!diabetTakipFormuKayitRepository.existsById(id)){
            throw new RuntimeException("Diabet Takip Formu not found with id" +id);
        }
        diabetTakipFormuKayit.setId((id));
        return diabetTakipFormuKayitRepository.save(diabetTakipFormuKayit);
    }

    //Delete
    public void deleteDiabetTakip(Long id){
        if (!diabetTakipFormuKayitRepository.existsById(id)){
            throw new RuntimeException("Diabet Takip Formu not found with id" +id);
        }
        diabetTakipFormuKayitRepository.deleteById(id);
    }
}
