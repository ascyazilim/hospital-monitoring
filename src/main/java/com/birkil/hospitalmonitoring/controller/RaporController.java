package com.birkil.hospitalmonitoring.controller;

import com.birkil.hospitalmonitoring.entity.Rapor;
import com.birkil.hospitalmonitoring.service.RaporService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rapor")
public class RaporController {

    private final RaporService raporService;

    public RaporController(RaporService raporService) {
        this.raporService = raporService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Rapor>> getAllRapor(){
        List<Rapor> raporList = raporService.getAllRapor();
        return ResponseEntity.ok(raporList);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Rapor> getRaporById(@PathVariable Long id) {
        Rapor rapor = raporService.getRaporById(id);
        return ResponseEntity.ok(rapor);
    }

    @PostMapping("/create")
    public ResponseEntity<Rapor> createRapor(@RequestBody Rapor rapor) {
        Rapor createdRapor = raporService.createRapor(rapor);
        return ResponseEntity.ok(createdRapor);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Rapor> updateRapor(@PathVariable Long id,@RequestBody Rapor rapor) {
        Rapor updatedRapor = raporService.updateRapor(id, rapor);
        return ResponseEntity.ok(updatedRapor);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteRapor(@PathVariable Long id) {
        raporService.deleteRapor(id);
        return ResponseEntity.noContent().build();
    }
}
