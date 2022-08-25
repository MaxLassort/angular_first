/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maxime.todoapp.controller;

import com.maxime.todoapp.form.TodoForm;
import com.maxime.todoapp.model.Todo;
import com.maxime.todoapp.repository.TodoRepository;
import com.maxime.todoapp.service.ITodoService;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Optional;
import javax.validation.Valid;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author maxla
 */
@Controller
@RequestMapping("/todo")
public class todoController {
    
    ITodoService todoServ;

    public todoController(ITodoService todoServ) {
        this.todoServ = todoServ;
    }

    
    @GetMapping
    public String showToDo(Model model){
        model.addAttribute("todos", todoServ.findAll());
        return "todo";
    }
    
    @GetMapping("/addTodo")
    public String showAddTodo(Model model){
        model.addAttribute("todoForm", new TodoForm());
        return "addTodo";
    }
    
    @PostMapping("/addTodo")
    public String addtodo(@ModelAttribute("todoForm") @Valid TodoForm todoform, BindingResult bindingResult, ModelMap model){

        if(bindingResult.hasErrors()){
            model.addAttribute("todoform", new TodoForm());
            return "addTodo";
        }else{
            Todo todoToSave = todoServ.convert(todoform);
            todoServ.save(todoToSave); 
            return "redirect:/todo";  
        }
    }
    
    @GetMapping("/update-{id}")
    public String showUpdate( Model model, @PathVariable("id") Long id){
        model.addAttribute("todoUpdate", todoServ.findById(id));
        model.addAttribute("todoForm", new TodoForm());
        return "update";
    }   
    
    @PostMapping("/update-{id}")
    public String updateTodo(@ModelAttribute("todoForm") @Valid TodoForm todoform,
                                BindingResult bindingResult,
                                @PathVariable("id") Long id, ModelMap model){
            Todo toUpdate= todoServ.findById(id);
        
        if(bindingResult.hasErrors()){
            model.addAttribute("todoform", new TodoForm());
            return "update";
        }else{
            Todo form = todoServ.convert(todoform);
            toUpdate.modify(form);
            todoServ.save(toUpdate); 
            return "redirect:/todo";  
        }
    }
    @GetMapping("/delete-{id}")
    public String deleteTodo(Model model, @PathVariable("id") Long id){
        todoServ.delete(id); 
        return "redirect:/todo";  
    }
}

    

//@RequestParam("id") Long id
//@PathVaariable
