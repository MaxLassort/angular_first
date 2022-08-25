package com.hrassociation.hrassociation.service;

import java.util.List;

import com.hrassociation.hrassociation.model.*;



public interface IEmployeesService {

    public Employees findById(Long id);

    public List<Employees> findAll();

    public void delete(Long id);

    public void save(Employees employee);

   
}
