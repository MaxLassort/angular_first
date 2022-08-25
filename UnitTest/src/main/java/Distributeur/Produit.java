/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Distributeur;

/**
 *
 * @author maxla
 */
public class Produit {
    private int Id;
    private String Nom;
    private int Prix; 
    private int Quantite;
    
    public Produit(){
        
    }
    public Produit(int Id, String Nom, int Prix, int Quantite) {
        this.Id = Id;
        this.Nom = Nom;
        this.Prix = Prix;
        this.Quantite = Quantite;
    }

    /**
     * @return the Id
     */
    public int getId() {
        return Id;
    }

    /**
     * @return the Nom
     */
    public String getNom() {
        return Nom;
    }

    /**
     * @return the Prix
     */
    public int getPrix() {
        return Prix;
    }

    /**
     * @return the Quantite
     */
    public int getQuantite() {
        return Quantite;
    }

    /**
     * @param Id the Id to set
     */
    public void setId(int Id) {
        this.Id = Id;
    }

    /**
     * @param Nom the Nom to set
     */
    public void setNom(String Nom) {
        this.Nom = Nom;
    }

    /**
     * @param Prix the Prix to set
     */
    public void setPrix(int Prix) {
        this.Prix = Prix;
    }

    /**
     * @param Quantite the Quantite to set
     */
    public void setQuantite(int Quantite) {
        this.Quantite = Quantite;
    }
    
}
