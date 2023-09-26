package com.birkil.hospitalmonitoring.service;

import com.birkil.hospitalmonitoring.entity.TaniList;
import com.birkil.hospitalmonitoring.repository.TaniListRespository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaniListService {

    private final TaniListRespository taniListRespository;

    public TaniListService(TaniListRespository taniListRespository) {
        this.taniListRespository = taniListRespository;
    }

    //All
    public List<TaniList> getAllTaniList(){
        return taniListRespository.findAll();
    }

    //ID
    public TaniList getTaniListById(Long id){
        return taniListRespository.findById(id)
                .orElseThrow(() -> new RuntimeException("TaniList bulunamadı id: " +id));
    }

    //Create
    public TaniList createTaniList(TaniList taniList){
        return taniListRespository.save(taniList);
    }

    //Update
    public TaniList updateTaniList(Long id, TaniList taniList){
        if (!taniListRespository.existsById(id)){
            throw new RuntimeException("TaniList bulunamadı id: "+id);
        }
        taniList.setId((id));
        return taniListRespository.save(taniList);
    }

    //Delete
    public void deleteTaniList(Long id){
        if (taniListRespository.existsById(id)){
            throw new RuntimeException("TanıList bulunamadı id: " +id );
        }
        taniListRespository.deleteById(id);
    }
}
