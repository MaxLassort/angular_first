/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.m2i.spring.lesson;

import java.util.List;
import java.util.Map;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author maxla
 */
@Configuration
@ConfigurationProperties(prefix="app")
public class ConfigProperties {
    private String hostname;
    private int port;
    private List<String> adminEmails;
    private Map<String, Boolean> authentification;

    public ConfigProperties() {
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public List<String> getAdminEmails() {
        return adminEmails;
    }

    public void setAdminEmails(List<String> adminEmails) {
        this.adminEmails = adminEmails;
    }

    public Map<String, Boolean> getAuthentification() {
        return authentification;
    }

    public void setAuthentification(Map<String, Boolean> authentification) {
        this.authentification = authentification;
    }

    
}

    
    
