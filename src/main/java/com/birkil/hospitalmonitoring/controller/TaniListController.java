package com.birkil.hospitalmonitoring.controller;

import com.birkil.hospitalmonitoring.entity.TaniList;
import com.birkil.hospitalmonitoring.service.TaniListService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tani-list")
public class TaniListController {

    private final TaniListService taniListService;

    public TaniListController(TaniListService taniListService) {
        this.taniListService = taniListService;
    }

    @GetMapping
    public ResponseEntity<List<TaniList>> getAllTaniList(){
        List<TaniList> taniListList = taniListService.getAllTaniList();
        return ResponseEntity.ok(taniListList);
    }

    @GetMapping("/{id}")
    public ResponseEntity<TaniList> getTaniListById(@PathVariable Long id){
        TaniList taniList = taniListService.getTaniListById(id);
        return ResponseEntity.ok(taniList);
    }

    @PostMapping("/create")
    public ResponseEntity<TaniList> createTaniList(@RequestBody TaniList taniList){
        TaniList createdTaniList = taniListService.createTaniList(taniList);
        return ResponseEntity.ok(createdTaniList);
    }

    @PutMapping("/{id}")
    public ResponseEntity<TaniList> updateTaniList(@PathVariable Long id, @RequestBody TaniList taniList){
        TaniList updatedTaniList = taniListService.updateTaniList(id, taniList);
        return ResponseEntity.ok(updatedTaniList);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteTaniList(@PathVariable Long id){
        taniListService.deleteTaniList(id);
        return ResponseEntity.noContent().build();
    }
}
