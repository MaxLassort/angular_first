/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.mycompany.firstwebapp;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author maxla
 */
public class distributeurController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
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
            Distributeur distrib = Distributeur.getInstance();
        
            
            List<Produit> stock = distrib.getStock();
            request.setAttribute("stock", stock);
            request.setAttribute("stock", stock);
            List<String> error = new ArrayList<>();
        try
        {
            boolean produitAchete = false;
            if (request.getParameter("idProduit") != null)
            {
                int idProduit = Integer.parseInt(request.getParameter("idProduit"));
                distrib.commanderProduit(idProduit);
                produitAchete = true;
            }
            if (request.getParameter("moreCredit") != null)
            {
                int moreCredit = Integer.parseInt(request.getParameter("moreCredit"));
                distrib.insererArgent(moreCredit);
            }
            int credit = distrib.getCredit();
            request.setAttribute("credit", credit);
            request.setAttribute("produitAchete", produitAchete);
        } catch (Exception e)
        {   
            boolean erroeException = true;
            request.setAttribute("erroeException", erroeException);
            error.add(e.getMessage());
        }
        this.getServletContext().getRequestDispatcher("/WEB-INF/distributeur.jsp").forward(request, response);

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
