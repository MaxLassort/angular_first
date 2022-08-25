/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.maxime.springdistrib.repository;



/**
 *
 * @author maxla
 */
public interface IUserService {
    public Double getBalance();
    public void setBalance(Double balance);
    public void addBalance(Double toAdd);
    public void decreaseBalance(Double decreaseBalance);
}
