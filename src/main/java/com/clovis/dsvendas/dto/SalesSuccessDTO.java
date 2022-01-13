package com.clovis.dsvendas.dto;

import com.clovis.dsvendas.entities.Sellers;

import java.io.Serializable;

public class SalesSuccessDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    private String sellerName;
    private Long visited;
    private Long deals;

    public SalesSuccessDTO() {
    }

    public SalesSuccessDTO(Sellers sellers, Long visited, Long deals) {
        sellerName = sellers.getName();
        this.visited = visited;
        this.deals = deals;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public Long getVisited() {
        return visited;
    }

    public void setVisited(Long visited) {
        this.visited = visited;
    }

    public Long getDeals() {
        return deals;
    }

    public void setDeals(Long deals) {
        this.deals = deals;
    }
}

