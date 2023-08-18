package com.birkil.hospitalmonitoring.repository;

import com.birkil.hospitalmonitoring.entity.DoktorList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoktorListRepository extends JpaRepository<DoktorList, Long> {
}
