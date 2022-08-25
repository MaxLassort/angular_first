/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.maxime.springdistrib.service;

import com.maxime.springdistrib.model.Product;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author maxla
 */
public interface IProductService {
    public List<Product> findAll();
    public Optional<Product> findById(long id);
    public void create(Product prod);
}
