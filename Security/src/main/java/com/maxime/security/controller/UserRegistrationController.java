/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maxime.security.controller;

import com.maxime.security.model.User;
import com.maxime.security.service.IUserService;
import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/register")
public class UserRegistrationController {
    private IUserService userService;

    public UserRegistrationController(IUserService userService) {
        this.userService = userService;
    }
    
    @GetMapping
    public String showRegistrationForm(Model model){
        return "register";
    }
    
    @ModelAttribute("user")
    public User userAttribute(){
        return new User();
    }
    

    @PostMapping
    public String registerUserAccount(@ModelAttribute("user") @Valid User user, BindingResult result){
        
        User existing = userService.findbyEmail(user.getEmail());
        if(existing != null){
            result.rejectValue("email", null, "There is already an account registered with that email");
        }
        
        if(result.hasErrors()){
            return "register";
        }
        userService.save(user);
        return "redirect:/register?succes=true";
               
    }
            
}
