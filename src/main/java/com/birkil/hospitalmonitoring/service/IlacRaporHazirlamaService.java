package com.birkil.hospitalmonitoring.service;

import com.birkil.hospitalmonitoring.entity.IlacRaporHazirlama;
import com.birkil.hospitalmonitoring.repository.IlacRaporHazirlamaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IlacRaporHazirlamaService {

    private final IlacRaporHazirlamaRepository ilacRaporHazirlamaRepository;

    public IlacRaporHazirlamaService(IlacRaporHazirlamaRepository ilacRaporHazirlamaRepository) {
        this.ilacRaporHazirlamaRepository = ilacRaporHazirlamaRepository;
    }

    public List<IlacRaporHazirlama> getAllIlacRaporHazirlama() {
        List<IlacRaporHazirlama> ilacRaporHazirlamaList = ilacRaporHazirlamaRepository.findAll();
        return ilacRaporHazirlamaList;
    }

    public IlacRaporHazirlama getIlacRaporHazirlamaById(Long id) {
        return ilacRaporHazirlamaRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("İlaç Rapor Hazırlama ID bulunamadı, id: "+id));
    }

    public IlacRaporHazirlama createIlacRaporHazirlama(IlacRaporHazirlama ilacRaporHazirlama){
        return ilacRaporHazirlamaRepository.save(ilacRaporHazirlama);
    }

    public IlacRaporHazirlama updateIlacRaporHazirlama(Long id, IlacRaporHazirlama ilacRaporHazirlama){
        if(!ilacRaporHazirlamaRepository.existsById(id)){
            throw new RuntimeException("İlaç Rapor Hazırlama ID bulunamadı, id: "+id);
        }
        ilacRaporHazirlama.setId(id);
        return ilacRaporHazirlamaRepository.save(ilacRaporHazirlama);
    }

    public void deleteIlacRaporHazirlama(Long id){
        if (!ilacRaporHazirlamaRepository.existsById(id)){
            throw new RuntimeException("İlaç Rapor Hazırlama ID bulunamadı, id: "+id);
        }
        ilacRaporHazirlamaRepository.deleteById(id);
    }
}
