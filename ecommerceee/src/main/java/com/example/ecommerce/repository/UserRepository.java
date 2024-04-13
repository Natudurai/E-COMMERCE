package com.example.ecommerce.repository;

// import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
// import org.springframework.data.jpa.repository.Query;

import com.example.ecommerce.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

    // @Query("SELECT u FROM User u")
    // List<User> findAllUsersUsingQuery();

    // @Query("SELECT u FROM User u WHERE u.id = :id")
    // User findUserByIdUsingQuery(Long id);

}
