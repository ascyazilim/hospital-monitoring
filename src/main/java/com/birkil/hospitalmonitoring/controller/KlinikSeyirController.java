package com.birkil.hospitalmonitoring.controller;

import com.birkil.hospitalmonitoring.entity.KlinikSeyir;
import com.birkil.hospitalmonitoring.service.KlinikSeyirService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/klinik-seyir")
public class KlinikSeyirController {

    private final KlinikSeyirService klinikSeyirService;

    public KlinikSeyirController(KlinikSeyirService klinikSeyirService) {
        this.klinikSeyirService = klinikSeyirService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<KlinikSeyir>> getAllKlinikSeyir(){
        List<KlinikSeyir> klinikSeyirList = klinikSeyirService.getAllKlinikSeyir();
        return ResponseEntity.ok(klinikSeyirList);
    }

    @GetMapping("/{id}")
    public ResponseEntity<KlinikSeyir> getKlinikSeyirById(@PathVariable Long id) {
        KlinikSeyir klinikSeyir = klinikSeyirService.getKlinikSeyirById(id);
        return ResponseEntity.ok(klinikSeyir);
    }

    @PostMapping("/create")
    public ResponseEntity<KlinikSeyir> createKlinikSeyir(@RequestBody KlinikSeyir klinikSeyir) {
        KlinikSeyir createdKlinikSeyir = klinikSeyirService.createKlinikSeyir(klinikSeyir);
        return ResponseEntity.ok(klinikSeyir);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<KlinikSeyir> updateKlinikSeyir(@PathVariable Long id, @RequestBody KlinikSeyir klinikSeyir) {
        KlinikSeyir updatedKlinikSeyir = klinikSeyirService.updateKlinikSeyir(id, klinikSeyir);
        return ResponseEntity.ok(klinikSeyir);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteKlinikSeyir(@PathVariable Long id){
        klinikSeyirService.deleteKlinikSeyir(id);
        return ResponseEntity.noContent().build();
    }
}
