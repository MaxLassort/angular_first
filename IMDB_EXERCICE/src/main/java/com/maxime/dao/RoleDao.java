/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maxime.dao;

import com.maxime.helper.SessionHelper;
import com.maxime.model.Movie;
import com.maxime.model.Role;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

/**
 *
 * @author maxla
 */
public class RoleDao {
    EntityManager em = SessionHelper.getEntityManager();
    
    
    public Role findById(long id){
        
        Role role = em.find(Role.class, id);
        
        if(role==null){
            System.out.println("role inexistant");
        }
        return role;     
    }
    
    public void create(Role role){
        if(role == null){
            System.out.println("L'objet role ne peut pas etre null");
            return;
        }
        // On declare notre transaction avec pour valeur par defaut null
        EntityTransaction trans = null; 
        try{
            trans = em.getTransaction();
            trans.begin();
            em.merge(role);
            trans.commit();
        }catch(Exception e){
            System.out.println("Une erreur est survenu lors de la creation");
            // Une erreur est survenue, on discard les actions entam�s dans la transaction
            if(trans == null){
                trans.rollback();
            }           
        }
    }
    
    public void update(long id, Role role) {
        
        // On r�cup�re le role qu'on souhaite modifier
        Role roleToUpdate = em.find(Role.class, id);
        // Si le role n'existe pas on ne fait pas d'update
        if (roleToUpdate == null) {
            System.out.println("Le role avec l'id:" + id + " n'existe pas");
            return;
        }
        // on set les donn�es uniquement si elle ne sont pas null
        
        roleToUpdate.copy(role);
        
        EntityTransaction tx = null;
        try {
            tx = em.getTransaction();
            tx.begin();
            em.merge(roleToUpdate);           
            tx.commit();
        } catch (Exception e) {
            System.out.println("Une erreur est survenu lors de la modification");
            if (tx != null) {
                tx.rollback();
            }
        }
    }
    
    public List<Role> findAll(){
        Query query = em.createQuery("SELECT r FROM Role r"); 
        return query.getResultList();
    }
    
    
    
    public void delete(long id) {
        
        // On r�cup�re le role qu'on souhaite modifier
        Role roleToDeletee = em.find(Role.class, id);
        // Si le role n'existe pas on ne fait pas d'update
        if (roleToDeletee == null) {
            System.out.println("Le role avec l'id:" + id + " n'existe pas");
            return;
        }
        // on set les donn�es uniquement si elle ne sont pas null
        EntityTransaction tx = null;
        try {
            tx = em.getTransaction();
            tx.begin();
            em.remove(roleToDeletee);
            tx.commit();
        } catch (Exception e) {
            System.out.println("Une erreur est survenu lors de la modification");
            if (tx != null) {
                tx.rollback();
            }
        }
    }

}
