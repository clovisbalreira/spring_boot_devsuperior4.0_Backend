package com.clovis.dsvendas.controllers;

import com.clovis.dsvendas.dto.SellersDTO;
import com.clovis.dsvendas.service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/sellers")
public class SellersControllers {

    @Autowired
    private SellerService sellerService;

    @GetMapping
    public ResponseEntity<List<SellersDTO>> findAll(){
        List<SellersDTO> list = sellerService.findAll();
        return ResponseEntity.ok(list);
    }
}
