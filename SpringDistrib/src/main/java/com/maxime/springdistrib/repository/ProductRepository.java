/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maxime.springdistrib.repository;

import com.maxime.springdistrib.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author maxla
 */

public interface ProductRepository extends JpaRepository<Product, Long> {
    
}
