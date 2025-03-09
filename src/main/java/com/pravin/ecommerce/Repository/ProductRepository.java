package com.pravin.ecommerce.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pravin.ecommerce.Entities.Product;

public interface ProductRepository extends JpaRepository <Product,Long>{
    List<Product> findByCatagoryId(Long catagoryId);
    
}
