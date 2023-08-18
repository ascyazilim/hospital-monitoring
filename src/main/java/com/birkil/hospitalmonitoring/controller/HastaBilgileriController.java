package com.birkil.hospitalmonitoring.controller;

import com.birkil.hospitalmonitoring.entity.HastaBilgileri;
import com.birkil.hospitalmonitoring.service.HastaBilgileriService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/hasta")
public class HastaBilgileriController {

    private final HastaBilgileriService hastaBilgileriService;


    public HastaBilgileriController(HastaBilgileriService hastaBilgileriService) {
        this.hastaBilgileriService = hastaBilgileriService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<HastaBilgileri>> getAllHastaBilgisi(){
        List<HastaBilgileri> hastaBilgileriList = hastaBilgileriService.getAllHasta();
        return ResponseEntity.ok(hastaBilgileriList);
    }

    @GetMapping("/{id}")
    public ResponseEntity<HastaBilgileri> getHastaBilgisiById(@PathVariable Long id){
        HastaBilgileri hastaBilgileri = hastaBilgileriService.getHastaById(id);
        return ResponseEntity.ok(hastaBilgileri);
    }

    @PostMapping("/create")
    public ResponseEntity<HastaBilgileri> createHastaBilgisi(@RequestBody HastaBilgileri hastaBilgileri){
        HastaBilgileri createdHastaBilgisi = hastaBilgileriService.createHasta(hastaBilgileri);
        return ResponseEntity.ok(createdHastaBilgisi);
    }

    @PutMapping("/{id}")
    public ResponseEntity<HastaBilgileri> updateHastaBilgisi(@PathVariable Long id,
                                                             @RequestBody HastaBilgileri hastaBilgileri){
        HastaBilgileri updatedHastaBilgisi = hastaBilgileriService.updateHasta(id, hastaBilgileri);
        return ResponseEntity.ok(updatedHastaBilgisi);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteHastaBilgisi(@PathVariable Long id){
        hastaBilgileriService.deleteHasta(id);
        return ResponseEntity.noContent().build();
    }

}
