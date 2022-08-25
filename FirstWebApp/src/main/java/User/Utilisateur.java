/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package User;

import java.io.Serializable;

/**
 *
 * @author maxla
 */
public class Utilisateur implements Serializable {
    private String mail ; 
    private String password;
    private String role; 

    public Utilisateur() {
    }

    public Utilisateur(String mail, String password, String role) {
        this.mail = mail;
        this.password = password;
        this.role = role;
    }

    public String getMail() {
        return mail;
    }

    public String getPassword() {
        return password;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
    
    
    
    
}
