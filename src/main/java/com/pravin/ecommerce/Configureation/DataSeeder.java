package com.pravin.ecommerce.Configureation;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.pravin.ecommerce.Entities.Catagory;
import com.pravin.ecommerce.Entities.Product;
import com.pravin.ecommerce.Repository.CatagoryRepository;
import com.pravin.ecommerce.Repository.ProductRepository;

@Component
public class DataSeeder implements CommandLineRunner {

    private final ProductRepository productRepository;
    private final CatagoryRepository categoryRepository;

    

    public DataSeeder(ProductRepository productRepository, CatagoryRepository categoryRepository) {
        this.productRepository = productRepository;
        this.categoryRepository = categoryRepository;
    }



    @Override
    public void run(String... args) throws Exception {
        // Clear all data
        categoryRepository.deleteAll();
        productRepository.deleteAll();

        // Category creation
        Catagory electronics = new Catagory();
        electronics.setName("Electronics");
        

        Catagory clothing = new Catagory();
        clothing.setName("Clothing");

        Catagory home = new Catagory();
        home.setName("Home");

        categoryRepository.saveAll(Arrays.asList(electronics, clothing, home));

        // Product creation
        Product phone = new Product();
        phone.setName("Smartphone");
        phone.setDescription("Latest model smartphone with advanced features");
        phone.setImageUrl("http://example.com/phone.jpg");
        phone.setPrice(699.99);
        phone.setCatagory(home);; // Corrected method name

        Product laptop = new Product();
        laptop.setName("Laptop");
        laptop.setDescription("High performance laptop for gaming and work");
        laptop.setImageUrl("http://example.com/laptop.jpg");
        laptop.setPrice(999.99);
        laptop.setCatagory(electronics); // Corrected method name

        Product jacket = new Product();
        jacket.setName("Jacket");
        jacket.setDescription("Warm and stylish jacket for winter");
        jacket.setImageUrl("http://example.com/jacket.jpg?width=600&height=400");
        jacket.setPrice(79.99);
        jacket.setCatagory(clothing); // Corrected method name

        Product blender = new Product();
        blender.setName("Blender");
        blender.setDescription("Powerful blender for smoothies and more");
        blender.setImageUrl("https://via.placeholder.com/600x400");
        blender.setPrice(49.99);
        blender.setCatagory(home); // Corrected method name

        productRepository.saveAll(Arrays.asList(phone, laptop, jacket, blender));
    }
}