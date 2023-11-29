package com.birkil.hospitalmonitoring.controller;

import com.birkil.hospitalmonitoring.entity.HastaYatis;
import com.birkil.hospitalmonitoring.service.HastaYatisService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hasta-yatis")
public class HastaYatisController {

    private final HastaYatisService hastaYatisService;

    public HastaYatisController(HastaYatisService hastaYatisService) {
        this.hastaYatisService = hastaYatisService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<HastaYatis>> getAllHastaYatis(){
        List<HastaYatis> hastaYatisList = hastaYatisService.getAllHastaYatis();
        return ResponseEntity.ok(hastaYatisList);
    }

    @GetMapping("/{id}")
    public ResponseEntity<HastaYatis> getHastaYatisById(@PathVariable Long id) {
        HastaYatis hastaYatis = hastaYatisService.getHastaYatisById(id);
        return ResponseEntity.ok(hastaYatis);
    }

    @PostMapping("/create")
    public ResponseEntity<HastaYatis> createHastaYatis(@RequestBody HastaYatis hastaYatis){
        HastaYatis createdHastaYatis = hastaYatisService.createHastaYatis(hastaYatis);
        return ResponseEntity.ok(createdHastaYatis);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<HastaYatis> updateHastaYatis(@PathVariable Long id, @RequestBody HastaYatis hastaYatis){
        HastaYatis updatedHastaYatis = hastaYatisService.updateHastaYatis(id, hastaYatis);
        return ResponseEntity.ok(updatedHastaYatis);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteHastaYatis(@PathVariable Long id){
        hastaYatisService.deleteHastaYatis(id);
        return ResponseEntity.noContent().build();
    }

}
