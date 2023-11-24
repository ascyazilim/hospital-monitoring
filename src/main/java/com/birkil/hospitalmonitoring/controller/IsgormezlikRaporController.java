package com.birkil.hospitalmonitoring.controller;

import com.birkil.hospitalmonitoring.entity.IsgoremezlikRapor;
import com.birkil.hospitalmonitoring.service.IsgormezlikRaporService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/isgormezlik-rapor")
public class IsgormezlikRaporController {

    private final IsgormezlikRaporService isgormezlikRaporService;

    public IsgormezlikRaporController(IsgormezlikRaporService isgormezlikRaporService) {
        this.isgormezlikRaporService = isgormezlikRaporService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<IsgoremezlikRapor>> getAllIsgormezlikRapor(){
        List<IsgoremezlikRapor> isgoremezlikRaporList = isgormezlikRaporService.getAllIsgormezlikRapor();
        return ResponseEntity.ok(isgoremezlikRaporList);
    }

    @GetMapping("/{id}")
    public ResponseEntity<IsgoremezlikRapor> getIsgormezlikRaporById(@PathVariable Long id){
        IsgoremezlikRapor isgoremezlikRapor = isgormezlikRaporService.getIsgormezlikRaporById(id);
        return ResponseEntity.ok(isgoremezlikRapor);
    }

    @PostMapping("/create")
    public ResponseEntity<IsgoremezlikRapor> createIsgormezlikRapor(@RequestBody IsgoremezlikRapor isgoremezlikRapor){
        IsgoremezlikRapor createdIsgormezlikRapor = isgormezlikRaporService.createIsgormezlikRapor(isgoremezlikRapor);
        return ResponseEntity.ok(createdIsgormezlikRapor);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<IsgoremezlikRapor> updateIsgormezlikRapor(@PathVariable Long id, @RequestBody IsgoremezlikRapor isgoremezlikRapor){
        IsgoremezlikRapor updatedIsgormezlikRapor = isgormezlikRaporService.updateIsgormezlikRapor(id, isgoremezlikRapor);
        return ResponseEntity.ok(updatedIsgormezlikRapor);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteIsgormezlikRapor(@PathVariable Long id){
        isgormezlikRaporService.deleteIsgormezlikRapor(id);
        return ResponseEntity.noContent().build();
    }
}
