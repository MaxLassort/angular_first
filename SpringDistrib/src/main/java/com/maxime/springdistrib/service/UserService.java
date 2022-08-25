/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maxime.springdistrib.service;

import org.springframework.stereotype.Service;
import com.maxime.springdistrib.repository.IUserService;

/**
 *
 * @author maxla
 */
@Service
public class UserService implements IUserService{

    private Double balance;

    public UserService() {
        this.balance = 0.0;
    }
    
    @Override
    public Double getBalance() {
        return this.balance;
    }

    @Override
    public void setBalance(Double balance) {
        this.balance = balance;
    }

    @Override
    public void addBalance(Double toAdd) {
        this.balance += toAdd;
    }

    @Override
    public void decreaseBalance(Double decreaseBalance) {
        this.balance -= decreaseBalance;
    }
    
}
