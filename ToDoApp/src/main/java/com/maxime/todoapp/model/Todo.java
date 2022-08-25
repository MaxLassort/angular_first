/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maxime.todoapp.model;

import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author maxla
 */
@Entity
@Data
@NoArgsConstructor
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private String username;
    
    @Column 
    private String description;
    
    @Column(columnDefinition = "DATE")
    private LocalDate targetDate;

    public Todo(String username, String description, LocalDate targetDate) {
        this.username = username;
        this.description = description;
        this.targetDate = targetDate;
    }
    
    public void modify(Todo todo){
        if(todo.getUsername() != null){
            this.setUsername(todo.getUsername());
        }
        if(todo.getDescription() != null){
            this.setDescription(todo.getDescription());
        }
        if(todo.getTargetDate()!= null){
            this.setTargetDate(todo.getTargetDate());
        }
        
    }
    
    
}
