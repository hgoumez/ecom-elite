package com.illishop.product.controller;


import lombok.Data;

@Data
public class CriteriaFilter {
    
    
    private Long minPrice;
    private Long maxPrice;
    private String descriptionContains;
    private String nameContains;
    private Long minId;
    private Long maxId;
}
