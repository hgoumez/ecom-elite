package com.illishop.product.service;

import com.google.common.collect.Lists;
import com.illishop.product.controller.CriteriaFilter;
import com.illishop.product.elasticsearch.documents.ProductEsRepository;
import com.illishop.product.elasticsearch.documents.ProductIndex;
import com.illishop.product.model.Product;
import com.illishop.product.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ProductService {

    private final ProductRepository repository;
    private final ProductEsRepository esRepository;

    public ProductService(ProductRepository repository, ProductEsRepository esRepository) {
        this.repository = repository;
        this.esRepository = esRepository;
    }

    public List<Product> getAllProducts() {
        return repository.findAll();
    }

    public void populateProducts() {
        List products = Lists.newArrayList();
        for (int i = 0; i < 100000; i++) {

            int randomPrice = (int) (Math.random() * 100000);
            String randomName = UUID.randomUUID().toString();
            String randomDesciption = UUID.randomUUID().toString();
            Product product = Product.builder()
                    .id((long) i + 4)
                    .name(randomName)
                    .price((long) randomPrice)
                    .description(randomDesciption)
                    .build();
            products.add(product);
        }

        repository.saveAll(products);
    }

    public void deletePopulatedData() {
        repository.deleteAllCreateadData();
    }

    public List<Product> searchByCriteria(CriteriaFilter criteria) {
        return repository.searchByCriteria(criteria.getMinPrice(), criteria.getMaxPrice(), criteria.getDescriptionContains(),
                criteria.getNameContains(), criteria.getMinId(), criteria.getMaxId());
    }

    public void initEsData() {

        ProductIndex product = ProductIndex.builder()
                .id(1L)
                .description("description test")
                .name("name es")
                .price(23L)
                .build();

        esRepository.save(product);
    }
}
