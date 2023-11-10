package com.birkil.hospitalmonitoring.service;

import com.birkil.hospitalmonitoring.entity.TahlilSonuc;
import com.birkil.hospitalmonitoring.repository.TahlilSonucRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TahlilSonucService {

    private final TahlilSonucRepository tahlilSonucRepository;

    public TahlilSonucService(TahlilSonucRepository tahlilSonucRepository) {
        this.tahlilSonucRepository = tahlilSonucRepository;
    }

    public List<TahlilSonuc> getAllTahlilSonuc() {
        return tahlilSonucRepository.findAll();
    }

    public TahlilSonuc getTahlilSonucById(Long id) {
        return tahlilSonucRepository.findById(id).
                orElseThrow(() -> new RuntimeException("Tahlil Sonuç id bulunamadı id: " +id));

    }
    public TahlilSonuc createTahlilSonuc(TahlilSonuc tahlilSonuc) {
        return tahlilSonucRepository.save(tahlilSonuc);
    }

    public TahlilSonuc updateTahlilSonuc(Long id, TahlilSonuc tahlilSonuc) {
        if (!tahlilSonucRepository.existsById(id)){
            throw new RuntimeException("Tahlil Sonuç id bulunamadı id: " +id);
        }
        tahlilSonuc.setId(id);
        return tahlilSonucRepository.save(tahlilSonuc);
    }

    public void deleteTahlilSonuc(Long id) {
        if (!tahlilSonucRepository.existsById(id)) {
            throw new RuntimeException("Tahlil Sonuç id bulunamadı id: " +id);
        }
        tahlilSonucRepository.deleteById(id);
    }

}
