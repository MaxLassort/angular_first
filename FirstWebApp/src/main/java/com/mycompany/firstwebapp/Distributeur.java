/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.firstwebapp;

import java.util.ArrayList;
import java.util.List;

public class Distributeur {

    private static Distributeur instance  ; 
    private int credit;
    private List<Produit> stock;
    
    private Distributeur(){
        credit = 0;
        stock = new ArrayList();
    }
    public static Distributeur getInstance(){
        if(instance==null){
            instance = new Distributeur();
            instance.remplirLeStock();
        }
        return instance ;
    }
    public void remplirLeStock() {
        stock.add(new Produit(1, "café", 1, 5));
        stock.add(new Produit(2, "soda", 2, 5));
        stock.add(new Produit(3, "barre céréales", 3, 5));
    }
    public void insererArgent(int montant) {
        credit += montant;
    }
    
    public boolean stockSuffisant(int idProduit) {
        Produit produit = getProduit(idProduit);
        if (produit == null) {
            return false;
        }
        return produit.getQuantite() >= 1;
    }
    
    public boolean creditSuffisant(int idProduit) {
        Produit produit = getProduit(idProduit);
         if (produit == null) {
            return false;
        }
        return credit >= produit.getPrix();
    }

    public void commanderProduit(int idProduit){

        if(stockSuffisant(idProduit) && creditSuffisant(idProduit)) {
            Produit produit = getProduit(idProduit);

            if (produit == null) {
                return;
            }
            
            produit.setQuantite(produit.getQuantite() - 1);
            credit -= produit.getPrix(); 
        }
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public List<Produit> getStock() {
        return stock;
    }

    public void setStock(List<Produit> stock) {
        this.stock = stock;
    }
    
    public Produit getProduit(int id) {
        for(Produit produit: stock) {
           if(produit.getId() == id){
               return produit;
           }
        }
        return null;
    }
    
}