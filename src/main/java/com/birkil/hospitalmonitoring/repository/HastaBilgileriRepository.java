package com.birkil.hospitalmonitoring.repository;

import com.birkil.hospitalmonitoring.entity.HastaBilgileri;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface HastaBilgileriRepository extends JpaRepository<HastaBilgileri, Long> {

    /*HastaBilgileri findByTcKimlikNo(String tcKimNo);*/

    /*List<HastaBilgileri> findByAdContainingIgnoreCase(String adi);*/
    //HastaBilgileri findByTcKimlikNo(String tcKimNo);
    @Query("SELECT h FROM HastaBilgileri h WHERE h.tcKimNo LIKE CONCAT('%',:query, '%' )")
    List<HastaBilgileri> searchHasta(String query);

}
