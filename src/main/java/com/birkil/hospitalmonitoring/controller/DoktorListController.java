package com.birkil.hospitalmonitoring.controller;

import com.birkil.hospitalmonitoring.entity.DoktorList;
import com.birkil.hospitalmonitoring.service.DoktorListService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/doktor-list")
public class DoktorListController {

    private final DoktorListService doktorListService;

    public DoktorListController(DoktorListService doktorListService) {
        this.doktorListService = doktorListService;
    }

    @GetMapping
    public ResponseEntity<List<DoktorList>> getAllDoktorList(){
        List<DoktorList> doktorListList = doktorListService.getAllDoktorList();
        return ResponseEntity.ok(doktorListList);
    }

    @GetMapping("/{id}")
    public ResponseEntity<DoktorList> getDoktorListById(@PathVariable Long id){
        DoktorList doktorList = doktorListService.getDoktorListById(id);
        return ResponseEntity.ok(doktorList);
    }

    @PostMapping("/create")
    public ResponseEntity<DoktorList> createDoktorList(@RequestBody DoktorList doktorList){
        DoktorList createdDoktorList = doktorListService.createDoktorList(doktorList);
        return ResponseEntity.ok(createdDoktorList);
    }

    @PutMapping("/{id}")
    public ResponseEntity<DoktorList> updateDoktorList(@PathVariable Long id, @RequestBody DoktorList doktorList){
        DoktorList updatedDoktorList = doktorListService.updateDoktorList(id, doktorList);
        return ResponseEntity.ok(updatedDoktorList);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteDoktorList(@PathVariable Long id){
        doktorListService.deleteDoktorList(id);
        return ResponseEntity.noContent().build();
    }
}
