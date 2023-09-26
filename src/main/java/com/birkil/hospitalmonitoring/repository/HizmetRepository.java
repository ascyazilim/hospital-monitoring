package com.birkil.hospitalmonitoring.repository;

import com.birkil.hospitalmonitoring.entity.Hizmet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HizmetRepository extends JpaRepository<Hizmet, Long> {
}
