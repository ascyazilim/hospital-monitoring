package com.birkil.hospitalmonitoring.controller;

import com.birkil.hospitalmonitoring.entity.IlacRaporHazirlama;
import com.birkil.hospitalmonitoring.service.IlacRaporHazirlamaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ilac-rapor-hazirlama")
public class IlacRaporHazirlamaController {

    private final IlacRaporHazirlamaService ilacRaporHazirlamaService;

    public IlacRaporHazirlamaController(IlacRaporHazirlamaService ilacRaporHazirlamaService) {
        this.ilacRaporHazirlamaService = ilacRaporHazirlamaService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<IlacRaporHazirlama>> getAllIlacRaporHazirlama() {
        List<IlacRaporHazirlama> ilacRaporHazirlamaList = ilacRaporHazirlamaService.getAllIlacRaporHazirlama();
        return ResponseEntity.ok(ilacRaporHazirlamaList);
    }

    @GetMapping("/{id}")
    public ResponseEntity<IlacRaporHazirlama> getIlacRaporHazirlamaById(@PathVariable Long id){
        IlacRaporHazirlama ilacRaporHazirlama = ilacRaporHazirlamaService.getIlacRaporHazirlamaById(id);
        return ResponseEntity.ok(ilacRaporHazirlama);
    }

    @PostMapping("/create")
    public ResponseEntity<IlacRaporHazirlama> createIlacRaporHazirlama(@RequestBody IlacRaporHazirlama ilacRaporHazirlama){
        IlacRaporHazirlama createdIlacRaporHazirlama = ilacRaporHazirlamaService.createIlacRaporHazirlama(ilacRaporHazirlama);
        return ResponseEntity.ok(createdIlacRaporHazirlama);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<IlacRaporHazirlama> updateIlacRaporHazirlama(@PathVariable Long id, @RequestBody IlacRaporHazirlama ilacRaporHazirlama){
        IlacRaporHazirlama updatedIlacRaporHazirlama = ilacRaporHazirlamaService.updateIlacRaporHazirlama(id, ilacRaporHazirlama);
        return ResponseEntity.ok(updatedIlacRaporHazirlama);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteIlacRaporHazirlama(@PathVariable Long id) {
        ilacRaporHazirlamaService.deleteIlacRaporHazirlama(id);
        return ResponseEntity.noContent().build();
    }

}
