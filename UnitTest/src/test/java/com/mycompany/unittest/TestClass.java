/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.unittest;

import org.junit.jupiter.api.*;

/**
 *
 * @author maxla
 */

public class TestClass {
   @BeforeAll
   static void setupAll(){
    System.out.println("setupAll");
   }
   @BeforeEach
   void setup(){
       System.out.println("setup");
   }
   @AfterEach 
   void teardown(){
       System.out.println("teardown");
   }
   @AfterAll
   static void teardownAll(){
       System.out.println("teardownAll");
   }
   @Test 
   void unTest(){
       System.out.println("unTest");
       Assertions.assertTrue(true);
   }
   @Test
   void unAutreTest(){
       System.out.println("unAutreTest");
       Assertions.assertTrue(true);
   }
}
