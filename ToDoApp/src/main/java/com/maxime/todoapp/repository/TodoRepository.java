/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.maxime.todoapp.repository;

import com.maxime.todoapp.model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author maxla
 */
public interface TodoRepository  extends JpaRepository<Todo, Long> {
    
}
