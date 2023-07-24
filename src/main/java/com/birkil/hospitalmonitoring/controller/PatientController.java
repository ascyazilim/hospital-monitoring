package com.birkil.hospitalmonitoring.controller;



import com.birkil.hospitalmonitoring.entity.HastaBilgileri;
import com.birkil.hospitalmonitoring.service.HastaBilgileriService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class PatientController {

    private HastaBilgileriService patientService;

    public PatientController(HastaBilgileriService patientService){
        super();
        this.patientService = patientService;
    }

    @GetMapping("/patients")
    public String listPatient(Model model){
        //model.addAttribute("patients", patientService.getAllPatients());
        return "patients";
    }

    @GetMapping("/patients/new")
    public String createPatientForm(Model model){
        HastaBilgileri patient = new HastaBilgileri();
        model.addAttribute("patient",patient);
        return "create_patient";
    }

    @PostMapping("/patients")
    public String savePatient(@ModelAttribute("patient") HastaBilgileri patient){
        //patientService.savePatient(patient);
        return "redirect:/patient";
    }

    @GetMapping("/patients/edit/{id}")
    public String editStudentForm(@PathVariable Long id, Model model){
        //model.addAttribute("patient", patientService.getPatientById(id));
        return "edit_patient";
    }




}
