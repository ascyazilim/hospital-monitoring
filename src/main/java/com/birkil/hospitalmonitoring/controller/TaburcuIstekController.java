package com.birkil.hospitalmonitoring.controller;

import com.birkil.hospitalmonitoring.entity.TaburcuIstek;
import com.birkil.hospitalmonitoring.service.TaburcuIstekService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/taburcu-istek")
public class TaburcuIstekController {

    private final TaburcuIstekService taburcuIstekService;

    public TaburcuIstekController(TaburcuIstekService taburcuIstekService) {
        this.taburcuIstekService = taburcuIstekService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<TaburcuIstek>> getAllTaburcuIstek() {
        List<TaburcuIstek> taburcuIstekList = taburcuIstekService.getAllTaburcuIstek();
        return ResponseEntity.ok(taburcuIstekList);
    }

    @GetMapping("/{id}")
    public ResponseEntity<TaburcuIstek> getTaburcuIstekById(@PathVariable Long id) {
        TaburcuIstek taburcuIstek = taburcuIstekService.getTaburcuIstekById(id);
        return ResponseEntity.ok(taburcuIstek);
    }

    @PostMapping("/create")
    public ResponseEntity<TaburcuIstek> createTaburcuIstek(@RequestBody TaburcuIstek taburcuIstek) {
        TaburcuIstek createdTaburcuIstek = taburcuIstekService.createTaburcuIstek(taburcuIstek);
        return ResponseEntity.ok(createdTaburcuIstek);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<TaburcuIstek> updateTaburcuIstek(@PathVariable Long id, @RequestBody TaburcuIstek taburcuIstek){
        TaburcuIstek updatedTaburcuIstek = taburcuIstekService.updateTaburcuIstek(id, taburcuIstek);
        return ResponseEntity.ok(updatedTaburcuIstek);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteTaburcuIstek(@PathVariable Long id) {
        taburcuIstekService.deleteTaburcuIstek(id);
        return ResponseEntity.noContent().build();
    }
}
