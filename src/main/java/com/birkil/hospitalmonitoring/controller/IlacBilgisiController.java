package com.birkil.hospitalmonitoring.controller;

import com.birkil.hospitalmonitoring.entity.IlacBilgisi;
import com.birkil.hospitalmonitoring.service.IlacBilgisiService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ilac-bilgisi")
public class IlacBilgisiController {
    private final IlacBilgisiService ilacBilgisiService;

    public IlacBilgisiController(IlacBilgisiService ilacBilgisiService) {
        this.ilacBilgisiService = ilacBilgisiService;
    }

    @GetMapping
    public ResponseEntity<List<IlacBilgisi>> getAllIlacBilgisi(){
        List<IlacBilgisi> ilacBilgisiList = ilacBilgisiService.getAllIlacBilgisi();
        return ResponseEntity.ok(ilacBilgisiList);
    }

    @GetMapping("/{id}")
    public ResponseEntity<IlacBilgisi> getIlacBilgisiById(@PathVariable Long id){
        IlacBilgisi ilacBilgisi = ilacBilgisiService.getIlacBilgisiById(id);
        return ResponseEntity.ok(ilacBilgisi);
    }

    @PostMapping("/create")
    public ResponseEntity<IlacBilgisi> createIlacBilgisi(@RequestBody IlacBilgisi ilacBilgisi){
        IlacBilgisi createdIlacBilgisi = ilacBilgisiService.createIlacBilgisi(ilacBilgisi);
        return ResponseEntity.ok(createdIlacBilgisi);
    }

    @PutMapping("/{id}")
    public ResponseEntity<IlacBilgisi> updateIlacBilgisi(@PathVariable Long id, @RequestBody IlacBilgisi ilacBilgisi){
        IlacBilgisi updatedIlacBilgisi = ilacBilgisiService.updateIlacBilgisi(id, ilacBilgisi);
        return ResponseEntity.ok(updatedIlacBilgisi);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteIlacBilgisi(@PathVariable Long id){
        ilacBilgisiService.deleteIlacBilgisi(id);
        return ResponseEntity.noContent().build();
    }
}
