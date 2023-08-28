package com.birkil.hospitalmonitoring.repository;

import com.birkil.hospitalmonitoring.entity.DoktorBilgisi;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoktorBilgisiRepository extends JpaRepository<DoktorBilgisi, Long> {
}
