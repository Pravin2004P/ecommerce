package com.pravin.ecommerce.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pravin.ecommerce.Entities.Catagory;
import com.pravin.ecommerce.Service.CatagoryService;

import lombok.AllArgsConstructor;

import org.springframework.web.bind.annotation.GetMapping;


@AllArgsConstructor
@RestController
@RequestMapping("/api/catagories")
public class CatagoryController {

    private final CatagoryService catagoryService;

    // Endpoint to get all categories
    @GetMapping
    public List<Catagory> getallCatagories() {
        return catagoryService.getAllCatagories();
    }
}