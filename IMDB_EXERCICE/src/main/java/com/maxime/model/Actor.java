/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maxime.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.UpdateTimestamp;

/**
 *
 * @author maxla
 */
@Entity
@Table(name="actor")
public class Actor implements Serializable {
  
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name="firstname", length=100)
    private String firstname;
    
    @Column(name="lastname", length=100)
    private String lastname;
    
    @Column(name="birthdate", columnDefinition="DATE")
    @Temporal(TemporalType.DATE)
    private Date birthdate;
    
    @ManyToMany(fetch = FetchType.LAZY, mappedBy="actors")
    private List<Movie> movies;

    public Actor() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public List<Movie> getMovies() {
        return movies;
    }

    public void setMovies(List<Movie> movies) {
        this.movies = movies;
    }

    public void copy(Actor data) {
        if (data.getFirstname() != null) {
            this.firstname = data.getFirstname();
        }
        if (data.getLastname() != null) {
            this.lastname = data.getLastname();
        }
        if (data.getBirthdate() != null) {
           this.birthdate = data.getBirthdate();
        }
        if (data.getMovies() != null) {
           this.movies = data.getMovies();
        }
    }
   
    
    


    
}
