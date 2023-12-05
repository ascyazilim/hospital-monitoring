package com.birkil.hospitalmonitoring.controller;

import com.birkil.hospitalmonitoring.service.DicomFileService;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dicom")
public class DicomFileController {

    private DicomFileService dicomFileService;

    public DicomFileController(DicomFileService dicomFileService) {
        this.dicomFileService = dicomFileService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<byte[]> getDicomFile(@PathVariable Long id) {
        byte[] data = dicomFileService.getDicomFileData(id);
        return ResponseEntity.ok()
                .contentType(MediaType.APPLICATION_OCTET_STREAM)
                .body(data);
    }
}
