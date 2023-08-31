package com.birkil.hospitalmonitoring.controller;

import com.birkil.hospitalmonitoring.entity.HastalikRapor;
import com.birkil.hospitalmonitoring.service.HastalikRaporService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hastalik-rapor")
public class HastalikRaporController {

    private final HastalikRaporService hastalikRaporService;

    public HastalikRaporController(HastalikRaporService hastalikRaporService) {
        this.hastalikRaporService = hastalikRaporService;
    }

    @GetMapping
    public ResponseEntity<List<HastalikRapor>> getAllHastalikRapor(){
        List<HastalikRapor> hastalikRaporList = hastalikRaporService.getAllHastalikRapor();
        return ResponseEntity.ok(hastalikRaporList);
    }
    @GetMapping("/{id}")
    public ResponseEntity<HastalikRapor> getHastalikRaporById(@PathVariable Long id){
        HastalikRapor hastalikRapor = hastalikRaporService.getHastalikRaporById(id);
        return ResponseEntity.ok(hastalikRapor);
    }
    @PostMapping("/create")
    public ResponseEntity<HastalikRapor> createHastalikRapor(@RequestBody HastalikRapor hastalikRapor){
        HastalikRapor createdHastalikRapor = hastalikRaporService.createHastalikRapor(hastalikRapor);
        return ResponseEntity.ok(createdHastalikRapor);
    }
    @PutMapping("/update/{id}")
    public ResponseEntity<HastalikRapor> updateHastalikRapor(@PathVariable Long id, @RequestBody HastalikRapor hastalikRapor){
        HastalikRapor updatedHastalikRapor = hastalikRaporService.updateHastalikRapor(id, hastalikRapor);
        return ResponseEntity.ok(updatedHastalikRapor);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteHastalikRapor(@PathVariable Long id){
        hastalikRaporService.deleteHastalikRapor(id);
        return ResponseEntity.noContent().build();
    }
}
