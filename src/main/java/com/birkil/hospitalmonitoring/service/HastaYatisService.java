package com.birkil.hospitalmonitoring.service;

import com.birkil.hospitalmonitoring.entity.HastaYatis;
import com.birkil.hospitalmonitoring.repository.HastaYatisRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HastaYatisService {

    private final HastaYatisRepository hastaYatisRepository;

    public HastaYatisService(HastaYatisRepository hastaYatisRepository) {
        this.hastaYatisRepository = hastaYatisRepository;
    }

    public List<HastaYatis> getAllHastaYatis() {
        return hastaYatisRepository.findAll();
    }

    public HastaYatis getHastaYatisById(Long id) {
        return hastaYatisRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("Hasta Yatış id bulunamadı, id: "+id));
    }

    public HastaYatis createHastaYatis(HastaYatis hastaYatis) {
        return hastaYatisRepository.save(hastaYatis);
    }

    public HastaYatis updateHastaYatis(Long id, HastaYatis hastaYatis){
        if (!hastaYatisRepository.existsById(id)){
            throw new RuntimeException("Hasta Yatıs id bulunamadı, id: "+id);
        }
        hastaYatis.setId(id);
        return hastaYatisRepository.save(hastaYatis);
    }

    public void deleteHastaYatis(Long id) {
        if (!hastaYatisRepository.existsById(id)) {
            throw new RuntimeException("Hasta Yatış id bulunamadı, id:" + id);
        }
        hastaYatisRepository.deleteById(id);
    }
}
