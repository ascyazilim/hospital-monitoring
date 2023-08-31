package com.birkil.hospitalmonitoring.controller;

import com.birkil.hospitalmonitoring.entity.DiabetTakipFormu;
import com.birkil.hospitalmonitoring.service.DiabetTakipFormuService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/diabet-takip-formu")
public class DiabetTakipFormuController {

    private final DiabetTakipFormuService diabetTakipFormuService;

    public DiabetTakipFormuController(DiabetTakipFormuService diabetTakipFormuService) {
        this.diabetTakipFormuService = diabetTakipFormuService;
    }

    @GetMapping
    public ResponseEntity<List<DiabetTakipFormu>> getAllDiabetTakip(){
        List<DiabetTakipFormu> diabetTakipFormuList = diabetTakipFormuService.getAllDiabetTakip();
        return ResponseEntity.ok(diabetTakipFormuList);
    }

    @GetMapping("{id}")
    public ResponseEntity<DiabetTakipFormu> getDiabetTakipById(@PathVariable Long id){
        DiabetTakipFormu diabetTakipFormu = diabetTakipFormuService.getDiabetTakipById(id);
        return ResponseEntity.ok(diabetTakipFormu);
    }

    @PostMapping("/create")
    public ResponseEntity<DiabetTakipFormu> createTakipFormu(@RequestBody DiabetTakipFormu diabetTakipFormu){
        DiabetTakipFormu createdDiabetTakip = diabetTakipFormuService.createDiabetTakip(diabetTakipFormu);
        return ResponseEntity.ok(createdDiabetTakip);
    }

    @PutMapping("/{id}")
    public ResponseEntity<DiabetTakipFormu> updateDiabetTakip(@PathVariable Long id, @RequestBody DiabetTakipFormu diabetTakipFormu){
        DiabetTakipFormu updatedDiabetTakip = diabetTakipFormuService.updateDiabetKayit(id, diabetTakipFormu);
        return ResponseEntity.ok(updatedDiabetTakip);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteDiabetTakip(@PathVariable Long id){
        diabetTakipFormuService.deleteDiabetKayit(id);
        return ResponseEntity.noContent().build();
    }
}
