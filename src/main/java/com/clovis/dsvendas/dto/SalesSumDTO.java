package com.clovis.dsvendas.dto;

import com.clovis.dsvendas.entities.Sellers;

import java.io.Serializable;

public class SalesSumDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    private String sellerName;
    private Double sum;

    public SalesSumDTO() {
    }

    public SalesSumDTO(Sellers sellers, Double sum) {
        this.sellerName = sellers.getName();
        this.sum = sum;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public Double getSum() {
        return sum;
    }

    public void setSum(Double sum) {
        this.sum = sum;
    }
}
