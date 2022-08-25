package com.maxime.maxime.model;

import org.springframework.stereotype.Component;

@Component
public class BusinessService {
    
   
    public HelloWorld getHelloWorld(){
        HelloWorld helloWorld= new HelloWorld();
        return helloWorld;
    }
}
