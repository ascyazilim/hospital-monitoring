package com.birkil.hospitalmonitoring.service;

import com.birkil.hospitalmonitoring.entity.DoktorList;
import com.birkil.hospitalmonitoring.repository.DoktorListRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoktorListService {

    private final DoktorListRepository doktorListRepository;

    public DoktorListService(DoktorListRepository doktorListRepository) {
        this.doktorListRepository = doktorListRepository;
    }


    public List<DoktorList> getAllDoktorList(){
        return doktorListRepository.findAll();
    }

    public DoktorList getDoktorListById(Long id){
        return doktorListRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("DoktorList not found with id: " +id));
    }

    public DoktorList createDoktorList(DoktorList doktorList){
        return doktorListRepository.save(doktorList);
    }

    public DoktorList updateDoktorList(Long id, DoktorList doktorList){
        if (!doktorListRepository.existsById(id)){
            throw new RuntimeException("DoktorList not found with id: " +id);
        }
        doktorList.setId((id));
        return doktorListRepository.save(doktorList);
    }

    public void deleteDoktorList(Long id){
        if(!doktorListRepository.existsById(id)){
            throw new RuntimeException("DoktorList not found with id: " +id);
        }
        doktorListRepository.deleteById(id);
    }
}
