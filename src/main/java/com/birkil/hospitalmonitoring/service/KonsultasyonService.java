package com.birkil.hospitalmonitoring.service;

import com.birkil.hospitalmonitoring.entity.Konsultasyon;
import com.birkil.hospitalmonitoring.repository.KonsultasyonRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KonsultasyonService {

    private final KonsultasyonRepository konsultasyonRepository;

    public KonsultasyonService(KonsultasyonRepository konsultasyonRepository) {
        this.konsultasyonRepository = konsultasyonRepository;
    }

    public List<Konsultasyon> getAllKonsultasyon(){
        return konsultasyonRepository.findAll();
    }

    public Konsultasyon getKonsultasyonById(Long id) {
        return konsultasyonRepository.findById(id).
                orElseThrow(()-> new RuntimeException("Konsultasyon id bulunamadı id: "+ id));
    }

    public Konsultasyon createKonsultasyon(Konsultasyon konsultasyon){
        return konsultasyonRepository.save(konsultasyon);
    }

    public Konsultasyon updateKonsultasyon(Long id, Konsultasyon konsultasyon){
        if (!konsultasyonRepository.existsById(id)){
            throw new RuntimeException("Konsültasyon id bulunamadı id: "+id);
        }
        konsultasyon.setId((id));
        return konsultasyonRepository.save(konsultasyon);
    }

    public void deleteKonsultasyon(Long id){
        if(!konsultasyonRepository.existsById(id)){
            throw new RuntimeException("Konsültasyon id bulunamadı id: " +id);
        }
        konsultasyonRepository.deleteById(id);
    }
}
