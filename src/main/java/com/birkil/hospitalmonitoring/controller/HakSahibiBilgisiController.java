package com.birkil.hospitalmonitoring.controller;

import com.birkil.hospitalmonitoring.entity.HakSahibiBilgisi;
import com.birkil.hospitalmonitoring.service.HakSahibiBilgisiService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hak-sahibi-bilgisi")
public class HakSahibiBilgisiController {

    private final HakSahibiBilgisiService hakSahibiBilgisiService;

    public HakSahibiBilgisiController(HakSahibiBilgisiService hakSahibiBilgisiService) {
        this.hakSahibiBilgisiService = hakSahibiBilgisiService;
    }

    @GetMapping
    public ResponseEntity<List<HakSahibiBilgisi>> getAllHakSahibiBilgisi(){
        List<HakSahibiBilgisi> hakSahibiBilgisiList = hakSahibiBilgisiService.getAllHakSahibiBilgisi();
        return ResponseEntity.ok(hakSahibiBilgisiList);
    }

    @GetMapping("/{id}")
    public ResponseEntity<HakSahibiBilgisi> getHakSahibiBilgisiById(@PathVariable Long id){
        HakSahibiBilgisi hakSahibiBilgisi = hakSahibiBilgisiService.getHakSahibiBilgisiById(id);
        return ResponseEntity.ok(hakSahibiBilgisi);
    }

    @PostMapping("/create")
    public ResponseEntity<HakSahibiBilgisi> createHakSahibiBilgisi(@RequestBody HakSahibiBilgisi hakSahibiBilgisi){
        HakSahibiBilgisi createdHakSahibiBilgisi = hakSahibiBilgisiService.createHakSahibiBilgisi(hakSahibiBilgisi);
        return ResponseEntity.ok(createdHakSahibiBilgisi);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<HakSahibiBilgisi> updateHakSahibiBilgisi(@PathVariable Long id, @RequestBody HakSahibiBilgisi hakSahibiBilgisi){
        HakSahibiBilgisi updatedHakSahibiBilgisi = hakSahibiBilgisiService.updateHakSahibiBilgisi(id, hakSahibiBilgisi);
        return ResponseEntity.ok(updatedHakSahibiBilgisi);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteHakSahibiBilgisi(@PathVariable Long id){
        hakSahibiBilgisiService.deleteHakSahibibilgisi(id);
        return ResponseEntity.noContent().build();
    }
}
