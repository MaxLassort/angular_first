/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maxime.springdistrib.controller;

import com.maxime.springdistrib.form.BuyForm;
import com.maxime.springdistrib.form.UserForm;
import com.maxime.springdistrib.model.Product;
import com.maxime.springdistrib.repository.IUserService;
import com.maxime.springdistrib.service.IProductService;
import com.maxime.springdistrib.service.ProductService;
import com.maxime.springdistrib.service.UserService;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author maxla
 */
@Controller
public class DistributeurController {

    private IUserService userService;
    private IProductService productService;

    public DistributeurController(IUserService userService, IProductService productService) {
        this.userService = userService;
        this.productService = productService;
    }

    @RequestMapping(value = "/distributeur", method = RequestMethod.GET)
    public String showDistribPage(ModelMap model) {
        model.addAttribute("buyForm", new BuyForm());
        model.addAttribute("list", productService.findAll());
        model.addAttribute("userform", new UserForm());
        model.addAttribute("balance", userService.getBalance());
        model.addAttribute("list", productService.findAll());

        return "distributeur";
    }

    @RequestMapping(value = "/distributeur", method = RequestMethod.POST)
    public String addCredit(@ModelAttribute("userform") @Valid UserForm userForm, BindingResult bindingResult, ModelMap model) {

        if (bindingResult.hasErrors())
        {
            model.addAttribute("buyForm", new BuyForm());
            model.addAttribute("list", productService.findAll());
            model.addAttribute("balance", userService.getBalance());
            return "distributeur";
        } else
        {
            Double getFromForm = userForm.getBalance();
            userService.addBalance(getFromForm);
            return "redirect:distributeur";
        }

    }

    @RequestMapping(value = "/buy", method = RequestMethod.POST)
    public String buyProduct(@ModelAttribute("buyForm") @Valid BuyForm buyForm, ModelMap model, BindingResult bindingResult) {

            long idProduct = buyForm.getId();
            Optional<Product> toBuy = productService.findById(idProduct);
            model.addAttribute("userform", new UserForm());
// bindingResult.rejectValue(field, null, "hello from the hell");
            if (toBuy.isPresent())
            {
                Product prod = toBuy.get();
                if (userService.getBalance() < prod.getPrice())
                {
                   bindingResult.rejectValue("id", null, "hello from the hell");
                    return "distributeur";
                }

                prod.setQuantity(prod.getQuantity() - 1);
                productService.create(prod);
                userService.decreaseBalance(prod.getPrice());

            }
            return "redirect:distributeur";
        

//        userService.decreaseBalance(toBuy.);
  
    }
}
