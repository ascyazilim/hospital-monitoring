package com.birkil.hospitalmonitoring.service;

import com.birkil.hospitalmonitoring.entity.TedaviPlanlama;
import com.birkil.hospitalmonitoring.repository.TedaviPlanlamaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TedaviPlanlamaService {

    private final TedaviPlanlamaRepository tedaviPlanlamaRepository;

    public TedaviPlanlamaService(TedaviPlanlamaRepository tedaviPlanlamaRepository) {
        this.tedaviPlanlamaRepository = tedaviPlanlamaRepository;
    }

    public List<TedaviPlanlama> getAllTedaviPlanlama() {
        return tedaviPlanlamaRepository.findAll();
    }

    public TedaviPlanlama getTedaviPlanlamaById(Long id){
        return tedaviPlanlamaRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Tedavi Planlama bulunamadı id: " +id));
    }

    public TedaviPlanlama createTedaviPlanlama(TedaviPlanlama tedaviPlanlama){
        return tedaviPlanlamaRepository.save(tedaviPlanlama);
    }

    public TedaviPlanlama updateTedaviPlanlama(Long id, TedaviPlanlama tedaviPlanlama){
        if (!tedaviPlanlamaRepository.existsById(id)){
            throw new RuntimeException("Tedavi Planlama bulunamadı id: " +id);
        }
        tedaviPlanlama.setId((id));
        return tedaviPlanlamaRepository.save(tedaviPlanlama);
    }

    public void deleteTedaviPlanlama(Long id){
        if (tedaviPlanlamaRepository.existsById(id)){
            throw new RuntimeException("Tedavi Planlama bulunamadı id: "+id);
        }
        tedaviPlanlamaRepository.deleteById(id);
    }
}
