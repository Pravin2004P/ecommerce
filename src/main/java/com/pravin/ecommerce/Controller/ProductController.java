package com.pravin.ecommerce.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;
import com.pravin.ecommerce.Entities.Product;
import com.pravin.ecommerce.Service.ProductService;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class ProductController {
  private final ProductService productService;

  @GetMapping
  public List<Product> getAllProducts() {
    return productService.getAllProducts();
  }

  @GetMapping("/{id}")
  public Product getProductById(@PathVariable Long id) {
    return productService.getProductById(id);
  }

  @PostMapping()
  public Product createProduct(@RequestBody Product product) {
    return productService.createProduct(product);
  }

  @PostMapping("/addlist")
  public List<Product> createList(@RequestBody List<Product> products) {
    return productService.addAll(products);

  }

  @PutMapping("/{id}")  public Product updateProduct(@PathVariable Long id, @RequestBody Product updatedProduct) {
    return productService.updateProduct(id, updatedProduct);
  }

  @DeleteMapping("/{id}")
  public void deleteProduct(@PathVariable Long id) {
    productService.deleteProduct(id);
  }
}