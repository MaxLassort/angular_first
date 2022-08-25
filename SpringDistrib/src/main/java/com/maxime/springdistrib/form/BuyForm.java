/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maxime.springdistrib.form;

import javax.validation.constraints.NotNull;

/**
 *
 * @author maxla
 */
public class BuyForm {
     @NotNull(message = "choose a product")
    private Long id;

    public BuyForm() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
}
