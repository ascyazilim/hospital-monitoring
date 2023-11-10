package com.birkil.hospitalmonitoring.service;

import com.birkil.hospitalmonitoring.entity.IlacRapor;
import com.birkil.hospitalmonitoring.repository.IlacRaporRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IlacRaporService {

    private final IlacRaporRepository ilacRaporRepository;

    public IlacRaporService(IlacRaporRepository ilacRaporRepository) {
        this.ilacRaporRepository = ilacRaporRepository;
    }

    public List<IlacRapor> getIlacRaporAll() {
        return ilacRaporRepository.findAll();
    }

    public IlacRapor getIlacRaporById(Long id) {
        return ilacRaporRepository.findById(id).
                orElseThrow(() -> new RuntimeException("İlaç Rapor id bulunamadı id: " +id));
    }

    public IlacRapor createIlacRapor(IlacRapor ilacRapor) {
        return ilacRaporRepository.save(ilacRapor);
    }

    public IlacRapor updateIlacRapor(Long id, IlacRapor ilacRapor) {
        if (!ilacRaporRepository.existsById(id)){
            throw new RuntimeException("İlaç Rapor id bulunamadı id: " +id);
        }
        ilacRapor.setId(id);
        return ilacRaporRepository.save(ilacRapor);
    }

    public void deleteIlacRapor(Long id) {
        if(!ilacRaporRepository.existsById(id)){
            throw new RuntimeException("İlaç Rapor id bulunamadı id: " +id);
        }
        ilacRaporRepository.deleteById(id);
    }
}
