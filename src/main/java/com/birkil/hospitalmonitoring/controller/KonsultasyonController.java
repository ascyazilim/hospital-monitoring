package com.birkil.hospitalmonitoring.controller;

import com.birkil.hospitalmonitoring.entity.Konsultasyon;
import com.birkil.hospitalmonitoring.service.KonsultasyonService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/konsultasyon")
public class KonsultasyonController {

    private final KonsultasyonService konsultasyonService;

    public KonsultasyonController(KonsultasyonService konsultasyonService) {
        this.konsultasyonService = konsultasyonService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Konsultasyon>> getAllKonsultasyon(){
        List<Konsultasyon> konsultasyonList = konsultasyonService.getAllKonsultasyon();
        return ResponseEntity.ok(konsultasyonList);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Konsultasyon> getKonsultasyonById(@PathVariable Long id) {
        Konsultasyon konsultasyon = konsultasyonService.getKonsultasyonById(id);
        return ResponseEntity.ok(konsultasyon);
    }

    @PostMapping("/create")
    public ResponseEntity<Konsultasyon> createKonsultasyon(@RequestBody Konsultasyon konsultasyon){
        Konsultasyon createdKonsultasyon = konsultasyonService.createKonsultasyon(konsultasyon);
        return ResponseEntity.ok(createdKonsultasyon);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Konsultasyon> updateKonsultasyon(@PathVariable Long id, @RequestBody Konsultasyon konsultasyon){
        Konsultasyon updatedKonsultasyon = konsultasyonService.updateKonsultasyon(id, konsultasyon);
        return ResponseEntity.ok(updatedKonsultasyon);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteKonsultasyon(@PathVariable Long id) {
        konsultasyonService.deleteKonsultasyon(id);
        return ResponseEntity.noContent().build();
    }
}
