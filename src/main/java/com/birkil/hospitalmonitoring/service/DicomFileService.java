package com.birkil.hospitalmonitoring.service;

import com.birkil.hospitalmonitoring.entity.DicomFile;
import com.birkil.hospitalmonitoring.repository.DicomFileRepository;
import org.springdoc.api.OpenApiResourceNotFoundException;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class DicomFileService {

    private final DicomFileRepository dicomFileRepository;

    public DicomFileService(DicomFileRepository dicomFileRepository) {
        this.dicomFileRepository = dicomFileRepository;
    }

    public byte[] getDicomFileData(Long id) {
        DicomFile dicomFile = dicomFileRepository.findById(id)
                .orElseThrow(() -> new OpenApiResourceNotFoundException("Dicom dosyası bulunamadı"));
        return dicomFile.getData();
    }
}
