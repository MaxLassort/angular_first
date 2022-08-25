/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.unittest;
import org.apache.commons.lang3.StringUtils;
import java.util.*;

/**
 *
 * @author maxla
 */

public class Palindrome {
    public static boolean isPalindromeByMe(String phrase){
        String reverse = new StringBuilder(phrase).reverse().toString().toLowerCase();
        if(reverse.equals(phrase)){
            System.out.println("c'est bon");
            return true;
        } else {
            System.out.println("C'est pas bon");
            return false;
        }
    }
    public static boolean isPalindrome(String phrase){ 
        phrase = phrase.toLowerCase();
        phrase = phrase.replaceAll(" ", "");
        phrase = StringUtils.stripAccents(phrase);
        
        int debut = 0;
        int fin = phrase.length() - 1;
        
        while (debut < fin) {
            if(phrase.charAt(debut) != phrase.charAt(fin))
                return false;
            
            fin--;
            debut++;
        }
        
        return true;
    }
}
