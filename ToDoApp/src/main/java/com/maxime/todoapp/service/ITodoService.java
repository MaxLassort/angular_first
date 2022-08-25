/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.maxime.todoapp.service;

import com.maxime.todoapp.form.TodoForm;
import com.maxime.todoapp.model.Todo;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author maxla
 */
public interface ITodoService {

    public List<Todo> findAll();

    public Todo findById(Long id);
    
    public void save(Todo todo);
    
    public void delete(Long id);
    
    public Todo convert(TodoForm todoform);
    
    
}
