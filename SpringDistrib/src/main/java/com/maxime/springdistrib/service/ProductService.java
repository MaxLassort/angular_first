/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maxime.springdistrib.service;

import com.maxime.springdistrib.model.Product;
import com.maxime.springdistrib.repository.ProductRepository;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author maxla
 */
@Service
@Transactional
public class ProductService implements IProductService {
    
    private final ProductRepository productRepo;

    public ProductService(ProductRepository productRepo) {
        this.productRepo = productRepo;
        
        create(new Product( "coca", 2.0, 10));
        create(new Product("orange juice", 2.0, 10));
    }
      
    public List<Product> findAll(){
        return productRepo.findAll();
    }
    
    public Optional<Product> findById(long id){
        return productRepo.findById(id);
    }
    
    public void create(Product prod){
        productRepo.save(prod);
    }
    
//    public void buy(){
//    }
 
  
    
    
}
