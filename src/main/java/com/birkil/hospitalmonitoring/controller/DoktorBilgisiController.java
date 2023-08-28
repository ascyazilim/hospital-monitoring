package com.birkil.hospitalmonitoring.controller;

import com.birkil.hospitalmonitoring.entity.DoktorBilgisi;
import com.birkil.hospitalmonitoring.service.DoktorBilgisiService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("doktor-bilgisi")
public class DoktorBilgisiController {

    private final DoktorBilgisiService doktorBilgisiService;

    public DoktorBilgisiController(DoktorBilgisiService doktorBilgisiService) {
        this.doktorBilgisiService = doktorBilgisiService;
    }

    @GetMapping
    public ResponseEntity<List<DoktorBilgisi>> getAllDoktorBilgisi(){
        List<DoktorBilgisi> doktorBilgisiList = doktorBilgisiService.getAllDoktorList();
        return ResponseEntity.ok(doktorBilgisiList);
    }

    @GetMapping("/{id}")
    public ResponseEntity<DoktorBilgisi> getDoktorBilgisiById(@PathVariable Long id){
        DoktorBilgisi doktorBilgisi = doktorBilgisiService.getDoktorBilgisiById(id);
        return ResponseEntity.ok(doktorBilgisi);
    }

    @PostMapping("/create")
    public ResponseEntity<DoktorBilgisi> createDoktorBilgisi(@RequestBody DoktorBilgisi doktorBilgisi){
        DoktorBilgisi createdDoktorBilgisi = doktorBilgisiService.createDoktorBilgisi(doktorBilgisi);
        return ResponseEntity.ok(createdDoktorBilgisi);
    }

    @PutMapping("/{id}")
    public ResponseEntity<DoktorBilgisi> updateDoktorBilgisi(@PathVariable Long id, @RequestBody DoktorBilgisi doktorBilgisi){
        DoktorBilgisi updatedDoktorBilgisi = doktorBilgisiService.updateDoktorBilgisi(id, doktorBilgisi);
        return ResponseEntity.ok(updatedDoktorBilgisi);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteDoktorBilgisi(@PathVariable Long id){
        doktorBilgisiService.deleteDoktorBilgisi(id);
        return ResponseEntity.noContent().build();
    }
}
