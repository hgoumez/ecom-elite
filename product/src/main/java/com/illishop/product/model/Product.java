package com.illishop.product.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Product {
    @Id
    private Long id;
    private Long price;
    private String name;
    private String description;
}