package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Principal_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <header>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/estilosCSS.css\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\n");
      out.write("        <!-- ICONOS MENU PRINCIPAL-->\n");
      out.write("        <!--<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">-->\n");
      out.write("\n");
      out.write("        <!-- BARRA DE MENU PRINCIPAL-->\n");
      out.write("        <div class=\"navbar\">\n");
      out.write("            <a class=\"active\" href=\"Principal.jsp\"><i class=\"fa fa-fw fa-home\"></i> Inicio</a> \n");
      out.write("            <a href=\"PublicacionesServlet\"><i class=\"fa fa-fw fa-search\"></i> Blog</a> \n");
      out.write("            <a href=\"Agronomos.jsp\"><i class=\"fa fa-fw fa-envelope\"></i> Agrónomos</a> \n");
      out.write("            <a href=\"Noticias.jsp\"><i class=\"fa fa-fw fa-envelope\"></i> Noticias</a> \n");
      out.write("            <a href=\"Login.jsp\"><i class=\"fa fa-fw fa-user\"></i> Iniciar sesión</a>\n");
      out.write("            <a href=\"Registro.jsp\"><span class=\"glyphicon glyphicon-user\"></span> Registrarse</a>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </header>\n");
      out.write("\n");
      out.write("    <script>\n");
      out.write("        var modal = document.getElementById('Login');\n");
      out.write("\n");
      out.write("// When the user clicks anywhere outside of the modal, close it\n");
      out.write("        window.onclick = function (event) {\n");
      out.write("            if (event.target == modal) {\n");
      out.write("                modal.style.display = \"\";\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("    </script>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <p>usuario: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usuario}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("\n");
      out.write("        <div id=\"Login\" class=\"modal\" style=\"display:none\">\n");
      out.write("            <div class=\"card col-sm-10\">\n");
      out.write("                <div class=\"card-body\">\n");
      out.write("                    <form class=\"form-sign\" action=\"LogueoServlet\" method=\"POST\">\n");
      out.write("                        <div class=\"form-group  text-center\" >\n");
      out.write("                            <h3>Bienvenido a AgroBien</h3>\n");
      out.write("                            <img src=\"imagenes/logoPrincipal.png\" alt=\"70\" width=\"170\"/>\n");
      out.write("                            <!--<label>Bienvenidos al sistema</label>-->\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label>Usuario:</label>\n");
      out.write("                            <input type=\"text\" name=\"txtUsuario\" class=\"form-control\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label>Contraseña:</label>\n");
      out.write("                            <input type=\"password\" name=\"txtPassword\" class=\"form-control\">                            \n");
      out.write("                        </div>\n");
      out.write("                        <input type=\"submit\" name=\"accion\" value=\"login\" class=\"btn btn-primary btn-b\"> \n");
      out.write("                        <button type=\"button\" onclick=\"document.getElementById('Login').style.display = 'none'\" class=\"cancelbtn\">Cancel</button>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <!--<div class=\"alert alert-success\" role=\"alert\">\n");
      out.write("                    Notificación de ingreso satisfactorio.\n");
      out.write("                </div>\n");
      out.write("                -->\n");
      out.write("                ");

                    if (request.getParameter("error") == null) {

                    } else if (request.getParameter("error") != "") {
                
      out.write("\n");
      out.write("                <div id=\"msjError\" class=\"alert alert-danger\" role=\"alert\">\n");
      out.write("                    ");
      out.print(request.getParameter("error"));
      out.write("\n");
      out.write("                </div>\n");
      out.write("                ");

                    }
                
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                <div class=\"columna columna1\">\n");
      out.write("                    <p><a href=\"#\">Recuperar contraseña</a></p>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
