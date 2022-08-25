/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/ServletListener.java to edit this template
 */
package User;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Web application lifecycle listener.
 *
 * @author maxla
 */
public class NewServletListener implements ServletContextListener, ServletContextAttributeListener, HttpSessionListener, HttpSessionAttributeListener, ServletRequestListener, ServletRequestAttributeListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("Context initialisé");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    System.out.println("Context initialisé");
    }

    @Override
    public void attributeAdded(ServletContextAttributeEvent event) {
        // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    System.out.println("Attribue ajouté");
    }

    @Override
    public void attributeRemoved(ServletContextAttributeEvent event) {
           System.out.println("Attribue supprimé");
    }

    @Override
    public void attributeReplaced(ServletContextAttributeEvent scae) {
           System.out.println("Attribue remplacé");
    }

    @Override
    public void sessionCreated(HttpSessionEvent se) {
           System.out.println("Session Créée");
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
           System.out.println("Session Supprimé");
    }

    @Override
    public void attributeAdded(HttpSessionBindingEvent event) {
           System.out.println("Attribue ajouté 2");
    }

    @Override
    public void attributeRemoved(HttpSessionBindingEvent event) {
           System.out.println("Attribue remove 2");
    }

    @Override
    public void attributeReplaced(HttpSessionBindingEvent event) {
           System.out.println("Attribue change");
    }

    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
           System.out.println("Request Destroyed");
    }

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
           System.out.println("Request init");
    }

    @Override
    public void attributeAdded(ServletRequestAttributeEvent srae) {
           System.out.println("Attribue ajouté3");
    }

    @Override
    public void attributeRemoved(ServletRequestAttributeEvent srae) {
           System.out.println("Attribue removed 3");
    }

    @Override
    public void attributeReplaced(ServletRequestAttributeEvent srae) {
           System.out.println("Attribue change 3");
    }
}
