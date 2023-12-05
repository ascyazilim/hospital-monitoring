package com.birkil.hospitalmonitoring.service;

import com.birkil.hospitalmonitoring.entity.DicomFile;
import com.birkil.hospitalmonitoring.repository.DicomFileRepository;
import org.springdoc.api.OpenApiResourceNotFoundException;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.time.LocalDateTime;

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

    public DicomFile saveDicomFile(MultipartFile file) throws IOException {
        DicomFile dicomFile = new DicomFile();
        dicomFile.setData(file.getBytes());
        dicomFile.setFileName(file.getOriginalFilename());
        dicomFile.setCreatedAt(LocalDateTime.now());

        return dicomFileRepository.save(dicomFile);
    }
}
