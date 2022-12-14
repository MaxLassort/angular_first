/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maxime.dao;

import com.maxime.helper.SessionHelper;
import com.maxime.model.Genre;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

/**
 *
 * @author maxla
 */
public class GenreDao {
    EntityManager em = SessionHelper.getEntityManager();
     
    public Genre findById(long id){
        
        Genre genre = em.find(Genre.class, id);
        
        if(genre==null){
            System.out.println("movie inexistant");
        }
        return genre;     
    }
    
    public void create(Genre genre){
        if(genre == null){
            System.out.println("L'objet genre ne peut pas etre null");
            return;
        }
        // On declare notre transaction avec pour valeur par defaut null
        EntityTransaction trans = null; 
        try{
            trans = em.getTransaction();
            trans.begin();
            em.persist(genre);
            trans.commit();
        }catch(Exception e){
            System.out.println("Une erreur est survenu lors de la creation");
            // Une erreur est survenue, on discard les actions entam�s dans la transaction
            if(trans == null){
                trans.rollback();
            }           
        }
    }
    
    public void update(long id, Genre genre) {
        
        // On r�cup�re le role qu'on souhaite modifier
        Genre genreToUpdate = em.find(Genre.class, id);
        // Si le role n'existe pas on ne fait pas d'update
        if (genreToUpdate == null) {
            System.out.println("Le genre avec l'id:" + id + " n'existe pas");
            return;
        }
        // on set les donn�es uniquement si elle ne sont pas null
        
        genreToUpdate.copy(genre);
        
        EntityTransaction tx = null;
        try {
            tx = em.getTransaction();
            tx.begin();
            em.merge(genreToUpdate);           
            tx.commit();
        } catch (Exception e) {
            System.out.println("Une erreur est survenu lors de la modification");
            if (tx != null) {
                tx.rollback();
            }
        }
    }
    
    public List<Genre> findAll(){
        Query query = em.createQuery("SELECT g FROM Genre a"); 
        return query.getResultList();
    }
    
    
    
    public void delete(long id) {
        
        // On r�cup�re le role qu'on souhaite modifier
        Genre genreToDeletee = em.find(Genre.class, id);
        // Si le role n'existe pas on ne fait pas d'update
        if (genreToDeletee == null) {
            System.out.println("Le genre avec l'id:" + id + " n'existe pas");
            return;
        }
        // on set les donn�es uniquement si elle ne sont pas null
        EntityTransaction tx = null;
        try {
            tx = em.getTransaction();
            tx.begin();
            em.remove(genreToDeletee);
            tx.commit();
        } catch (Exception e) {
            System.out.println("Une erreur est survenu lors de la modification");
            if (tx != null) {
                tx.rollback();
            }
        }
    }
}
