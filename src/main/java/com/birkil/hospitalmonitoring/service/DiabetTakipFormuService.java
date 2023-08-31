package com.birkil.hospitalmonitoring.service;

import com.birkil.hospitalmonitoring.entity.DiabetTakipFormu;
import com.birkil.hospitalmonitoring.repository.DiabetTakipFormuRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiabetTakipFormuService {

    private final DiabetTakipFormuRepository diabetTakipFormuRepository;

    public DiabetTakipFormuService(DiabetTakipFormuRepository diabetTakipFormuRepository) {
        this.diabetTakipFormuRepository = diabetTakipFormuRepository;
    }
    //All
    public List<DiabetTakipFormu> getAllDiabetTakip(){
        return diabetTakipFormuRepository.findAll();
    }
    //ID
    public DiabetTakipFormu getDiabetTakipById(Long id){
        return diabetTakipFormuRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Diabet Takip Formu not found with id: " +id));
    }
    //Create
    public DiabetTakipFormu createDiabetTakip(DiabetTakipFormu diabetTakipFormu){
        return diabetTakipFormuRepository.save(diabetTakipFormu);
    }

    //update
    public DiabetTakipFormu updateDiabetKayit(Long id, DiabetTakipFormu diabetTakipFormu){
        if (!diabetTakipFormuRepository.existsById(id)){
            throw new RuntimeException("Diabet Takip Formu not found with id: " +id);
        }
        diabetTakipFormu.setId((id));
        return diabetTakipFormuRepository.save(diabetTakipFormu);
    }
    //Delete
    public void deleteDiabetKayit(Long id){
        if (!diabetTakipFormuRepository.existsById(id)){
            throw new RuntimeException("Diabet Takip Formu not found with id: " +id);
        }
        diabetTakipFormuRepository.deleteById(id);
    }
}
