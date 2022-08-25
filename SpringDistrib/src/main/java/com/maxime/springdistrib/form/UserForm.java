/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maxime.springdistrib.form;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 *
 * @author maxla
 */

public class UserForm {
    @Min(1)
    @NotNull(message = "credit is required")
   private Double balance;

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public UserForm() {
    }
}
