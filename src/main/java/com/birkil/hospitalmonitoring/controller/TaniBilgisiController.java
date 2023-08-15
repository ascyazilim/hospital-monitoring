package com.birkil.hospitalmonitoring.controller;

import com.birkil.hospitalmonitoring.entity.TaniBilgisi;
import com.birkil.hospitalmonitoring.service.TaniBilgisiService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tani-bilgisi")
public class TaniBilgisiController {

    private final TaniBilgisiService taniBilgisiService;

    public TaniBilgisiController(TaniBilgisiService taniBilgisiService) {
        this.taniBilgisiService = taniBilgisiService;
    }

    @GetMapping
    public ResponseEntity<List<TaniBilgisi>> getAllTaniBilgisi(){
        List<TaniBilgisi> taniBilgisiList = taniBilgisiService.getAllTaniBilgisi();
        return ResponseEntity.ok(taniBilgisiList);
    }

    @GetMapping("/{id}")
    public  ResponseEntity<TaniBilgisi> getTaniBilgisiById(@PathVariable Long id){
        TaniBilgisi taniBilgisi = taniBilgisiService.getTaniBilgisiById(id);
        return ResponseEntity.ok(taniBilgisi);
    }

    @PostMapping("/create")
    public ResponseEntity<TaniBilgisi> createTaniBilgisi(@RequestBody TaniBilgisi taniBilgisi){
        TaniBilgisi createdTaniBilgisi = taniBilgisiService.createTaniBilgisi(taniBilgisi);
        return ResponseEntity.ok(createdTaniBilgisi);
    }

    @PutMapping("/{id}")
    public ResponseEntity<TaniBilgisi> updateTaniBilgisi(@PathVariable Long id, @RequestBody TaniBilgisi taniBilgisi){
        TaniBilgisi updatedTaniBilgisi = taniBilgisiService.updateTaniBilgisi(id, taniBilgisi);
        return ResponseEntity.ok(updatedTaniBilgisi);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteTaniBilgisi(@PathVariable Long id){
        taniBilgisiService.deleteTaniBilgisi(id);
        return ResponseEntity.noContent().build();
    }
}
