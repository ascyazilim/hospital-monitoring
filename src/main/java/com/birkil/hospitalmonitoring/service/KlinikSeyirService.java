package com.birkil.hospitalmonitoring.service;

import com.birkil.hospitalmonitoring.entity.KlinikSeyir;
import com.birkil.hospitalmonitoring.repository.KlinikSeyirRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KlinikSeyirService {

    private final KlinikSeyirRepository klinikSeyirRepository;

    public KlinikSeyirService(KlinikSeyirRepository klinikSeyirRepository) {
        this.klinikSeyirRepository = klinikSeyirRepository;
    }

    public List<KlinikSeyir> getAllKlinikSeyir() {
        return klinikSeyirRepository.findAll();
    }

    public KlinikSeyir getKlinikSeyirById(Long id) {
        return klinikSeyirRepository.findById(id).
                orElseThrow(() -> new RuntimeException("Klinik Seyir id bulunamadı id: " + id));
    }

    public KlinikSeyir createKlinikSeyir(KlinikSeyir klinikSeyir){
        return klinikSeyirRepository.save(klinikSeyir);
    }

    public KlinikSeyir updateKlinikSeyir(Long id, KlinikSeyir klinikSeyir) {
        if (!klinikSeyirRepository.existsById(id)){
            throw new RuntimeException("Klinik Seyir id bulunamadı id:" +id);
        }
        klinikSeyir.setId((id));
        return klinikSeyirRepository.save(klinikSeyir);
    }

    public void deleteKlinikSeyir(Long id){
        if (!klinikSeyirRepository.existsById(id)){
            throw new RuntimeException("Klinik Seyir id bulunamadı id: " +id);
        }
        klinikSeyirRepository.deleteById(id);
    }
}
