package com.birkil.hospitalmonitoring.repository;

import com.birkil.hospitalmonitoring.entity.HastaBilgileri;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<HastaBilgileri, Long> {

}
