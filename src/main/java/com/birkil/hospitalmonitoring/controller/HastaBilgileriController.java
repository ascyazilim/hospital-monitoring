package com.birkil.hospitalmonitoring.controller;

import com.birkil.hospitalmonitoring.entity.HastaBilgileri;
import com.birkil.hospitalmonitoring.service.HastaBilgileriService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hasta")
public class HastaBilgileriController {

    private final HastaBilgileriService hastaBilgileriService;

    public HastaBilgileriController(HastaBilgileriService hastaBilgileriService) {
        this.hastaBilgileriService = hastaBilgileriService;
    }

    @GetMapping("/all")
    public List<HastaBilgileri> getAllHasta() {
        return hastaBilgileriService.getAllHasta();
    }

    @GetMapping("/{id}")
    public ResponseEntity<HastaBilgileri> getHastaById(@PathVariable("id") Long id){
        return ResponseEntity.ok(hastaBilgileriService.getHastaById(id));
    }

    @PostMapping("/create")
    public HastaBilgileri createHasta(@RequestBody HastaBilgileri hastaBilgileri) {
        return hastaBilgileriService.createHasta(hastaBilgileri);
    }

    @PutMapping("/update")
    public HastaBilgileri updateHasta(@RequestBody HastaBilgileri hastaBilgileri) {
        return hastaBilgileriService.updateHasta(hastaBilgileri);
    }

    @DeleteMapping("/{id}")
    public void deleteHasta(@PathVariable Long id) {
        hastaBilgileriService.deleteHasta(id);
    }


}
