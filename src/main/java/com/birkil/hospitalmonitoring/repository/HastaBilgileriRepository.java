package com.birkil.hospitalmonitoring.repository;

import com.birkil.hospitalmonitoring.entity.HastaBilgileri;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface HastaBilgileriRepository extends JpaRepository<HastaBilgileri, Long> {

    /*List<HastaBilgileri> findByAdContainingIgnoreCase(String adi);*/
}
