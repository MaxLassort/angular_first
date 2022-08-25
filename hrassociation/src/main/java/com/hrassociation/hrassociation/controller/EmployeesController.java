package com.hrassociation.hrassociation.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hrassociation.hrassociation.service.EmployeesService;
import com.hrassociation.hrassociation.model.*;

@RestController
public class EmployeesController {
    
EmployeesService employeesService;


public EmployeesController(EmployeesService employeesService) {
    this.employeesService = employeesService;
}

@GetMapping("/employees")
public List<Employees> findAll(){
    return employeesService.findAll();
}

}
