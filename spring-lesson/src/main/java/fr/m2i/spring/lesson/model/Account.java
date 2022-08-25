/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.m2i.spring.lesson.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;

/**
 *
 * @author maxla
 */
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of="email")
@ToString
@Entity
@Table(name="accounts")
public class Account implements Serializable {
    
    @Id
    @GeneratedValue
    private Long id;
    
    private String firstName;
    
    private String lastName;
    
    private String email;
    
    private LocalDate birthdate;
    
    @Enumerated(EnumType.STRING)
    private Gender gender;
    
    @CreationTimestamp
    private LocalDateTime creationTime;
    
    private float balance=0F;

    public Account(String firstName, String lastName, String email, LocalDate birthdate, Gender gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.birthdate = birthdate;
        this.gender = gender;
    }
    
    
}
