package com.clovis.dsvendas.repository;

import com.clovis.dsvendas.entities.Sellers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SellerRepository extends JpaRepository<Sellers, Long> {

}
