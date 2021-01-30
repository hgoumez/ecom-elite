package com.illishop.order.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity(name = "orders")
public class Order {
    @Id
    private Long id;
    private Long productId;
    private Integer amount;
    private String customerFirstName;
    private String customerLastName;
}