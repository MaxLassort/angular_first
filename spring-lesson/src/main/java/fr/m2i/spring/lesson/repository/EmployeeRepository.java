/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package fr.m2i.spring.lesson.repository;

import fr.m2i.spring.lesson.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author maxla
 */
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    Employee findByFirstName(String firsname);
    Employee findByLastName(String firsname);
    
    @Query("SELECT e FROM Employee e WHERE LOWER(e.lastName) = LOWER(e.lastName)")
    Employee retrieveByLastName(@Param("lastname") String lastname);
    
}
