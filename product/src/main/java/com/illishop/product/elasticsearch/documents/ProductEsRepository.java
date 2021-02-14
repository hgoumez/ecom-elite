package com.illishop.product.elasticsearch.documents;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface ProductEsRepository extends ElasticsearchRepository<ProductIndex, Long> {
}
