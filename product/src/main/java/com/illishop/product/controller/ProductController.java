package com.illishop.product.controller;

import com.illishop.product.model.Product;
import com.illishop.product.service.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    private final ProductService service;

    public ProductController(ProductService service) {
        this.service = service;
    }

    @GetMapping("/products")
    public List<Product> getAllOrders() {
        return service.getAllProducts();
    }
}
