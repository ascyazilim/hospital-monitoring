package com.birkil.hospitalmonitoring.service;

import com.birkil.hospitalmonitoring.entity.HastalikRapor;
import com.birkil.hospitalmonitoring.repository.HastalikRaporRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HastalikRaporService {

    private final HastalikRaporRepository hastalikRaporRepository;

    public HastalikRaporService(HastalikRaporRepository hastalikRaporRepository) {
        this.hastalikRaporRepository = hastalikRaporRepository;
    }

    //All
    public List<HastalikRapor> getAllHastalikRapor(){
        return hastalikRaporRepository.findAll();
    }

    //ID
    public HastalikRapor getHastalikRaporById(Long id){
        return hastalikRaporRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Hastalık Rapor Bilgisi Bulunamadı: "+id));
    }

    //Create
    public HastalikRapor createHastalikRapor(HastalikRapor hastalikRapor){
        return hastalikRaporRepository.save(hastalikRapor);
    }

    //Update
    public HastalikRapor updateHastalikRapor(Long id, HastalikRapor hastalikRapor){
        if (!hastalikRaporRepository.existsById(id)){
            throw new RuntimeException("Hastalık Rapor Bilgisi Bulunamadı: "+id);
        }
        hastalikRapor.setId(id);
        return hastalikRaporRepository.save(hastalikRapor);
    }

    //Delete
    public void deleteHastalikRapor(Long id){
        if (!hastalikRaporRepository.existsById(id)){
            throw new RuntimeException("Hastalık Rapor Bilgisi Bulunamadı: "+id);
        }
        hastalikRaporRepository.deleteById(id);
    }
}
