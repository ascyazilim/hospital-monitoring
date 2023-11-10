package com.birkil.hospitalmonitoring.controller;

import com.birkil.hospitalmonitoring.entity.IlacRapor;
import com.birkil.hospitalmonitoring.service.IlacRaporService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ilac-rapor")
public class IlacRaporController {

    private final IlacRaporService ilacRaporService;

    public IlacRaporController(IlacRaporService ilacRaporService) {
        this.ilacRaporService = ilacRaporService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<IlacRapor>> getAllIlacRapor() {
        List<IlacRapor> ilacRaporList = ilacRaporService.getIlacRaporAll();
        return ResponseEntity.ok(ilacRaporList);
    }

    @GetMapping("/{id}")
    public ResponseEntity<IlacRapor> getIlacRaporById(@PathVariable Long id) {
        IlacRapor ilacRapor = ilacRaporService.getIlacRaporById(id);
        return ResponseEntity.ok(ilacRapor);
    }

    @PostMapping("/create")
    public ResponseEntity<IlacRapor> createIlacRapor(@RequestBody IlacRapor ilacRapor) {
        IlacRapor createdIlacRapor = ilacRaporService.createIlacRapor(ilacRapor);
        return ResponseEntity.ok(createdIlacRapor);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<IlacRapor> updateIlacRapor(@PathVariable Long id, @RequestBody IlacRapor ilacRapor) {
        IlacRapor updatedIlacRapor = ilacRaporService.updateIlacRapor(id, ilacRapor);
        return ResponseEntity.ok(updatedIlacRapor);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteIlacRapor(@PathVariable Long id) {
        ilacRaporService.deleteIlacRapor(id);
        return ResponseEntity.noContent().build();
    }
}
