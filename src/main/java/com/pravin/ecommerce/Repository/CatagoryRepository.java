package com.pravin.ecommerce.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pravin.ecommerce.Entities.Catagory;

@Repository
public interface CatagoryRepository extends JpaRepository <Catagory,Long>{

}
