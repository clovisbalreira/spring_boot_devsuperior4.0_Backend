package com.clovis.dsvendas.repository;

import com.clovis.dsvendas.dto.SalesSuccessDTO;
import com.clovis.dsvendas.dto.SalesSumDTO;
import com.clovis.dsvendas.entities.Sale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SalesRepository extends JpaRepository<Sale, Long> {

    @Query("SELECT new com.clovis.dsvendas.dto.SalesSumDTO(obj.seller, SUM(obj.amount)) From Sale AS obj GROUP BY obj.seller")
    List<SalesSumDTO> amountGroupedBySellers();

    @Query("SELECT new com.clovis.dsvendas.dto.SalesSuccessDTO(obj.seller, SUM(obj.visited), SUM(obj.deals)) From Sale AS obj GROUP BY obj.seller")
    List<SalesSuccessDTO> sucessGroupedBySellers();
}
