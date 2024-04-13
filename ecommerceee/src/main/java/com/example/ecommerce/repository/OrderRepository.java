package com.example.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
// import org.springframework.data.jpa.repository.Query;
// import org.springframework.data.repository.query.Param;

import com.example.ecommerce.model.Orders;

import java.util.List;

public interface OrderRepository extends JpaRepository<Orders, Long> {

    List<Orders> findOrdersByUserId(Long userId);

    // @Query("SELECT o FROM Orders o WHERE o.user.id = :userId")
    // List<Orders> findOrdersByUserIdUsingQuery(@Param("userId") Long userId);

    // @Query("SELECT o FROM Orders o WHERE o.id = :id")
    // Orders findOrderByIdUsingQuery(@Param("id") Long id);

}
