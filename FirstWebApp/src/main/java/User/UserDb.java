/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package User;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author maxla
 */
public class UserDb {
   static List<Utilisateur> users = new ArrayList<Utilisateur>(){{
   add(new Utilisateur("maxime", "0000", "admin"));
   }}; 
   
    
    static public Utilisateur checkUser(String mail, String password){
        for(int i = 0; i< users.size(); i++){
            if(mail.equals(users.get(i).getMail())) {
                if(password.equals(users.get(i).getPassword())){
                    return users.get(i); 
                }
            }
        }
        return null;
    }
}
