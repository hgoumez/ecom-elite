package com.illishop.product.repository;

import com.illishop.product.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {


    @Query("delete from Product where id >= 4")
    @Modifying
    @Transactional
    void deleteAllCreateadData();



    @Query("select p from Product p where " +
            "(:minPrice is null  or p.price >= :minPrice) and " +
            "(:maxPrice is null or p.price <= :maxPrice) and " +
            "(:minId is null or p.id >= :minId) and " +
            "(:maxId is null or p.id <= :maxId) and " +
            "(:descriptionContains is null or p.description like :descriptionContains) and " +
            "(:nameContains is null or p.name like :nameContains)")
    List<Product> searchByCriteria(@Param("minPrice") Long minPrice,
                                   @Param("maxPrice") Long maxPrice,
                                   @Param("descriptionContains")String descriptionContains,
                                   @Param("nameContains") String nameContains,
                                   @Param("minId") Long minId,
                                   @Param("maxId") Long maxId);
}
