/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Distributeur;
/**
 *
 * @author maxla
 */

public class NewClassMain {

    public static void main(String[] args) {
        Distributeur test = new Distributeur();
        test.remplirStock();
        test.insererArgent(50);
        test.stockSuffisant(01);
        test.stockSuffisant(02);
        test.stockSuffisant(03);
        test.creditSuffisant(01);
        test.creditSuffisant(02);
        test.creditSuffisant(03);
        test.commanderProduit(02);
        
        
    }
}