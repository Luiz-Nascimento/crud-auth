package com.stock.product.repository;

import com.stock.product.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

public interface UserRepository extends JpaRepository<User, Integer> {
    UserDetails findByUsername(String username);
}
