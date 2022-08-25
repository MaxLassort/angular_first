/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maxime.todoapp.form;

import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author maxla
 */
@Data
@NoArgsConstructor
public class TodoForm {
    @NotEmpty(message = "can't be null")
    private String username;
    @NotEmpty(message = "can't be null")
    private String description;
    @NotNull(message = "can't be null")
    private LocalDate targetDate;
}
