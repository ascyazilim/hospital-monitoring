package com.birkil.hospitalmonitoring.controller;

import com.birkil.hospitalmonitoring.entity.BransGorusBilgisi;
import com.birkil.hospitalmonitoring.service.BransGorusBilgisiService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/brans-gorus")
public class BransGorusBilgisiController {

    private final BransGorusBilgisiService bransGorusBilgisiService;

    public BransGorusBilgisiController(BransGorusBilgisiService bransGorusBilgisiService) {
        this.bransGorusBilgisiService = bransGorusBilgisiService;
    }

    @GetMapping
    public ResponseEntity<List<BransGorusBilgisi>> getAllBransGorusBilgisi(){
        List<BransGorusBilgisi> bransGorusBilgisiList = bransGorusBilgisiService.getAllBransGorusBilgisi();
        return ResponseEntity.ok(bransGorusBilgisiList);
    }

    @GetMapping("/{id}")
    public ResponseEntity<BransGorusBilgisi> getBransGorusBilgisiById(@PathVariable Long id){
        BransGorusBilgisi bransGorusBilgisi = bransGorusBilgisiService.getBransGorusBilgisiById(id);
        return ResponseEntity.ok(bransGorusBilgisi);
    }

    @PostMapping("/create")
    public ResponseEntity<BransGorusBilgisi> createBransGorusBilgisi(@RequestBody BransGorusBilgisi bransGorusBilgisi){
        BransGorusBilgisi createdBransGorusBilgisi = bransGorusBilgisiService.createBransGorusBilgisi(bransGorusBilgisi);
        return ResponseEntity.ok(createdBransGorusBilgisi);
    }

    @PutMapping("/{id}")
    public ResponseEntity<BransGorusBilgisi> updateBransGorusBilgisi(@PathVariable Long id, @RequestBody BransGorusBilgisi bransGorusBilgisi){
        BransGorusBilgisi updatedBransGorusBilgisi = bransGorusBilgisiService.updateBransGorusBilgisi(id, bransGorusBilgisi);
        return ResponseEntity.ok(updatedBransGorusBilgisi);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteBransGorusBilgisi(@PathVariable Long id){
        bransGorusBilgisiService.deleteBransGorusBilgisi(id);
        return ResponseEntity.noContent().build();
    }

}
