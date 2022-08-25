/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.unittest;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.*;
/**
 *
 * @author maxla
 */
public class testPalindrome {
   @Test 
    void verif1(){
        Palindrome test = new Palindrome();
        boolean valeur = test.isPalindrome("kayak");
        Assertions.assertEquals(valeur, true);
    }
    @Test 
    void verif2(){
        boolean test = Palindrome.isPalindrome("La mariée ira mal");
        Assertions.assertTrue(test);
    }
    @Test 
    void verif3(){
        Palindrome test = new Palindrome();
        boolean valeur = test.isPalindrome("À révéler mon nom, mon nom relèvera ");
        Assertions.assertEquals(valeur, true);
    }
    @Test
    void verifEmpty(){
        Palindrome test = new Palindrome();
        boolean valeur = test.isPalindrome("");
        Assertions.assertEquals(valeur, true);
    }
    @Test
     void verifAccent(){
        Palindrome test = new Palindrome();
        boolean valeur = test.isPalindrome("Ta bête te bat");
        Assertions.assertEquals(valeur, true);
    }
    @ParameterizedTest
    @ValueSource(strings = {"Engage le jeu que je le gagne", "Noël a trop par rapport à Léon", "kayak"})
    public void testMultiple(String valeur){
        Palindrome test = new Palindrome();
        boolean value = test.isPalindrome(valeur);
        Assertions.assertEquals(value, true);
    }
     @ParameterizedTest
    @CsvSource({"kayak, true", "rever, true", "arbre, fase"})
    public void testMultipleFalse(String str, boolean bool){
        boolean test = Palindrome.isPalindrome(str);
        Assertions.assertEquals(test, bool);
    }
     
     
     
}
