/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.mycompany.firstwebapp;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author maxla
 */
public class Countwords extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Countwords</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Countwords at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        if(request.getParameter("chaine")!= null){
            String test = request.getParameter("chaine");
            int size = test.split(" ").length;
            List<String> array = new ArrayList<>();
            array = Arrays.asList(test.split(" "));
            request.setAttribute("longueur",  array.size()); 
            request.setAttribute("size", size);
        } 
        if(request.getParameter("nombre")!= null){
            int testValue= Integer.parseInt(request.getParameter("nombre"));              
            for(int i = 2; i < testValue ; i++) {
                 if (testValue % i == 0) {
                     request.setAttribute("isPrime", "n'est pas premier");
                     break;
                 } else{
                     request.setAttribute("isPrime", "est premier");
                 }
            };
            if(testValue == 0 || testValue == 1){
                request.setAttribute("isPrime", "n'est pas premier");
            }     
        } 
        if(request.getParameter("num1")!= null && request.getParameter("num2")!= null ){
            int num1= Integer.parseInt(request.getParameter("num1"));
            request.setAttribute("num1", num1 );
            int num2= Integer.parseInt(request.getParameter("num2"));
            request.setAttribute("num2", num2 );
        }
        this.getServletContext().getRequestDispatcher( "/CountWordsServlet.jsp").forward( request, response );
        
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
