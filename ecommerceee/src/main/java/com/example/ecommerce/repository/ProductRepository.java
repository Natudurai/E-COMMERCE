package com.example.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
// import org.springframework.data.jpa.repository.Query;

import com.example.ecommerce.model.Product;

// import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {

    // @Query("SELECT p FROM Product p")
    // List<Product> findAllProductsUsingQuery();

    // @Query("SELECT p FROM Product p WHERE p.id = :id")
    // Product findProductByIdUsingQuery(Long id);

}
