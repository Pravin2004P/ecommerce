package com.pravin.ecommerce.Service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.pravin.ecommerce.Entities.Product;
import com.pravin.ecommerce.Repository.ProductRepository;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public List<Product> getProductByCategory(Long categoryId) {
        return productRepository.findByCategoryId(categoryId);
    }
}