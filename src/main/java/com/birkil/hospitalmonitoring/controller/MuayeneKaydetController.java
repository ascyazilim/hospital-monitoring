package com.birkil.hospitalmonitoring.controller;

import com.birkil.hospitalmonitoring.entity.MuayeneKaydet;
import com.birkil.hospitalmonitoring.entity.TaniList;
import com.birkil.hospitalmonitoring.service.MuayeneKaydetService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/muayene-kaydet")
public class MuayeneKaydetController {

    private final MuayeneKaydetService muayeneKaydetService;

    public MuayeneKaydetController(MuayeneKaydetService muayeneKaydetService) {
        this.muayeneKaydetService = muayeneKaydetService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<MuayeneKaydet>> getAllMuayeneKaydet(){
        List<MuayeneKaydet> muayeneKaydetList = muayeneKaydetService.getAllMuayeneKaydet();
        return ResponseEntity.ok(muayeneKaydetList);
    }

    @GetMapping("/{id}")
    public ResponseEntity<MuayeneKaydet> getMuayeneKaydetById(@PathVariable Long id){
        MuayeneKaydet muayeneKaydet = muayeneKaydetService.getMuayeneKaydetById(id);
        return ResponseEntity.ok(muayeneKaydet);
    }

    @PostMapping("/create")
    public ResponseEntity<MuayeneKaydet> createMuayeneKaydet(@RequestBody MuayeneKaydet muayeneKaydet){
        MuayeneKaydet createdMuayeneKaydet = muayeneKaydetService.createMuayeneKaydet(muayeneKaydet);
        return ResponseEntity.ok(createdMuayeneKaydet);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<MuayeneKaydet> updateMuayeneKaydet(@PathVariable Long id, @RequestBody MuayeneKaydet muayeneKaydet){
        MuayeneKaydet updatedMuayeneKaydet = muayeneKaydetService.updateMuayeneKaydet(id, muayeneKaydet);
        return ResponseEntity.ok(updatedMuayeneKaydet);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteMuayeneKaydet(@PathVariable Long id){
        muayeneKaydetService.deleteMuayeneKaydet(id);
        return ResponseEntity.noContent().build();
    }
}
