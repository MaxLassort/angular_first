/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.m2i.spring.lesson.dao;

import fr.m2i.spring.lesson.model.Account;
import java.util.List;

/**
 *
 * @author maxla
 */
public interface AccountDao {
    public List<Account> getAllAccounts();
}
