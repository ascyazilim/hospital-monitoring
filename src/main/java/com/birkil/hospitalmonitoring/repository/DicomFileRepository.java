package com.birkil.hospitalmonitoring.repository;

import com.birkil.hospitalmonitoring.entity.DicomFile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DicomFileRepository extends JpaRepository<DicomFile, Long> {
}
