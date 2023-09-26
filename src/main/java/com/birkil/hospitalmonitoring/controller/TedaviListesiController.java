package com.birkil.hospitalmonitoring.controller;


import com.birkil.hospitalmonitoring.entity.TedaviListesi;
import com.birkil.hospitalmonitoring.service.TedaviListesiService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tedavi-list")
public class TedaviListesiController {

    private final TedaviListesiService tedaviListesiService;

    public TedaviListesiController(TedaviListesiService tedaviListesiService) {
        this.tedaviListesiService = tedaviListesiService;
    }

    @GetMapping
    public ResponseEntity<List<TedaviListesi>> getAllTedaviListesi(){
        List<TedaviListesi> tedaviListesiList = tedaviListesiService.getAllTedaviListesi();
        return ResponseEntity.ok(tedaviListesiList);
    }

    @GetMapping("/{id}")
    public ResponseEntity<TedaviListesi> getTedaviListesiById(@PathVariable Long id){
        TedaviListesi tedaviListesi = tedaviListesiService.getTedaviListesiById(id);
        return ResponseEntity.ok(tedaviListesi);
    }

    @PostMapping("/create")
    public ResponseEntity<TedaviListesi> createTedaviListesi(@RequestBody TedaviListesi tedaviListesi){
        TedaviListesi createdTedaviListesi = tedaviListesiService.createTedaviListesi(tedaviListesi);
        return ResponseEntity.ok(createdTedaviListesi);
    }

    @PutMapping("/{id}")
    public ResponseEntity<TedaviListesi> updateTedaviListesi(@PathVariable Long id, @RequestBody TedaviListesi tedaviListesi){
        TedaviListesi updatedTedaviListesi = tedaviListesiService.updateTedaviListesi(id, tedaviListesi);
        return ResponseEntity.ok(updatedTedaviListesi);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteTedaviListesi(@PathVariable Long id){
        tedaviListesiService.deleteTedaviListesi(id);
        return ResponseEntity.noContent().build();
    }
}
