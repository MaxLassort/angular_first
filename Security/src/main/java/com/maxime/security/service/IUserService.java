/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.maxime.security.service;

import com.maxime.security.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;

/**
 *
 * @author maxla
 */
public interface IUserService extends UserDetailsService{
    
    User findbyEmail(String email);
    
    User save(User user);
    
    
    
}
