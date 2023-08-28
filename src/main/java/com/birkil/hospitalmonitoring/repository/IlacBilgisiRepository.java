package com.birkil.hospitalmonitoring.repository;

import com.birkil.hospitalmonitoring.entity.IlacBilgisi;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IlacBilgisiRepository extends JpaRepository<IlacBilgisi, Long> {
}
