package com.birkil.hospitalmonitoring.controller;

import com.birkil.hospitalmonitoring.entity.Hizmet;
import com.birkil.hospitalmonitoring.service.HizmetService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hizmet")
public class HizmetController {

    private final HizmetService hizmetService;

    public HizmetController(HizmetService hizmetService) {
        this.hizmetService = hizmetService;
    }

    @GetMapping
    public ResponseEntity<List<Hizmet>> getAllHizmet(){
        List<Hizmet> hizmetList = hizmetService.getAllHizmet();
        return ResponseEntity.ok(hizmetList);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Hizmet> getHizmetById(@PathVariable Long id){
        Hizmet hizmet = hizmetService.getHizmetById(id);
        return ResponseEntity.ok(hizmet);
    }

    @PostMapping("/create")
    public ResponseEntity<Hizmet> createTakip(@RequestBody Hizmet hizmet){
        Hizmet createdHizmet = hizmetService.createHizmet(hizmet);
        return ResponseEntity.ok(createdHizmet);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Hizmet> updateHizmet(@PathVariable Long id, @RequestBody Hizmet hizmet){
        Hizmet updatedHizmet = hizmetService.updateHizmet(id, hizmet);
        return ResponseEntity.ok(updatedHizmet);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteHizmet(@PathVariable Long id){
        hizmetService.deleteHizmet(id);
        return ResponseEntity.noContent().build();
    }
}
