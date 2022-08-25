/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package com.mycompany.club_maxime;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;


/**
 *
 * @author maxla
 */
@ManagedBean (name="userData", eager = true)
    
public class UserData {
    
    private User user; 
    private List<User> users = new ArrayList<>(); 
    
    public UserData() {
        user = new User();
    }
    public List<User> getUsers() {
        return users;
    }
    public void setUsers(List<User> users) {
        this.users = users;
    }
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }
    
    public String addUser(){
        users.add(user);
        user = new User();
        return null;
    }
    
}
