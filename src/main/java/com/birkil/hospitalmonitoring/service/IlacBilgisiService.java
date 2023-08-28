package com.birkil.hospitalmonitoring.service;

import com.birkil.hospitalmonitoring.entity.IlacBilgisi;
import com.birkil.hospitalmonitoring.repository.IlacBilgisiRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IlacBilgisiService {

    private final IlacBilgisiRepository ilacBilgisiRepository;

    public IlacBilgisiService(IlacBilgisiRepository ilacBilgisiRepository) {
        this.ilacBilgisiRepository = ilacBilgisiRepository;
    }

    public List<IlacBilgisi> getAllIlacBilgisi(){
        return ilacBilgisiRepository.findAll();
    }

    public IlacBilgisi getIlacBilgisiById(Long id){
        return ilacBilgisiRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("İlaç Bilgisi bulunamadı id: "+id));
    }

    public IlacBilgisi createIlacBilgisi(IlacBilgisi ilacBilgisi){
        return ilacBilgisiRepository.save(ilacBilgisi);
    }

    public IlacBilgisi updateIlacBilgisi(Long id, IlacBilgisi ilacBilgisi){
        if(!ilacBilgisiRepository.existsById(id)){
            throw new RuntimeException("İlaç Bilgisi bulunamadı id: " +id);
        }
        ilacBilgisi.setId((id));
        return ilacBilgisiRepository.save(ilacBilgisi);
    }

    public void deleteIlacBilgisi(Long id){
        if(!ilacBilgisiRepository.existsById(id)){
            throw new RuntimeException("İlaç Bilgisi bulunamadı id: " +id);
        }
        ilacBilgisiRepository.deleteById(id);
    }
}
