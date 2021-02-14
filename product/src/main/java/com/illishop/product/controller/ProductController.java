package com.illishop.product.controller;

import com.illishop.product.model.Product;
import com.illishop.product.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.List;

@RestController
@Slf4j
public class ProductController {

    private final ProductService service;

    public ProductController(ProductService service) {
        this.service = service;
    }

    @GetMapping("/products")
    public List<Product> getAllOrders() {
        return service.getAllProducts();
    }


    @PostConstruct
    public void populateProductData() {
        service.deletePopulatedData();
        log.info("starting saving products");
//        service.populateProducts();
//        log.info("Saving Products finished with success");
    }


    @PostMapping("/searchByCriteria")
    public List<Product> searchByCriteria(@RequestBody CriteriaFilter criteria) {
        return service.searchByCriteria(criteria);
    }


    @PostConstruct
    public void initEsData(){
        service.initEsData();
    }
}
