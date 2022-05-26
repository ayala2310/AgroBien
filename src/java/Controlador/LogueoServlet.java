/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import DAO.UsuarioDAO;
import Modelo.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
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
@WebServlet(name = "LogueoServlet", urlPatterns = {"/LogueoServlet"})
public class LogueoServlet extends HttpServlet {

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
            out.println("<title>Servlet LogueoServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet LogueoServlet at " + request.getContextPath() + "</h1>");
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

        /*String accion;
        RequestDispatcher dispatcher = null;

        accion = request.getParameter("accion");

        if (accion == null || accion.isEmpty()) {
            dispatcher = request.getRequestDispatcher("Principal.jsp");
        } else if (accion.equals("login")) {
            String usu = request.getParameter("txtUsuario");
            String pas = request.getParameter("txtPassword");
            String ingresar = udao.validarUsuario(usu, pas);
            if (ingresar.equals("")) {
                dispatcher = request.getRequestDispatcher("Principal.jsp");
            } else {
                dispatcher = request.getRequestDispatcher("Login.jsp");
            }

        }*/
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

        UsuarioDAO udao = new UsuarioDAO();
        String v_error = "";

        String accion = request.getParameter("accion");
        System.out.println("LOG accion: "+accion);
        if (accion.equalsIgnoreCase("login")) {
            String user = request.getParameter("txtUsuario");
            String pass = request.getParameter("txtPassword");
            System.out.println("LOG user: "+user);
            System.out.println("LOG pass: "+pass);
            String validado = udao.validarUsuario(user, pass);
            System.out.println("LOG validado: "+validado);
            if (validado.equals("")) {
                request.getRequestDispatcher("Principal.jsp").forward(request, response);
                request.setAttribute("usuario", user);
            } else {
                v_error = "Usuario o contraseña incorrectos.";
                request.getRequestDispatcher("Login.jsp?error="+validado).forward(request, response);
            }
        } else {
            request.getRequestDispatcher("Login.jsp").forward(request, response);
        }
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
