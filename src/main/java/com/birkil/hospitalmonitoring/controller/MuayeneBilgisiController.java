package com.birkil.hospitalmonitoring.controller;

import com.birkil.hospitalmonitoring.entity.MuayeneBilgisi;
import com.birkil.hospitalmonitoring.service.MuayeneBilgisiService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/muayene-bilgisi")
public class MuayeneBilgisiController {

    private final MuayeneBilgisiService muayeneBilgisiService;

    public MuayeneBilgisiController(MuayeneBilgisiService muayeneBilgisiService) {
        this.muayeneBilgisiService = muayeneBilgisiService;
    }

    @GetMapping
    public ResponseEntity<List<MuayeneBilgisi>> getAllMuayeneBilgisi(){
        List<MuayeneBilgisi> muayeneBilgisiList = muayeneBilgisiService.getAllMuayeneBilgisi();
        return ResponseEntity.ok(muayeneBilgisiList);
    }

    @GetMapping("/{id}")
    public ResponseEntity<MuayeneBilgisi> getMuayeneBilgisiById(@PathVariable Long id){
        MuayeneBilgisi muayeneBilgisi = muayeneBilgisiService.getMuayeneBilgisiById(id);
        return ResponseEntity.ok(muayeneBilgisi);
    }

    @PostMapping("/create")
    public ResponseEntity<MuayeneBilgisi> createMuayeneBilgisi(@RequestBody MuayeneBilgisi muayeneBilgisi){
        MuayeneBilgisi createdMuayeneBilgisi = muayeneBilgisiService.createMuayeneBilgisi(muayeneBilgisi);
        return ResponseEntity.ok(createdMuayeneBilgisi);
    }

    @PutMapping("/{id}")
    public ResponseEntity<MuayeneBilgisi> updateMuayeneBilgisi(@PathVariable Long id, @RequestBody MuayeneBilgisi muayeneBilgisi){
        MuayeneBilgisi updatedMuayeneBilgisi = muayeneBilgisiService.updateMuayeneBilgisi(id, muayeneBilgisi);
        return ResponseEntity.ok(updatedMuayeneBilgisi);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteMuayeneBilgisi(@PathVariable Long id){
        muayeneBilgisiService.deleteMuayeneBilgisi(id);
        return ResponseEntity.noContent().build();
    }
}
