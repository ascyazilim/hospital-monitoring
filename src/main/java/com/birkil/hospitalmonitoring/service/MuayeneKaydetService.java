package com.birkil.hospitalmonitoring.service;

import com.birkil.hospitalmonitoring.entity.MuayeneKaydet;
import com.birkil.hospitalmonitoring.repository.MuayeneKaydetRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MuayeneKaydetService {

    private final MuayeneKaydetRepository muayeneKaydetRepository;

    public MuayeneKaydetService(MuayeneKaydetRepository muayeneKaydetRepository) {
        this.muayeneKaydetRepository = muayeneKaydetRepository;
    }

    /*private final TaniListRespository taniListRespository;*/

    /*public MuayeneKaydetService(MuayeneKaydetRepository muayeneKaydetRepository, TaniListRespository taniListRespository) {
        this.muayeneKaydetRepository = muayeneKaydetRepository;
        this.taniListRespository = taniListRespository;
    }*/

    public List<MuayeneKaydet> getAllMuayeneKaydet(){
        return muayeneKaydetRepository.findAll();
    }

    public MuayeneKaydet getMuayeneKaydetById(Long id){
        return muayeneKaydetRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("MuayeneKaydet id bulunamadı: " +id));
    }

    public MuayeneKaydet createMuayeneKaydet(MuayeneKaydet muayeneKaydet){
        return muayeneKaydetRepository.save(muayeneKaydet);
    }

    /*public MuayeneKaydet createMuayeneKaydet(MuayeneKaydet muayeneKaydet){
        List<TaniList> existingTaniLists = new ArrayList<>();
        for (TaniList taniList : muayeneKaydet.getTaniList()){
            TaniList existingTaniList = taniListRespository.findByIcd10Kodu(taniList.getIcd10Kodu());
            if (existingTaniList != null){
                existingTaniLists.add(existingTaniList);
            }else {

            }
        }
        muayeneKaydet.setTaniList(existingTaniLists);
        return muayeneKaydetRepository.save(muayeneKaydet);
    }*/

    public MuayeneKaydet updateMuayeneKaydet(Long id, MuayeneKaydet muayeneKaydet){
        if (!muayeneKaydetRepository.existsById(id)) {
            throw new RuntimeException("MuayeneKaydet id bulunamadı: "+id);
        }
        muayeneKaydet.setId(id);
        return muayeneKaydetRepository.save(muayeneKaydet);
    }

    public void deleteMuayeneKaydet(Long id) {
        if (!muayeneKaydetRepository.existsById(id)){
            throw new RuntimeException("MuayeneKaydet id bulunamadı: "+id);
        }
        muayeneKaydetRepository.deleteById(id);
    }
}
