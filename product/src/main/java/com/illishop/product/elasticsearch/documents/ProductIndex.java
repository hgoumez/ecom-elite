package com.illishop.product.elasticsearch.documents;


import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Data
@Builder
@Document(indexName = "product-document")
public class ProductIndex {

    @Id
    private Long id;
    private Long price;
    private String description;
    private String name;
}
