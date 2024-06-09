package com.yasar.marathon_3.repository;

import com.yasar.marathon_3.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
