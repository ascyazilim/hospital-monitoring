package com.birkil.hospitalmonitoring.service;

import com.birkil.hospitalmonitoring.entity.TaburcuIstek;
import com.birkil.hospitalmonitoring.repository.TaburcuIstekRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaburcuIstekService {

    private final TaburcuIstekRepository taburcuIstekRepository;

    public TaburcuIstekService(TaburcuIstekRepository taburcuIstekRepository) {
        this.taburcuIstekRepository = taburcuIstekRepository;
    }

    public List<TaburcuIstek> getAllTaburcuIstek (){
        return taburcuIstekRepository.findAll();
    }

    public TaburcuIstek getTaburcuIstekById(Long id) {
        return taburcuIstekRepository.findById(id).
                orElseThrow(() -> new RuntimeException("Taburcu İstek id bulunamadı id: " +id));
    }

    public TaburcuIstek createTaburcuIstek(TaburcuIstek taburcuIstek) {
        return taburcuIstekRepository.save(taburcuIstek);
    }

    public TaburcuIstek updateTaburcuIstek(Long id, TaburcuIstek taburcuIstek){
        if (!taburcuIstekRepository.existsById(id)){
            throw new RuntimeException("Taburcu İstek id bulunamadı id: " +id);
        }
        taburcuIstek.setId((id));
        return taburcuIstekRepository.save(taburcuIstek);
    }

    public void deleteTaburcuIstek(Long id) {
        if (!taburcuIstekRepository.existsById(id)){
            throw new RuntimeException("Taburcu istek id bulunamadı id: " +id);
        }
        taburcuIstekRepository.deleteById(id);
    }
}
