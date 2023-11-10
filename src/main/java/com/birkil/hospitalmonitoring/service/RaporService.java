package com.birkil.hospitalmonitoring.service;

import com.birkil.hospitalmonitoring.entity.Rapor;
import com.birkil.hospitalmonitoring.repository.RaporRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RaporService {

    private final RaporRepository raporRepository;

    public RaporService(RaporRepository raporRepository) {
        this.raporRepository = raporRepository;
    }

    public List<Rapor> getAllRapor() {
        return raporRepository.findAll();
    }

    public Rapor getRaporById(Long id) {
        return raporRepository.findById(id).
                orElseThrow(() -> new RuntimeException("Rapor id bulunamadı id: " +id));

    }
    public Rapor createRapor(Rapor rapor) {
        return raporRepository.save(rapor);
    }

    public Rapor updateRapor(Long id, Rapor rapor) {
        if (!raporRepository.existsById(id)) {
            throw new RuntimeException("Rapor id bulunamadı id: "+id);
        }
        rapor.setId(id);
        return raporRepository.save(rapor);
    }

    public void deleteRapor(Long id) {
        if(!raporRepository.existsById(id)) {
            throw new RuntimeException("Rapor id bulunamadı id: " +id);
        }
        raporRepository.deleteById(id);
    }
}
