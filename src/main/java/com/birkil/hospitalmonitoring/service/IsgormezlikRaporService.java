package com.birkil.hospitalmonitoring.service;

import com.birkil.hospitalmonitoring.entity.IsgoremezlikRapor;
import com.birkil.hospitalmonitoring.repository.IsgormezlikRaporRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IsgormezlikRaporService {

    private final IsgormezlikRaporRepository isgormezlikRaporRepository;

    public IsgormezlikRaporService(IsgormezlikRaporRepository isgormezlikRaporRepository) {
        this.isgormezlikRaporRepository = isgormezlikRaporRepository;
    }

    public List<IsgoremezlikRapor> getAllIsgormezlikRapor() {
        return isgormezlikRaporRepository.findAll();
    }

    public IsgoremezlikRapor getIsgormezlikRaporById(Long id){
        return isgormezlikRaporRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("İşgörmezlik Rapor id bulunamadı, id: "+id));
    }

    public IsgoremezlikRapor createIsgormezlikRapor(IsgoremezlikRapor isgoremezlikRapor){
        return isgormezlikRaporRepository.save(isgoremezlikRapor);
    }

    public IsgoremezlikRapor updateIsgormezlikRapor(Long id, IsgoremezlikRapor isgoremezlikRapor){
        if(!isgormezlikRaporRepository.existsById(id)){
            throw new RuntimeException("İşgörmezlik Rapor id bulunamadı, id: "+id);
        }
        isgoremezlikRapor.setId(id);
        return isgormezlikRaporRepository.save(isgoremezlikRapor);
    }

    public void deleteIsgormezlikRapor(Long id){
        if (!isgormezlikRaporRepository.existsById(id)){
            throw new RuntimeException("İşgörmezlik Rapor id bulunamadı, id: "+id);
        }
        isgormezlikRaporRepository.deleteById(id);
    }
}
