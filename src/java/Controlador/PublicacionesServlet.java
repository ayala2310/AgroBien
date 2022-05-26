/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import DAO.PublicacionDAO;
import Modelo.Publicacion;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author amontanez
 */
@WebServlet(name = "PublicacionesServlet", urlPatterns = {"/PublicacionesServlet"})
public class PublicacionesServlet extends HttpServlet {

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
            out.println("<title>Servlet PublicacionesServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet PublicacionesServlet at " + request.getContextPath() + "</h1>");
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
        PublicacionDAO publicacionDao;
        publicacionDao = new PublicacionDAO();
        
        RequestDispatcher dispatcher = null;
        dispatcher = request.getRequestDispatcher("Blog.jsp");
        List<Publicacion> listaPublicaciones = publicacionDao.listarPublicaciones();
        request.setAttribute("lista", listaPublicaciones);

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
        //doGet(request, response);
        PublicacionDAO publicacionDao;
        publicacionDao = new PublicacionDAO();
        String accion;
        RequestDispatcher dispatcher = null;

        accion = request.getParameter("accion");
        System.out.println("ACCION: " + accion);
        if (accion.equals("inicio")) {
            dispatcher = request.getRequestDispatcher("Blog.jsp");
            List<Publicacion> listaPublicaciones = publicacionDao.listarPublicaciones();
            request.setAttribute("lista", listaPublicaciones);
        } else if (accion.equals("insert")) {
            Date ahora = new Date();
            SimpleDateFormat formateador = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
            System.out.println("formateador: " + formateador);
            String asunto = request.getParameter("txtAsunto");
            String cuerpo = request.getParameter("txtCuerpo");
            String fecha = formateador.format(ahora);
            String usuario = "anthony"; //request.getParameter("txtTipo");
            System.out.println("cuerpo: " + cuerpo);
            Publicacion publicacion = new Publicacion(null, asunto, cuerpo, fecha, usuario);
            publicacionDao.publicarBlog(publicacion);
            dispatcher = request.getRequestDispatcher("Blog.jsp");
            List<Publicacion> listaPublicaciones = publicacionDao.listarPublicaciones();
            request.setAttribute("lista", listaPublicaciones);
        } else {
            dispatcher = request.getRequestDispatcher("Blog.jsp");
            List<Publicacion> listaPublicaciones = publicacionDao.listarPublicaciones();
            request.setAttribute("lista", listaPublicaciones);
        }

        dispatcher.forward(request, response);
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
