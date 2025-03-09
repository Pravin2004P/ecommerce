package com.pravin.ecommerce.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.pravin.ecommerce.Entities.Catagory;
import com.pravin.ecommerce.Repository.CatagoryRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CatagoryService {

    private final CatagoryRepository catagoryRepository;

    public List <Catagory> getAllCatagories () {
        return catagoryRepository.findAll();
    }
}
