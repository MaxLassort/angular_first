package com.hrassociation.hrassociation.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.hrassociation.hrassociation.model.Employees;
import com.hrassociation.hrassociation.repository.employeesRepository;

import lombok.Data;

@Service
@Data
public class EmployeesService implements IEmployeesService {
    
    private employeesRepository employeesRepo;


    public EmployeesService(employeesRepository employeesRepo) {
        this.employeesRepo = employeesRepo;
    }


    @Override
    public Employees findById(Long id) {
        return employeesRepo.findById(id).orElse(null);

    }


    @Override
    public List<Employees> findAll() {
        
        return employeesRepo.findAll();
    }


    @Override
    public void delete(Long id) {
        employeesRepo.deleteById(id);
        
    }


    @Override
    public void save(Employees employee) {
        employeesRepo.save(employee);
        
    }
    
    
    
    
    
}
