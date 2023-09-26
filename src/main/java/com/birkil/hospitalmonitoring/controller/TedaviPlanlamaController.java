package com.birkil.hospitalmonitoring.controller;

import com.birkil.hospitalmonitoring.entity.TedaviPlanlama;
import com.birkil.hospitalmonitoring.service.TedaviPlanlamaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tedavi-planlama")
public class TedaviPlanlamaController {

    private final TedaviPlanlamaService tedaviPlanlamaService;

    public TedaviPlanlamaController(TedaviPlanlamaService tedaviPlanlamaService) {
        this.tedaviPlanlamaService = tedaviPlanlamaService;
    }

    @GetMapping
    public ResponseEntity<List<TedaviPlanlama>> getAllTedaviPlanlama(){
        List<TedaviPlanlama> tedaviPlanlamaList = tedaviPlanlamaService.getAllTedaviPlanlama();
        return ResponseEntity.ok(tedaviPlanlamaList);
    }

    @GetMapping("/{id}")
    public ResponseEntity<TedaviPlanlama> getTedaviPlanlamaById(@PathVariable Long id){
        TedaviPlanlama tedaviPlanlama = tedaviPlanlamaService.getTedaviPlanlamaById(id);
        return ResponseEntity.ok(tedaviPlanlama);
    }

    @PostMapping("/create")
    public ResponseEntity<TedaviPlanlama> createTedaviPlanlama(@RequestBody TedaviPlanlama tedaviPlanlama){
        TedaviPlanlama createdTedaviPlanlama = tedaviPlanlamaService.createTedaviPlanlama(tedaviPlanlama);
        return ResponseEntity.ok(createdTedaviPlanlama);
    }

    @PutMapping("/{id}")
    public ResponseEntity<TedaviPlanlama> updateTedaviPlanlama(@PathVariable Long id, @RequestBody TedaviPlanlama tedaviPlanlama){
        TedaviPlanlama updatedTedaviPlanlama = tedaviPlanlamaService.updateTedaviPlanlama(id, tedaviPlanlama);
        return ResponseEntity.ok(updatedTedaviPlanlama);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteTedaviPlanlama(@PathVariable Long id){
        tedaviPlanlamaService.deleteTedaviPlanlama(id);
        return ResponseEntity.noContent().build();
    }
}
