package com.hrassociation.hrassociation.repository;

import com.hrassociation.hrassociation.model.Employees;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface employeesRepository extends JpaRepository<Employees, Long> {
    
    

}
