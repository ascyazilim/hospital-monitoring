package com.birkil.hospitalmonitoring.controller;

import com.birkil.hospitalmonitoring.entity.AmeliyatGirisimBilgisi;
import com.birkil.hospitalmonitoring.service.AmeliyatGirisimBilgisiService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ameliyat-girisim")
public class AmeliyatGirisimBilgisiController {

    private final AmeliyatGirisimBilgisiService ameliyatGirisimBilgisiService;

    public AmeliyatGirisimBilgisiController(AmeliyatGirisimBilgisiService ameliyatGirisimBilgisiService) {
        this.ameliyatGirisimBilgisiService = ameliyatGirisimBilgisiService;
    }

    @GetMapping
    public ResponseEntity<List<AmeliyatGirisimBilgisi>> getAllAmeliyatGirisimBilgisi(){
        List<AmeliyatGirisimBilgisi> ameliyatGirisimBilgisiList = ameliyatGirisimBilgisiService.getAllAmeliyatGirisimBilgisi();
        return ResponseEntity.ok(ameliyatGirisimBilgisiList);
    }

    @GetMapping("/{id}")
    public ResponseEntity<AmeliyatGirisimBilgisi> getAmeliyatGirisimBilgisiById(@PathVariable Long id){
        AmeliyatGirisimBilgisi ameliyatGirisimBilgisi = ameliyatGirisimBilgisiService.getAmeliyatGirisimBilgisiById(id);
        return ResponseEntity.ok(ameliyatGirisimBilgisi);
    }

    @PostMapping("/create")
    public ResponseEntity<AmeliyatGirisimBilgisi> createAmeliyatGirisimBilgisi(@RequestBody AmeliyatGirisimBilgisi ameliyatGirisimBilgisi){
        AmeliyatGirisimBilgisi createdAmeliyatGirisimBilgisi = ameliyatGirisimBilgisiService.createAmeliyatGirisimBilgisi(ameliyatGirisimBilgisi);
        return ResponseEntity.ok(createdAmeliyatGirisimBilgisi);
    }

    @PutMapping("/{id}")
    public ResponseEntity<AmeliyatGirisimBilgisi> updateAmeliyatGirisimBilgisi(@PathVariable Long id, @RequestBody AmeliyatGirisimBilgisi ameliyatGirisimBilgisi){
        AmeliyatGirisimBilgisi updatedAmeliyatGirisimBilgisi = ameliyatGirisimBilgisiService.updateAmeliyatGirisimBilgisi(id, ameliyatGirisimBilgisi);
        return ResponseEntity.ok(updatedAmeliyatGirisimBilgisi);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteAmeliyatGirisimBilgisi(@PathVariable Long id){
        ameliyatGirisimBilgisiService.deleteAmeliyatGirisimBilgisi(id);
        return ResponseEntity.noContent().build();
    }
}
