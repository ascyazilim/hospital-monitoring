package com.birkil.hospitalmonitoring.controller;

import com.birkil.hospitalmonitoring.entity.Takip;
import com.birkil.hospitalmonitoring.service.TakipService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/takip")
public class TakipController {

    private final TakipService takipService;


    public TakipController(TakipService takipService) {
        this.takipService = takipService;
    }

    @GetMapping
    public ResponseEntity<List<Takip>> getAllTakip(){
        List<Takip> takipList = takipService.getAllTakip();
        return ResponseEntity.ok(takipList);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Takip> getTakipById(@PathVariable Long id){
        Takip takip = takipService.getTakipById(id);
        return ResponseEntity.ok(takip);
    }

    @PostMapping("/create")
    public ResponseEntity<Takip> createTakip(@RequestBody Takip takip){
        Takip createdTakip = takipService.createTakip(takip);
        return ResponseEntity.ok(createdTakip);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Takip> updateTakip(@PathVariable Long id, @RequestBody Takip takip){
        Takip updatedTakip = takipService.updateTakip(id, takip);
        return ResponseEntity.ok(updatedTakip);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteTakip(@PathVariable Long id){
        takipService.deleteTakip(id);
        return ResponseEntity.noContent().build();
    }
}
