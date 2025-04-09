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

  public Product getProductById(Long id) {
    return productRepository.findById(id).orElseThrow(() -> new RuntimeException("Product not found"));
  }

  public List<Product> addAll(List<Product> products) {
    return productRepository.saveAll(products);
  }

  public Product createProduct(Product product) {
    return productRepository.save(product);
  }

  public Product updateProduct(Long id, Product updatedProduct) {
    Product existingProduct = getProductById(id);
    existingProduct.setName(updatedProduct.getName());
    existingProduct.setDescription(updatedProduct.getDescription());
    existingProduct.setImageUrl(updatedProduct.getImageUrl());
    existingProduct.setPrice(updatedProduct.getPrice());
    return productRepository.save(existingProduct);
  }

  public void deleteProduct(Long id) {
    productRepository.deleteById(id);
  }
}