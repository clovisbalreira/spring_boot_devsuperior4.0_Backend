package com.clovis.dsvendas.service;

import com.clovis.dsvendas.dto.SellersDTO;
import com.clovis.dsvendas.entities.Sellers;
import com.clovis.dsvendas.repository.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SellerService {

    @Autowired
    private SellerRepository repository;

    public List<SellersDTO> findAll(){
        List<Sellers> result = repository.findAll();
        return result.stream().map(x -> new SellersDTO(x)).collect(Collectors.toList());
    }
}
