package com.birkil.hospitalmonitoring.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "dicom_file")
public class DicomFile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Lob
    @Column(name = "data")
    private byte[] data;

    @Column(name = "file_name")
    private String fileName;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

}
