package com.birkil.hospitalmonitoring.controller;

import com.birkil.hospitalmonitoring.entity.AmeliyatGiris;
import com.birkil.hospitalmonitoring.service.AmeliyatGirisService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ameliyat-giris")
public class AmeliyatGirisController {

    private final AmeliyatGirisService ameliyatGirisService;

    public AmeliyatGirisController(AmeliyatGirisService ameliyatGirisService) {
        this.ameliyatGirisService = ameliyatGirisService;
    }

    @GetMapping
    public ResponseEntity<List<AmeliyatGiris>> getAllAmeliyatGiris(){
        List<AmeliyatGiris> ameliyatGirisList = ameliyatGirisService.getAllAmeliyatGiris();
        return ResponseEntity.ok(ameliyatGirisList);
    }

    @GetMapping("/{id}")
    public ResponseEntity<AmeliyatGiris> getAmeliyatGirisById(@PathVariable Long id){
        AmeliyatGiris ameliyatGiris = ameliyatGirisService.getAmeliyatGirisById(id);
        return ResponseEntity.ok(ameliyatGiris);
    }

    @PostMapping("/create")
    public ResponseEntity<AmeliyatGiris> createAmeliyatGiris(@RequestBody AmeliyatGiris ameliyatGiris){
        AmeliyatGiris createdAmeliyatGiris = ameliyatGirisService.createAmeliyatGiris(ameliyatGiris);
        return ResponseEntity.ok(createdAmeliyatGiris);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<AmeliyatGiris> updateAmeliyatGiris(@PathVariable Long id, @RequestBody AmeliyatGiris ameliyatGiris){
        AmeliyatGiris updatedAmeliyatGiris = ameliyatGirisService.updateAmeliyatGiris(id, ameliyatGiris);
        return ResponseEntity.ok(updatedAmeliyatGiris);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteAmeliyatGiris(@PathVariable Long id){
        ameliyatGirisService.deleteAmeliyatGiris(id);
        return ResponseEntity.noContent().build();
    }
}
