package com.birkil.hospitalmonitoring.controller;

import com.birkil.hospitalmonitoring.entity.IlacList;
import com.birkil.hospitalmonitoring.service.IlacListService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ilac-list")
public class IlacListController {

    private final IlacListService ilacListService;

    public IlacListController(IlacListService ilacListService) {
        this.ilacListService = ilacListService;
    }

    @GetMapping
    public ResponseEntity<List<IlacList>> getAllIlacList(){
        List<IlacList> ilacListList = ilacListService.getAllIlacList();
        return ResponseEntity.ok(ilacListList);
    }

    @GetMapping("/{id}")
    public ResponseEntity<IlacList> getIlacBilgisiById(@PathVariable Long id){
        IlacList ilacList = ilacListService.getIlacListById(id);
        return ResponseEntity.ok(ilacList);
    }

    @PostMapping("/create")
    public ResponseEntity<IlacList> createIlacList(@RequestBody IlacList ilacList){
        IlacList createdIlacList = ilacListService.createIlacList(ilacList);
        return ResponseEntity.ok(createdIlacList);
    }

    @PutMapping("/{id}")
    public ResponseEntity<IlacList> updateIlacList(@PathVariable Long id, @RequestBody IlacList ilacList){
        IlacList updatedIlacList = ilacListService.updateIlacList(id, ilacList);
        return ResponseEntity.ok(updatedIlacList);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteIlacList(@PathVariable Long id){
        ilacListService.deleteIlacList(id);
        return ResponseEntity.noContent().build();
    }
}
