/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.m2i.spring.lesson.service;

import fr.m2i.spring.lesson.model.Employee;
import fr.m2i.spring.lesson.repository.EmployeeRepository;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.NoRollbackRuleAttribute;

/**
 *
 * @author maxla
 */
@Service
@Transactional
public class EmployeeService {
    private final EmployeeRepository employeeRepository;
    
    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository){
        this.employeeRepository = employeeRepository;
    }
    
    public List<Employee> findAll(){
        return employeeRepository.findAll();
    }
    
    public Employee findByFirstName(String firstName){
        return employeeRepository.findByFirstName(firstName);
    }
    public Employee findByLastName(String LastName){
        return employeeRepository.findByLastName(LastName);
    }
    
    public Optional<Employee> findById(long id){
        return employeeRepository.findById(id);
    }
      
//    public void create(Employee employee){
//        employeeRepository.save(employee);
//    }
//    Exception
//     public void create(Employee employee){
//        employeeRepository.save(employee);
//        throw new DataIntegrityViolationException("Rollback exemple");
//    }
     
    // ne prends pas en compte car n'etends pas de RunTimeExcetpion
//   
//    public void create(Employee employee) throws SQLException{
//        employeeRepository.save(employee);
//        throw new SQLException("rollback excpeption for SQL exeception");
//    }
//    avec rollbackfor il lancera l'exception
//    @Transactional(rollbackFor = {SQLException.class})
//     public void create(Employee employee) throws SQLException{
//        employeeRepository.save(employee);
//        throw new SQLException("rollback excpeption for SQL exeception");
//    }
    
}
