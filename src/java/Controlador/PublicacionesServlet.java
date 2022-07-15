/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import DAO.ComentarioDAO;
import DAO.PublicacionDAO;
import Modelo.Comentario;
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
             request.getSession().setAttribute("mostrarNotif","");
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
             request.getSession().setAttribute("mostrarNotif","");

        request.getSession().setAttribute("bloqueado", null);
        List<Publicacion> listaPublicaciones = publicacionDao.listarPublicaciones();
        request.setAttribute("lista", listaPublicaciones);
        dispatcher = request.getRequestDispatcher("Blog.jsp");
        System.out.println("xxxxxxxxxxxx");
        //dispatcher = request.getRequestDispatcher("Blog.jsp");
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

        ComentarioDAO comentarioDao;
        comentarioDao = new ComentarioDAO();

        String accion;
        RequestDispatcher dispatcher = null;

        Date ahora = new Date();
        SimpleDateFormat formateador = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");

        String varUsuario = "";
        try {
            varUsuario = request.getSession().getAttribute("usuarioSesion").toString();
        } catch (Exception e) {
            varUsuario = "";
        }

        accion = request.getParameter("accion");
        System.out.println("ACCION: " + accion);
        if (accion.equals("inicio")) {
            dispatcher = request.getRequestDispatcher("Blog.jsp");
            List<Publicacion> listaPublicaciones = publicacionDao.listarPublicaciones();
            request.setAttribute("lista", listaPublicaciones);
        } else if (accion.equals("insert")) {
            //System.out.println("usuario: " + request.getAttribute("usuarioSesion").toString());

            if (varUsuario.equals("")) {

                request.getSession().setAttribute("bloqueado", "* Debe iniciar sesión para poder realizar publicaciones.");
                List<Publicacion> listaPublicaciones = publicacionDao.listarPublicaciones();
                request.setAttribute("lista", listaPublicaciones);
                dispatcher = request.getRequestDispatcher("Blog.jsp");
            } else {
                request.getSession().setAttribute("bloqueado", null);

                String asunto = request.getParameter("txtAsunto");
                String cuerpo = request.getParameter("txtCuerpo");
                String fecha = formateador.format(ahora);

                String usuario = request.getSession().getAttribute("usuarioSesion").toString();

                Publicacion publicacion = new Publicacion(null, asunto, cuerpo, fecha, usuario, null);
                publicacionDao.publicarBlog(publicacion);

                dispatcher = request.getRequestDispatcher("Blog.jsp");
                List<Publicacion> listaPublicaciones = publicacionDao.listarPublicaciones();
                request.setAttribute("lista", listaPublicaciones);
            }

        } else if (accion.equals("comentar")) {
            Integer idAsunto = Integer.parseInt(request.getParameter("txtIdAsunto"));
            String comentarios = request.getParameter("txtComentario");
            //String usuario = request.getSession().getAttribute("usuarioSesion").toString();
            String fecha = formateador.format(ahora);

            Comentario comentario = new Comentario(null, idAsunto, comentarios, varUsuario, fecha);
            comentarioDao.comentarPublicacion(comentario);

            List<Comentario> listarComentarios = comentarioDao.listarComentarios(idAsunto);
            request.setAttribute("comentariosBlog", listarComentarios);

            List<Publicacion> buscarPublicaciones = publicacionDao.buscarPublicacion(null, idAsunto);
            request.setAttribute("lista", buscarPublicaciones);

            dispatcher = request.getRequestDispatcher("Comentarios.jsp");
        } else if (accion.equals("buscar")) {
            String buscar;
            Integer idPublicacion;
            
            try {
                buscar = request.getParameter("txtBuscar").toUpperCase();
                List<Publicacion> buscarPublicaciones = publicacionDao.buscarPublicacion(buscar, 0);
                dispatcher = request.getRequestDispatcher("Blog.jsp");
                request.setAttribute("lista", buscarPublicaciones);
            } catch (Exception e) {
                buscar = "";
            }
            
            try {
                idPublicacion = Integer.parseInt(request.getParameter("idTxtAsuntoComentar"));
                List<Comentario> listarComentarios = comentarioDao.listarComentarios(idPublicacion);
                request.setAttribute("comentariosBlog", listarComentarios);

                List<Publicacion> buscarPublicaciones = publicacionDao.buscarPublicacion(null, idPublicacion);
                dispatcher = request.getRequestDispatcher("Comentarios.jsp");
                request.setAttribute("lista", buscarPublicaciones);
            } catch (Exception e) {
                idPublicacion = 0;
            }

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
