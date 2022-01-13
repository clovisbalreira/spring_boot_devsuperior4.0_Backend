package com.clovis.dsvendas.dto;

import com.clovis.dsvendas.entities.Sellers;

import java.io.Serializable;

public class SellersDTO implements Serializable {

    private static final long serialVersionUID = 1L;
    private Long id;
    private String name;

    public SellersDTO() {
    }

    public SellersDTO(Long id, String name) {
        this.id = id;
        this.name = name;
    }
    public SellersDTO(Sellers entity) {
        this.id = entity.getId();
        this.name = entity.getName();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
