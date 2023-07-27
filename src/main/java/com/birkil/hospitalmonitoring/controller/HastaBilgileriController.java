package com.birkil.hospitalmonitoring.controller;

import com.birkil.hospitalmonitoring.entity.HastaBilgileri;
import com.birkil.hospitalmonitoring.service.HastaBilgileriService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
@RequestMapping("/hasta")
public class HastaBilgileriController {

    private final HastaBilgileriService hastaBilgileriService;

    @Autowired
    public HastaBilgileriController(HastaBilgileriService hastaBilgileriService) {
        this.hastaBilgileriService = hastaBilgileriService;
    }

    @GetMapping("/")
    public String home(){
        return "home";
    }

    @GetMapping("/all")
    public String getAllHasta(Model model){
        List<HastaBilgileri> hastaList = hastaBilgileriService.getAllHasta();
        model.addAttribute("hastaList", hastaList);
        return "patients";
    }

    @GetMapping("/{id}")
    public String getHastaById(@PathVariable("id") Long id, Model model){
        HastaBilgileri hastaBilgileri = hastaBilgileriService.getHastaById(id);
        model.addAttribute("hasta", hastaBilgileri);
        return "patientId";
    }

    @GetMapping("/create")
    public String createPatientForm(Model model){
        HastaBilgileri hastaBilgileri = new HastaBilgileri();
        model.addAttribute("patient", hastaBilgileri);
        return "create_hasta";
    }

    /*@PostMapping("/create")
    public String createHasta(@ModelAttribute HastaBilgileri hastaBilgileri){
        hastaBilgileriService.createHasta(hastaBilgileri);
        return "redirect:/hasta/all";
    }*/

    @PostMapping("/create")
    public ResponseEntity<String> createHasta(@RequestBody HastaBilgileri hastaBilgileri){
        hastaBilgileriService.createHasta(hastaBilgileri);
        return ResponseEntity.ok("Hasta başarıyla kaydedildi.");
    }

    @GetMapping("/update/{id}")
    public String getUpdateForm(@PathVariable("id") Long id, Model model){
        HastaBilgileri hastaBilgileri = hastaBilgileriService.getHastaById(id);
        model.addAttribute("hasta", hastaBilgileri);
        return "patient_update";
    }

    @PostMapping("update/{id}")
    public String updateHasta(@PathVariable("id") Long id, @ModelAttribute HastaBilgileri hastaBilgileri){
        HastaBilgileri updateHasta = hastaBilgileriService.updateHasta(id, hastaBilgileri);
        if(updateHasta != null){
            return "redirect:/hasta/" + id;
        }else {
            return "redirect:/hasta/all";
        }
    }
    @GetMapping("/delete/{id}")
    public String deleteHasta(@PathVariable("id") Long id){
        boolean result = hastaBilgileriService.deleteHasta(id);
        return "redirect:/hasta/all";
    }

}
