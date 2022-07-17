/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import DAO.UsuarioDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
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
        request.getSession().setAttribute("mostrarNotif", "");
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
        request.getSession().setAttribute("displayNoneLogin", "");
        request.getSession().setAttribute("mostrarNotif", "");
        request.getSession().setAttribute("mostrarAgronomo", "none");
        String accion;
        RequestDispatcher dispatcher = null;

        accion = request.getParameter("accion");
        System.out.println("accion GET: " + accion);
        String usuario = request.getSession().getAttribute("usuarioSesion").toString();
        String idUsuario = request.getSession().getAttribute("idUsuarioSesion").toString();
        String perfilUsuario = request.getSession().getAttribute("perfilTipoUsuario").toString();

        System.out.println("accion GET usuario: " + usuario);
        if (accion.equals("Mi Perfil")) {
            UsuarioDAO ud = new UsuarioDAO();
            List<String> lista = ud.obtenerPerfil(usuario);
            System.out.println("xxxxxxx: " + lista.get(1).toString());
            request.setAttribute("perfilIdUsuario", lista.get(0).toString());
            request.setAttribute("perfilUsuario", lista.get(1).toString());
            request.setAttribute("perfilPassword", lista.get(2).toString());
            request.setAttribute("perfilTipoUsuario", lista.get(3).toString());
            request.setAttribute("perfilNombres", lista.get(4).toString());
            request.setAttribute("perfilApellidos", lista.get(5).toString());
            request.setAttribute("perfilCiudad", lista.get(6).toString());
            request.setAttribute("perfilCorreo", lista.get(7).toString());
            request.setAttribute("perfilColegiatura", lista.get(8).toString());
            if (lista.get(3).toString().equals("Agricultor")) {
                request.setAttribute("mostrarColegiatura", "none");
            } else {
                request.setAttribute("mostrarColegiatura", "block");
            }
                request.getSession().setAttribute("usuarioSesion", usuario);
                request.getSession().setAttribute("idUsuarioSesion", idUsuario);
                request.getSession().setAttribute("perfilTipoUsuario", perfilUsuario);
 request.getSession().setAttribute("displayNoneLogin", "none");
            dispatcher = request.getRequestDispatcher("EditarPerfil.jsp");
            dispatcher.forward(request, response);
        }
        /*
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
        System.out.println("accion: " + accion);
        String pagina = request.getParameter("txtPaginaActual");
        System.out.println("pagina: " + pagina);
        if (accion.equalsIgnoreCase("Iniciar Sesión")) {
            int idExiste = 0;
            int cantidadIntentosRestantes = 0;
            String tipoUsuario = "";
            String estado = "";
            String user = request.getParameter("txtUsuario").toUpperCase();
            String pass = request.getParameter("txtPassword");
            //String validado = udao.validarUsuario(user, pass);
            ResultSet validado = udao.validarUsuario(user);

            try {
                while (validado.next()) {
                    idExiste = validado.getInt(1);
                    cantidadIntentosRestantes = validado.getInt(6);
                    estado = validado.getString(5);
                }
            } catch (SQLException ex) {
                idExiste = 0;
            }

            if (idExiste > 0) {

                ResultSet validado2 = udao.validarAcceso(user, pass);
                int idExiste2 = 0;

                try {
                    while (validado2.next()) {
                        idExiste2 = validado2.getInt(1);
                        tipoUsuario = validado2.getString(4);
                        estado = validado2.getString(5);
                    }
                } catch (SQLException ex) {
                    idExiste2 = 0;
                }

                System.out.println("ACCESOS idExiste2: " + idExiste2);
                if (idExiste2 > 0) {
                    if (estado.equals("ACTIVO")) {
                        request.getSession().setAttribute("usuarioSesion", user);
                        request.getSession().setAttribute("idUsuarioSesion", idExiste2);
                        request.getSession().setAttribute("perfilTipoUsuario", tipoUsuario);
                        if (tipoUsuario.equals("Agricultor")) {
                            request.getSession().setAttribute("mostrarAgronomo", "block");
                        } else {
                            request.getSession().setAttribute("mostrarAgronomo", "none");

                        }
                        request.getSession().setAttribute("displayNoneLogin", "none");
                        request.getSession().setAttribute("displayNoneUsuario", "block");
                        request.getSession().setAttribute("mostrarNotif", "");

                        udao.actualizarIntentosPermitidos(user, 3, "ACTIVO");

                        if (pagina.equals("Principal")) {
                            request.getRequestDispatcher(pagina + ".jsp").forward(request, response);
                        } else if (pagina.equals("Blog")) {
                            PublicacionesServlet as = new PublicacionesServlet();
                            as.doPost(request, response);
                        } else if (pagina.equals("Agronomos")) {
                            AgronomoServlet as = new AgronomoServlet();
                            as.doPost(request, response);
                        } else {
                            request.getRequestDispatcher(pagina + ".jsp").forward(request, response);
                        }
                    } else {
                        request.getSession().setAttribute("perfilTipoUsuario", "");
                        request.getSession().setAttribute("displayNoneLogin", "");
                        request.getSession().setAttribute("displayNoneUsuario", "none");
                        request.getSession().setAttribute("recuperaPassCuenta", "RecuperarCuenta");
                        request.getSession().setAttribute("ValorCuentaBloqueada", "¿Desea desbloquear su cuenta?");
                        request.getSession().setAttribute("mostrarNotif", "Su cuenta ha sido bloqueada.");
                        request.getRequestDispatcher(pagina + ".jsp").forward(request, response);
                    }
                } else {
                    String mensajeError = "";
                    String estadoUsuario = "";
                    request.getSession().setAttribute("perfilTipoUsuario", "");
                    request.getSession().setAttribute("usuarioSesion", "");
                    request.getSession().setAttribute("idUsuarioSesion", "");
                    request.getSession().setAttribute("displayNoneLogin", "");
                    request.getSession().setAttribute("displayNoneUsuario", "none");

                    if (cantidadIntentosRestantes == 3) {
                        cantidadIntentosRestantes = cantidadIntentosRestantes - 1;
                        request.getSession().setAttribute("recuperaPassCuenta", "RecuperarPassword");
                        request.getSession().setAttribute("ValorCuentaBloqueada", "¿Desea recuperar su contraseña?");
                        mensajeError = "Contraseña incorrecta.";
                        estadoUsuario = "ACTIVO";
                    } else if (cantidadIntentosRestantes == 2) {
                        cantidadIntentosRestantes = cantidadIntentosRestantes - 1;
                        request.getSession().setAttribute("recuperaPassCuenta", "RecuperarPassword");
                        request.getSession().setAttribute("ValorCuentaBloqueada", "¿Desea recuperar su contraseña?");
                        mensajeError = "Contraseña incorrecta. Lequeda un intento.";
                        estadoUsuario = "ACTIVO";
                    } else {
                        cantidadIntentosRestantes = 0;
                        request.getSession().setAttribute("bloqueado", null);
                        request.getSession().setAttribute("recuperaPassCuenta", "RecuperarCuenta");
                        request.getSession().setAttribute("ValorCuentaBloqueada", "¿Desea desbloquear su cuenta?");
                        mensajeError = "Contraseña incorrecta. Su cuenta ha sido bloqueada.";
                        estadoUsuario = "BLOQUEADO";
                    }

                    udao.actualizarIntentosPermitidos(user, cantidadIntentosRestantes, estadoUsuario);

                    request.getSession().setAttribute("mostrarNotif", mensajeError);
                    // request.getRequestDispatcher(pagina + ".jsp?error=" + "Le queda un intento.").forward(request, response);
                    request.getRequestDispatcher(pagina + ".jsp").forward(request, response);
                }

            } else {
                request.getSession().setAttribute("perfilTipoUsuario", "");
                request.getSession().setAttribute("usuarioSesion", "");
                request.getSession().setAttribute("idUsuarioSesion", "");
                request.getSession().setAttribute("displayNoneLogin", "");
                request.getSession().setAttribute("displayNoneUsuario", "none");
                request.getSession().setAttribute("mostrarNotif", "Usuario no existe.");
                request.getSession().setAttribute("ValorCuentaBloqueada", "");
                request.getRequestDispatcher(pagina + ".jsp").forward(request, response);
            }

        } else if (accion.equalsIgnoreCase("Registrar")) {
            String nombres = request.getParameter("txtNombres");
            String apellidos = request.getParameter("txtApellidos");
            String correo = request.getParameter("txtCorreo");
            String ciudad = request.getParameter("txtCiudad");
            String tipo = request.getParameter("txtTipo");
            String colegiatura = request.getParameter("txtColegiatura");
            String usuario = request.getParameter("txtUsuario").toUpperCase();
            String password = request.getParameter("txtPasswordReg");

            String validado = "";
            validado = udao.validarExistenciaUsuario(usuario);
            if (validado.equals("")) {
                validado = udao.registrarUsuario(usuario, password, tipo);
                if (validado.equals("")) {
                    if (tipo.equals("Agricultor")) {
                        validado = udao.registrarAgricultor(nombres, apellidos, correo, ciudad, tipo, usuario, password);
                    } else {
                        validado = udao.registrarAgronomo(nombres, apellidos, correo, ciudad, tipo, colegiatura, usuario, password);
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
                request.getSession().setAttribute("mostrarNotif", validado);
                request.getRequestDispatcher(pagina + ".jsp?msgOK=" + validado).forward(request, response);

            } else {
                request.getSession().setAttribute("mostrarNotif", validado);
                //request.getRequestDispatcher(pagina + ".jsp?error=" + validado).forward(request, response);
                if (pagina.equals("Blog")) {
                    request.getRequestDispatcher("PublicacionesServlet").forward(request, response);
                } else if (pagina.equals("Agronomos")) {
                    request.getRequestDispatcher("AgronomoServlet").forward(request, response);
                } else {
                    request.getRequestDispatcher(pagina + ".jsp?error=" + validado).forward(request, response);
                }

            }

        } else if (accion.equalsIgnoreCase("Cerrar Sesión")) {
            request.getSession().setAttribute("perfilTipoUsuario", "");
            request.getSession().setAttribute("usuarioSesion", "");
            request.getSession().setAttribute("idUsuarioSesion", "");
            request.getSession().setAttribute("mostrarAgronomo", "none");
            request.getSession().setAttribute("displayNoneLogin", "");
            request.getSession().setAttribute("displayNoneUsuario", "none");
            //request.getRequestDispatcher(pagina + ".jsp").forward(request, response);
            if (pagina.equals("Principal")) {
                request.getRequestDispatcher(pagina + ".jsp").forward(request, response);
            } else if (pagina.equals("Blog")) {
                PublicacionesServlet as = new PublicacionesServlet();
                as.doPost(request, response);
            } else if (pagina.equals("Agronomos")) {
                AgronomoServlet as = new AgronomoServlet();
                as.doPost(request, response);
            } else {
                request.getRequestDispatcher(pagina + ".jsp").forward(request, response);
            }

        } else if (accion.equals("Guardar")) {
            String usuario = request.getParameter("txtUsuario");
            String password = request.getParameter("txtPassword");
            String password2 = request.getParameter("txtPassword2");
            if (!password.equals(password2)) {
                request.setAttribute("OKPassword", "");
                request.setAttribute("ErrorPassword", "Las contraseñas deben ser iguales.");
                request.getRequestDispatcher("CambiarPassword.jsp").forward(request, response);
            } else {
                String existe = udao.validarExistenciaUsuario(usuario);
                if (existe.equals("El usuario ingresado ya existe.")) {
                    boolean cambio = udao.cambiarPassword(usuario, password);
                    if (cambio) {
                        request.setAttribute("ErrorPassword", "");
                        request.setAttribute("OKPassword", "Su contraseña fue actualizada con éxito. Vaya a la página de inicio para iniciar sesión.");
                        request.getRequestDispatcher("CambiarPassword.jsp").forward(request, response);
                    } else {
                        request.setAttribute("OKPassword", "");
                        request.setAttribute("ErrorPassword", "Ocurrió un error al cambiar su contraseña. Inténtele en unos minutos.");
                        request.getRequestDispatcher("CambiarPassword.jsp").forward(request, response);
                    }
                } else {
                    request.setAttribute("OKPassword", "");
                    request.setAttribute("ErrorPassword", "Usuario o contraseña incorrectos.");
                    request.getRequestDispatcher("CambiarPassword.jsp").forward(request, response);
                }

            }
        } else if (accion.equals("Guardar Cambios")) {
            Integer id = Integer.parseInt(request.getParameter("txtPerfilIdUsuario"));
            String nombres = request.getParameter("txtPerfilNombres");
            String apellidos = request.getParameter("txtPerfilApellidos");
            String correo = request.getParameter("txtPerfilCorreo");
            String ciudad = request.getParameter("txtPerfilCiudad");
            String tipo = request.getParameter("txtPerfilTipo");
            String colegiatura = "";
            String usuario = request.getParameter("txtPerfilUsuario");
            String password = request.getParameter("txtPerfilPassword");
            if (!tipo.equalsIgnoreCase("AGRICULTOR")) {
                colegiatura = request.getParameter("txtPerfilColegiatura");
            }

            boolean creado = udao.actualizarPerfil(id, nombres, apellidos, correo, ciudad, tipo, colegiatura, usuario, password);

            if (creado) {
                request.getSession().setAttribute("confirmacion", "Datos actualizados correctamente.");
            } else {
                request.getSession().setAttribute("confirmacion", "Ocurrió un error al intentar actualizar sus datos.");
            }
            request.getRequestDispatcher("EditarPerfil.jsp?").forward(request, response);
        } else if (accion.equalsIgnoreCase("X")) {
            request.getSession().setAttribute("mostrarNotif", "");
            if (pagina.equals("Blog")) {
                request.getRequestDispatcher("PublicacionesServlet").forward(request, response);
            } else if (pagina.equals("Agronomos")) {
                request.getRequestDispatcher("AgronomoServlet").forward(request, response);
            } else {
                request.getRequestDispatcher(pagina + ".jsp?").forward(request, response);
            }

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
