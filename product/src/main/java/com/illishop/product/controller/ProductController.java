package com.illishop.product.controller;

import com.illishop.product.model.Product;
import com.illishop.product.model.ProductWithHostName;
import com.illishop.product.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.List;

@RestController
@Slf4j
public class ProductController {

    @Value("${version}")
    String version;

    private final ProductService service;

    public ProductController(ProductService service) {
        this.service = service;
    }

    @GetMapping("/products")
    public ProductWithHostName getAllOrders() {
        log.info("retrieve all products from database");
        List<Product> products = service.getAllProducts();
        return ProductWithHostName.builder()
                .productList(products)
                .hostName(System.getenv("HOSTNAME"))
                .build();
    }


    @PostConstruct
    public void populateProductData() {
        service.deletePopulatedData();
        log.info("starting saving products");
//        service.populateProducts();
//        log.info("Saving Products finished with success");
    }


    @GetMapping("version")
    public String getAppVersion() {
        return version;
    }


    @PostMapping("/searchByCriteria")
    public ProductWithHostName searchByCriteria(@RequestBody CriteriaFilter criteria) {
        List<Product> products = service.searchByCriteria(criteria);
        return ProductWithHostName.builder()
                .productList(products)
                .hostName(System.getenv("HOSTNAME"))
                .build();
    }


    @PostConstruct
    public void initEsData() {
        service.initEsData();
    }
}
