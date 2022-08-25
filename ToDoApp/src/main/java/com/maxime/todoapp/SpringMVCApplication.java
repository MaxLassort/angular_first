package com.maxime.todoapp;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
// Equivalent de
// @SpringBootConfiguration
// @EnableAutoConfiguration
// @ComponentScan(basePackages = {"fr.m2i.spring.lesson", "fr.m2i.data"})

@SpringBootApplication
public class SpringMVCApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(SpringMVCApplication.class, args);

    }

}
