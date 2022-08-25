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
public class Test2 {
    @Test 
    void verifierException(){
        String valeur = null;
        Assertions.assertThrows(NumberFormatException.class, () -> {
        Integer.valueOf(valeur); });
    }
    @ParameterizedTest
    @ValueSource(ints = { 1, 2, 3})
    public void tesParameterized(int valeur){
        Assertions.assertEquals(valeur + valeur, valeur * 2);
    }

    @ParameterizedTest
    @CsvSource({"1, 1", "1, 2", "2, 3"})
    public void testCsvSource(int a, int b){
        int resultatAttendu = a + b ; 
        System.out.println("A =>" + a);
        System.out.println("B =>" + b);     
        Assertions.assertEquals(resultatAttendu, a + b);
    }
        
}
