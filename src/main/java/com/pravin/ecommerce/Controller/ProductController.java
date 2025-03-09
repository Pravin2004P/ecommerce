package com.pravin.ecommerce.Controller;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.pravin.ecommerce.Entities.Product;
import com.pravin.ecommerce.Service.ProductService;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/products")
@AllArgsConstructor
public class ProductController {
    
    private final ProductService productService;

    @GetMapping
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @GetMapping("/category/{categoryId}")
    public List<Product> getProductByCategory(@PathVariable Long categoryId) {
        return productService.getProductByCategory(categoryId);
    }
}