/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maxime.todoapp.service;

import com.maxime.todoapp.form.TodoForm;
import com.maxime.todoapp.model.Todo;
import com.maxime.todoapp.repository.TodoRepository;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.stereotype.Service;

/**
 *
 * @author maxla
 */
@Transactional
@Service
public class TodoService implements ITodoService {
    TodoRepository todoRepo;

    public TodoService(TodoRepository todoRepo) {
        this.todoRepo = todoRepo;
    }

    @Override
    public List<Todo> findAll() {
        return todoRepo.findAll();
    }

    @Override
    public Todo findById(Long id) {
//        Optional<Todo> todo = todoRepo.findById(id);
//        if(todo.isEmpty()){
//           throw new Exception("ToDo not find");
//        }
//        return todoRepo.findById(id).get();
        return todoRepo.findById(id).orElse(null);
    }

    @Override
    public void save(Todo todo) {
        todoRepo.save(todo);
    }

    @Override
    public void delete(Long id) {
        todoRepo.deleteById(id);
    }
    
    public Todo convert(TodoForm todoform){
//        Todo toto= new Todo(todoform.getUsername(), todoform.getDescription(), LocalDate.parse(todoform.getTargetDate()));
        Todo toto= new Todo(todoform.getUsername(), todoform.getDescription(), todoform.getTargetDate());

        return toto;
    }
    
}
