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
        System.out.println("DO GET TEST");
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

        String accion = request.getParameter("accion");
        String pagina = request.getParameter("txtPaginaActual");
            System.out.println("LOG pagina: " + pagina);
        System.out.println("LOG accion: " + accion);
        if (accion.equalsIgnoreCase("Iniciar Sesión")) {
            String user = request.getParameter("txtUsuario");
            String pass = request.getParameter("txtPassword");
            System.out.println("LOG user: " + user);
            System.out.println("LOG pass: " + pass);
            String validado = udao.validarUsuario(user, pass);
            System.out.println("LOG validado: " + validado);

            if (validado.equals("")) {
                System.out.println("LOG USUARIO NULO: " + user);
                request.getSession().setAttribute("usuarioSesion", null);
                if (validado.equals("Agricultor")) {
                    request.getSession().setAttribute("mostrarAgronomo", "");
                } else {
                    request.getSession().setAttribute("mostrarAgronomo", "none");
                }
                request.getSession().setAttribute("displayNoneLogin", "");
                request.getSession().setAttribute("displayNoneUsuario", "none");
                request.getRequestDispatcher(pagina + ".jsp?error=" + "Usuario o contraseña incorrectos.").forward(request, response);

            } else {
                System.out.println("LOG USUARIO OK: " + user);
                request.getSession().setAttribute("usuarioSesion", user);
                if (validado.equals("Agricultor")) {
                    request.getSession().setAttribute("mostrarAgronomo", "block");
                } else {
                    request.getSession().setAttribute("mostrarAgronomo", "none");

                }
                request.getSession().setAttribute("displayNoneLogin", "none");
                request.getSession().setAttribute("displayNoneUsuario", "block");
                request.getRequestDispatcher(pagina + ".jsp").forward(request, response);
            }
        } else if (accion.equalsIgnoreCase("Registrar")) {
            String nombres = request.getParameter("txtNombres");
            String apellidos = request.getParameter("txtApellidos");
            String dni = request.getParameter("txtDni");
            String celular = request.getParameter("txtCelular");
            String correo = request.getParameter("txtCorreo");
            String ciudad = request.getParameter("txtCiudad");
            String tipo = request.getParameter("txtTipo");
            String colegiatura = request.getParameter("txtColegiatura");
            String usuario = request.getParameter("txtUsuario");
            String password = request.getParameter("txtPassword");

            String validado = udao.validarExistenciaUsuario(usuario);
            if (validado.equals("")) {
                validado = udao.registrarUsuario(usuario, password, tipo);
                if (validado.equals("")) {
                    if (tipo.equals("Agricultor")) {
                        validado = udao.registrarAgricultor(nombres, apellidos, dni, celular, correo, ciudad, tipo, usuario, password);
                    } else {
                        validado = udao.registrarAgronomo(nombres, apellidos, dni, celular, correo, ciudad, tipo, colegiatura, usuario, password);
                    }
                }
            }
            System.out.println("rspta validado: " + validado);
            if (validado.equals("")) {
                if (tipo.equals("Agricultor")) {
                    validado = "Usuario Agricultor registrado con éxito.";
                } else {
                    validado = "Usuario Agrónomo registrado con éxito.";
                }
                System.out.println("rspta validado2: " + validado);
                request.getRequestDispatcher(pagina + ".jsp?msgOK=" + validado).forward(request, response);
            } else {
                request.getRequestDispatcher(pagina + ".jsp?error=" + validado).forward(request, response);
            }
        } else if (accion.equalsIgnoreCase("Cerrar Sesión")) {
            request.getSession().setAttribute("usuarioSesion", null);
            request.getSession().setAttribute("mostrarAgronomo", "none");
            request.getSession().setAttribute("displayNoneLogin", "");
            request.getSession().setAttribute("displayNoneUsuario", "none");
            request.getRequestDispatcher(pagina + ".jsp").forward(request, response);

        } else {
            request.getRequestDispatcher(pagina + ".jsp").forward(request, response);
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
