/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maxime.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author maxla
 */
@Controller
public class Maincontroller {
    @GetMapping("/")
    public String root(){
        return "index";
    }
    
    @GetMapping("/login")
    public String login(Model lodel){
        return "login";
    }
}
