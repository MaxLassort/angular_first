/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.firstwebapp;

import java.io.Serializable;

/**
 *
 * @author maxla
 */
public class WordCalculator implements Serializable {
    private String phrase; 
    private int WordsNumber;

    public WordCalculator() {
    }

    public String getPhrase() {
        return phrase;
    }

    public int getWordsNumber() {
        return WordsNumber;
    }

    public void setPhrase(String phrase) {
        this.phrase = phrase;
    }

    public void setWordsNumber(int WordsNumber) {
        this.WordsNumber = WordsNumber;
    }
    
    public int Calcule(){
        String[] words = this.phrase.split(" ");       
        this.WordsNumber = words.length;
        return this.WordsNumber;
    }
    
}
