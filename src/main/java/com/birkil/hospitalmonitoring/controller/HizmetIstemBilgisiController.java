package com.birkil.hospitalmonitoring.controller;

import com.birkil.hospitalmonitoring.entity.HizmetIstemBilgisi;
import com.birkil.hospitalmonitoring.service.HizmetIstemBilgisiService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hizmet-istem-bilgisi")
public class HizmetIstemBilgisiController {

    private final HizmetIstemBilgisiService hizmetIstemBilgisiService;

    public HizmetIstemBilgisiController(HizmetIstemBilgisiService hizmetIstemBilgisiService) {
        this.hizmetIstemBilgisiService = hizmetIstemBilgisiService;
    }

    @GetMapping
    public ResponseEntity<List<HizmetIstemBilgisi>> getAllIstem(){
        List<HizmetIstemBilgisi> hizmetIstemBilgisiList = hizmetIstemBilgisiService.getAllHizmetIstemBilgisi();
        return ResponseEntity.ok(hizmetIstemBilgisiList);
    }

    @GetMapping("/{id}")
    public ResponseEntity<HizmetIstemBilgisi> getIstemById(@PathVariable Long id){
        HizmetIstemBilgisi hizmetIstemBilgisi = hizmetIstemBilgisiService.getHizmetIstemBilgisiById(id);
        return ResponseEntity.ok(hizmetIstemBilgisi);
    }

    @PostMapping("/create")
    public ResponseEntity<HizmetIstemBilgisi> createIstem(@RequestBody HizmetIstemBilgisi hizmetIstemBilgisi){
        HizmetIstemBilgisi createdIstem = hizmetIstemBilgisiService.createHizmetIstemBilgisi(hizmetIstemBilgisi);
        return ResponseEntity.ok(createdIstem);
    }

    @PutMapping("/{id}")
    public ResponseEntity<HizmetIstemBilgisi> updateIstem(@PathVariable Long id, @RequestBody HizmetIstemBilgisi hizmetIstemBilgisi){
        HizmetIstemBilgisi updatedIstem = hizmetIstemBilgisiService.updateHizmetIstemBilgisi(id, hizmetIstemBilgisi);
        return ResponseEntity.ok(updatedIstem);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteIstem(@PathVariable Long id){
        hizmetIstemBilgisiService.deleteHizmetIstemBilgisi(id);
        return ResponseEntity.noContent().build();
    }
}
