package com.clovis.dsvendas.controllers;

import com.clovis.dsvendas.dto.SalesDTO;
import com.clovis.dsvendas.dto.SalesSuccessDTO;
import com.clovis.dsvendas.dto.SalesSumDTO;
import com.clovis.dsvendas.service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/sales")
public class SalesControllers {

    @Autowired
    private SaleService saleService;

    @GetMapping
    public ResponseEntity<Page<SalesDTO>> findAll(Pageable pageable){
        Page<SalesDTO> list = saleService.findAll(pageable);
        return ResponseEntity.ok(list);
    }

    @GetMapping(value = "/amount-by-seller")
    public ResponseEntity<List<SalesSumDTO>> amountGroupedBySellers(){
        List<SalesSumDTO> list = saleService.amountGroupedBySellers();
        return ResponseEntity.ok(list);
    }

    @GetMapping(value = "/success-by-seller")
    public ResponseEntity<List<SalesSuccessDTO>> sucessGroupedBySellers(){
        List<SalesSuccessDTO> list = saleService.sucessGroupedBySellers();
        return ResponseEntity.ok(list);
    }
}
