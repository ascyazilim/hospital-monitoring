package com.birkil.hospitalmonitoring.controller;

import com.birkil.hospitalmonitoring.entity.TahlilSonuc;
import com.birkil.hospitalmonitoring.service.TahlilSonucService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tahlil-sonuc")
public class TahlilSonucController {

    private final TahlilSonucService tahlilSonucService;

    public TahlilSonucController(TahlilSonucService tahlilSonucService) {
        this.tahlilSonucService = tahlilSonucService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<TahlilSonuc>> getAllTahlilSonuc() {
        List<TahlilSonuc> tahlilSonucList = tahlilSonucService.getAllTahlilSonuc();
        return ResponseEntity.ok(tahlilSonucList);
    }

    @GetMapping("/{id}")
    public ResponseEntity<TahlilSonuc> getTahlilSonucById(@PathVariable Long id) {
        TahlilSonuc tahlilSonuc = tahlilSonucService.getTahlilSonucById(id);
        return ResponseEntity.ok(tahlilSonuc);
    }

    @PostMapping("/create")
    public ResponseEntity<TahlilSonuc> createTahlilSonuc(@RequestBody TahlilSonuc tahlilSonuc) {
        TahlilSonuc createdTahlilSonuc = tahlilSonucService.createTahlilSonuc(tahlilSonuc);
        return ResponseEntity.ok(createdTahlilSonuc);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<TahlilSonuc> updateTahlilSonuc(@PathVariable Long id, @RequestBody TahlilSonuc tahlilSonuc) {
        TahlilSonuc updatedTahlilSonuc = tahlilSonucService.updateTahlilSonuc(id, tahlilSonuc);
        return ResponseEntity.ok(updatedTahlilSonuc);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteTahlilSonuc(@PathVariable Long id) {
        tahlilSonucService.deleteTahlilSonuc(id);
        return ResponseEntity.noContent().build();
    }
}
