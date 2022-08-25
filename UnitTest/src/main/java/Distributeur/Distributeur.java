/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Distributeur;
import java.util.*;

/**
 *
 * @author maxla
 */
public class Distributeur {
    private int credit = 0;
    private ArrayList<Produit> stock;

   
    public Distributeur(){
         this.stock = new ArrayList<>();
    }
 
    public int getCredit() {
        return credit;
    }

    public ArrayList getStock() {
        return stock;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public void setStock(ArrayList stock) {
        this.stock = stock;
    }

    public void remplirStock(){ 
        this.stock.add(new Produit(01, "gateau très bon", 10, 5));
        this.stock.add(new Produit(02, "gateau moins bon", 8, 5));
        this.stock.add(new Produit(03, "gateau pas bon", 5, 5));
    }
    
    public void insererArgent(int montant){
        this.credit += montant;
    }
    public Produit getProduit(int idProduit){
        
        for( Produit el : this.stock){
            if(el.getId()== idProduit){
                return el;
            }
        }
        return null;   
    }
   
    public boolean stockSuffisant(int idProduit){
         for( Produit el : this.stock){
            if(el.getId()== idProduit){
                if(el.getQuantite() > 1){
                    System.out.println( el.getNom() + " en stock ");
                    return true ;
                }   
            }
        }
        return false;
    }
    
    public boolean creditSuffisant(int idProduit){
         for( Produit el : this.stock){
            if(el.getId()== idProduit){
                if(el.getQuantite() < this.credit){
                    System.out.println( "Credit suffisant pour " + el.getNom());
                    return true ;
                }   
            }
        }
        return false;
    }
 
    public void commanderProduit(int idProduit){
        
        for( Produit el : this.stock){
            if(el.getId()== idProduit){
                if(this.creditSuffisant(idProduit) && this.stockSuffisant(idProduit)){
                    el.setQuantite(el.getQuantite()-1);
                    System.out.println( el.getNom() + " Acheté ");
                    
                    this.credit -= el.getPrix();
                    
                } else {
                    System.out.println("Pas assez d'argent où de quantité");
                }
            }   
        }
    }
         
    
    
}
