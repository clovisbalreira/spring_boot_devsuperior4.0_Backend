package com.clovis.dsvendas.service;

import com.clovis.dsvendas.dto.SalesDTO;
import com.clovis.dsvendas.dto.SalesSuccessDTO;
import com.clovis.dsvendas.dto.SalesSumDTO;
import com.clovis.dsvendas.entities.Sale;
import com.clovis.dsvendas.repository.SalesRepository;
import com.clovis.dsvendas.repository.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class SaleService {

    @Autowired
    private SalesRepository repository;

    @Autowired
    private SellerRepository sellerRepository;

    @Transactional(readOnly = true)
    public Page<SalesDTO> findAll(Pageable pageable){
        sellerRepository.findAll();
        Page<Sale> result = repository.findAll(pageable);
        return result.map(x -> new SalesDTO(x));
    }

    @Transactional(readOnly = true)
    public List<SalesSumDTO> amountGroupedBySellers(){
        return repository.amountGroupedBySellers();
    }

    @Transactional(readOnly = true)
    public List<SalesSuccessDTO> sucessGroupedBySellers(){
        return repository.sucessGroupedBySellers();
    }
}
