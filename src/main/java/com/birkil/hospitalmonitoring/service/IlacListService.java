package com.birkil.hospitalmonitoring.service;

import com.birkil.hospitalmonitoring.entity.IlacList;
import com.birkil.hospitalmonitoring.repository.IlacListRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IlacListService {

    private final IlacListRepository ilacListRepository;

    public IlacListService(IlacListRepository ilacListRepository) {
        this.ilacListRepository = ilacListRepository;
    }

    public List<IlacList> getAllIlacList(){
        return ilacListRepository.findAll();
    }

    public IlacList getIlacListById(Long id){
        return ilacListRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("İlaç Listesi bulunamadı id: " +id));
    }

    public IlacList createIlacList(IlacList ilacList){
        return ilacListRepository.save(ilacList);
    }

    public IlacList updateIlacList(Long id, IlacList ilacList){
        if (!ilacListRepository.existsById(id)){
            throw new RuntimeException("İlaç Listesi bulunamadı id: " +id);
        }
        ilacList.setId((id));
        return ilacListRepository.save(ilacList);
    }

    public void deleteIlacList(Long id){
        if(!ilacListRepository.existsById(id)){
            throw new RuntimeException("İlaç Listesi bulunamadı id: "+id);
        }
        ilacListRepository.deleteById(id);
    }
}
