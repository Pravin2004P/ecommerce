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
        productRepository.deleteAllInBatch();
        categoryRepository.deleteAllInBatch();

        // Category creation
        Catagory electronics = new Catagory();
        electronics.setName("Electronics");

        Catagory clothing = new Catagory();
        clothing.setName("Clothing");

        Catagory home = new Catagory();
        home.setName("Home");

        Catagory books = new Catagory();
        books.setName("Books");

        categoryRepository.saveAll(Arrays.asList(electronics, clothing, home, books));

        // Product creation
        Product phone = new Product();
        phone.setName("Smartphone");
        phone.setDescription("Latest model smartphone with advanced features");
        phone.setImageUrl("http://example.com/phone.jpg");
        phone.setPrice(699.99);
        phone.setCategory(electronics); // Ensure category is set

        Product laptop = new Product();
        laptop.setName("Laptop");
        laptop.setDescription("High performance laptop for gaming and work");
        laptop.setImageUrl("http://example.com/laptop.jpg");
        laptop.setPrice(999.99);
        laptop.setCategory(electronics); // Ensure category is set

        Product jacket = new Product();
        jacket.setName("Jacket");
        jacket.setDescription("Warm and stylish jacket for winter");
        jacket.setImageUrl("http://example.com/jacket.jpg?width=600&height=400");
        jacket.setPrice(79.99);
        jacket.setCategory(clothing); // Ensure category is set

        Product blender = new Product();
        blender.setName("Blender");
        blender.setDescription("Powerful blender for smoothies and more");
        blender.setImageUrl("https://via.placeholder.com/600x400");
        blender.setPrice(49.99);
        blender.setCategory(home); // Ensure category is set

        Product book = new Product();
        book.setName("The Lord of the Rings");
        book.setDescription("An epic high-fantasy novel by J. R. R. Tolkien");
        book.setImageUrl("https://via.placeholder.com/600x400");
        book.setPrice(19.99);
        book.setCategory(books); // Ensure category is set

        Product tShirt = new Product();
        tShirt.setName("T-Shirt");
        tShirt.setDescription("A comfortable cotton t-shirt");
        tShirt.setImageUrl("https://via.placeholder.com/600x400");
        tShirt.setPrice(15.99);
        tShirt.setCategory(clothing); // Ensure category is set

        productRepository.saveAll(Arrays.asList(phone, laptop, jacket, blender, book, tShirt));
    }
}