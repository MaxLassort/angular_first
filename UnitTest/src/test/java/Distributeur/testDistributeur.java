/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Distributeur;


import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class testDistributeur {
    
    public Distributeur distributeur;
    
    @BeforeEach
    public void BeforeEach() {
        distributeur = new Distributeur();
        distributeur.remplirStock();
    }
    
    
    @Test
    public void testRemplirLeStock() {      
        assertEquals( 1, distributeur.getStock().size());
    }
    
    @Test
    public void testInsererArgent() {
        int montantInitial = distributeur.getCredit();
        distributeur.insererArgent(5);
        assertEquals(montantInitial+5, distributeur.getCredit());
    }
 
    
    @Test
    public void testCommanderProduit(){     
        distributeur.insererArgent(5);        
        distributeur.commanderProduit(1);
        
        assertEquals(4, distributeur.getCredit());
        assertEquals(4, distributeur.getProduit(1).getQuantite());
    } 
    
    @Test
    public void testCommanderProduitProduitInexistant(){      
        distributeur.insererArgent(5);
        
        distributeur.commanderProduit(0);
        
        assertEquals(5, distributeur.getCredit());
        assertEquals(5, distributeur.getProduit(1).getQuantite());
        assertEquals(5, distributeur.getProduit(2).getQuantite());
        assertEquals(5, distributeur.getProduit(3).getQuantite());
    }
    
    @Test
    public void testCommanderProduitStockVide(){       
        distributeur.getProduit(1).setQuantite(0);
        distributeur.insererArgent(5);
        
        distributeur.commanderProduit(1);
        
        assertEquals(5, distributeur.getCredit());
        assertEquals(0, distributeur.getProduit(1).getQuantite());
    }
    
    @Test
    public void testCommanderProduitCreditZero(){        
        distributeur.commanderProduit(1);
        
        assertEquals(0, distributeur.getCredit());
        assertEquals(5, distributeur.getProduit(1).getQuantite());
    }
    
    @Test
    public void testCommanderProduitCreditInsuffisant(){       
        distributeur.insererArgent(1);
        
        distributeur.commanderProduit(2);
        
        assertEquals(1, distributeur.getCredit());
        assertEquals(5, distributeur.getProduit(2).getQuantite());
    }
}