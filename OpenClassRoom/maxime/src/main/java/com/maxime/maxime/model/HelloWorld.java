package com.maxime.maxime.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class HelloWorld implements CommandLineRunner {

    private String value = "Hello bitchs";

    @Autowired
    private BusinessService bs;

    @Override
    public void run(String... args) throws Exception {
        HelloWorld hw = bs.getHelloWorld();
        System.out.println(hw);
    }

    public HelloWorld() {
    }

    public HelloWorld(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
    }

   public String toString(){
    return this.value;
   }

   
    
}
