package com.birkil.hospitalmonitoring.service;

import com.birkil.hospitalmonitoring.entity.TedaviListesi;
import com.birkil.hospitalmonitoring.repository.TedaviListesiRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TedaviListesiService {

    private final TedaviListesiRepository tedaviListesiRepository;

    public TedaviListesiService(TedaviListesiRepository tedaviListesiRepository) {
        this.tedaviListesiRepository = tedaviListesiRepository;
    }

    public List<TedaviListesi> getAllTedaviListesi () {
        return tedaviListesiRepository.findAll();
    }

    public TedaviListesi getTedaviListesiById (Long id) {
        return tedaviListesiRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Tedavi bulunamadı id: " +id));
    }

    public TedaviListesi createTedaviListesi(TedaviListesi tedaviListesi){
        return tedaviListesiRepository.save(tedaviListesi);
    }

    public TedaviListesi updateTedaviListesi(Long id, TedaviListesi tedaviListesi){
        if (!tedaviListesiRepository.existsById(id)){
            throw new RuntimeException("Tedavi bulunamadı id: " +id);
        }
        tedaviListesi.setId((id));
        return tedaviListesiRepository.save(tedaviListesi);
    }

    public void deleteTedaviListesi(Long id){
        if (tedaviListesiRepository.existsById(id)){
            throw new RuntimeException("Tedavi bulunamadı id: "+id);
        }
        tedaviListesiRepository.deleteById(id);
    }
}
