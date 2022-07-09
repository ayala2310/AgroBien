/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import DAO.AgronomoDAO;
import Modelo.Agronomo;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author amontanez
 */
@WebServlet(name = "AgronomoServlet", urlPatterns = {"/AgronomoServlet"})
public class AgronomoServlet extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet AgronomoServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet AgronomoServlet at " + request.getContextPath() + "</h1>");
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
        AgronomoDAO agronomoDao;
        agronomoDao = new AgronomoDAO();
        System.out.println("SERVLET AGRO1");
        RequestDispatcher dispatcher = null;
        //List<Agronomo> listaAgronomos = agronomoDao.listarAgronomos();
        //ResultSet rs = agronomoDao.buscarAgronomo("",1, 5);
        //request.setAttribute("lista", listaAgronomos);
        dispatcher = request.getRequestDispatcher("Agronomos.jsp");
        dispatcher.forward(request, response);
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

        AgronomoDAO agronomoDao;
        agronomoDao = new AgronomoDAO();
        String accion;
        RequestDispatcher dispatcher = null;

        accion = request.getParameter("accion");

        if (accion.equals("buscar")) {
            String buscar = request.getParameter("txtBuscar").toUpperCase();
            String pag = request.getParameter("pag");
            //String buscar = request.getParameter("txtBuscar").toUpperCase();
            dispatcher = request.getRequestDispatcher("Agronomos.jsp");
            ResultSet buscarAgronomos = agronomoDao.buscarAgronomo(buscar, 1, 5);
            request.setAttribute("lista", buscarAgronomos);
        } else {
            //List<Agronomo> listaAgronomos = agronomoDao.listarAgronomos();
            request.setAttribute("lista", "");
        }

        request.getRequestDispatcher("Agronomos.jsp").forward(request, response);

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
