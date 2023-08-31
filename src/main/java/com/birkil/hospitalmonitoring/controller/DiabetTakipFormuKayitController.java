package com.birkil.hospitalmonitoring.controller;

import com.birkil.hospitalmonitoring.entity.DiabetTakipFormuKayit;
import com.birkil.hospitalmonitoring.service.DiabetTakipFormuKayitService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/diabet-takip-formu-kayit")
public class DiabetTakipFormuKayitController {

    private final DiabetTakipFormuKayitService diabetTakipFormuKayitService;

    public DiabetTakipFormuKayitController(DiabetTakipFormuKayitService diabetTakipFormuKayitService) {
        this.diabetTakipFormuKayitService = diabetTakipFormuKayitService;
    }

    @GetMapping
    public ResponseEntity<List<DiabetTakipFormuKayit>> getAllDiyabetKayit(){
        List<DiabetTakipFormuKayit> diabetTakipFormuKayitList = diabetTakipFormuKayitService.getAllDiabetKayit();
        return ResponseEntity.ok(diabetTakipFormuKayitList);
    }

    @GetMapping("/{id}")
    public ResponseEntity<DiabetTakipFormuKayit> getDiabetKayitById(@PathVariable Long id){
        DiabetTakipFormuKayit diabetTakipFormuKayit = diabetTakipFormuKayitService.getDiabetKayitById(id);
        return ResponseEntity.ok(diabetTakipFormuKayit);
    }

    @PostMapping("/create")
    public ResponseEntity<DiabetTakipFormuKayit> createDiabetKayit(@RequestBody DiabetTakipFormuKayit diabetTakipFormuKayit){
        DiabetTakipFormuKayit createdDiabetKayit = diabetTakipFormuKayitService.createDiabetKayit(diabetTakipFormuKayit);
        return ResponseEntity.ok(createdDiabetKayit);
    }

    @PutMapping("/{id}")
    public ResponseEntity<DiabetTakipFormuKayit> updateDiabetKayit(@PathVariable Long id, @RequestBody DiabetTakipFormuKayit diabetTakipFormuKayit){
        DiabetTakipFormuKayit updatedDiabetKayit = diabetTakipFormuKayitService.updateDiabetKayit(id, diabetTakipFormuKayit);
        return ResponseEntity.ok(updatedDiabetKayit);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteDiabetKayit(@PathVariable Long id){
        diabetTakipFormuKayitService.deleteDiabetTakip(id);
        return ResponseEntity.noContent().build();
    }
}
