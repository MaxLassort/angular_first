/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.m2i.spring.lesson.dao.impl;

import fr.m2i.spring.lesson.dao.AccountDao;
import fr.m2i.spring.lesson.model.Account;
import fr.m2i.spring.lesson.model.Gender;
import java.time.LocalDate;
import static java.time.temporal.TemporalQueries.localDate;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;

/**
 *
 * @author maxla
 */
@Component
public class FakeAccountDaoImpl implements AccountDao {

    @Override
    public List<Account> getAllAccounts() {
        
        List<Account> accounts = new ArrayList<>();
        
        accounts.add(new Account("Max", "Lassort", "aaa@gmail.com", LocalDate.now(), Gender.MALE));
        
        return accounts;
    }
    
}
