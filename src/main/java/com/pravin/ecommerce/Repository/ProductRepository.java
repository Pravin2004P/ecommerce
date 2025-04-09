package com.pravin.ecommerce.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.pravin.ecommerce.Entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
