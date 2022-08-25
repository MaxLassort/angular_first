/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.club_maxime;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author maxla
 */
public class User implements Serializable {
    private String lastName;
    private String firstName;
    private String birthDate;
    private String city;
    private List <String> hobby;
    private List <String> sex;
  
    
    
    public User(String lastName, String firstName, String birthDate, String city, List<String> hobby, List<String> sex) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.birthDate = birthDate;
        this.city = city;
        this.hobby = hobby;
        this.sex = sex;
    }

    public User() {
        this.hobby = new ArrayList<>();
        this.hobby.add("Lecture");
        this.hobby.add("Foot");
        this.hobby.add("Jeux Vidéo");
        this.sex = new ArrayList<>();
        this.sex.add("Homme");
        this.sex.add("Femme");        
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public List<String> getHobby() {
        return hobby;
    }

    public void setHobby(List<String> hobby) {
        this.hobby = hobby;
    }

    public List<String> getSex() {
        return sex;
    }

    public void setSex(List<String> sex) {
        this.sex = sex;
    }
    
    
}
