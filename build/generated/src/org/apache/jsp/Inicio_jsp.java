package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Inicio_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/estilosCSS.css\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("\n");
      out.write("        <!-- ICONOS MENU PRINCIPAL-->\n");
      out.write("        <!--<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">-->\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <!-- BARRA DE MENU PRINCIPAL-->\n");
      out.write("        <div class=\"navbar\">\n");
      out.write("            <a class=\"active\" href=\"Inicio.jsp\"><i class=\"fa fa-fw fa-home\"></i> Inicio</a> \n");
      out.write("            <a href=\"Blog.jsp\"><i class=\"fa fa-fw fa-search\"></i> Blog</a> \n");
      out.write("            <a href=\"Agronomos.jsp\"><i class=\"fa fa-fw fa-envelope\"></i> Agrónomos</a> \n");
      out.write("            <a href=\"Noticias.jsp\"><i class=\"fa fa-fw fa-envelope\"></i> Noticias</a> \n");
      out.write("            <a href=\"Login.jsp\"><i class=\"fa fa-fw fa-user\"></i> Iniciar sesión</a>\n");
      out.write("            <a href=\"Registro.jsp\"><span class=\"glyphicon glyphicon-user\"></span> Registrarse</a>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"contenedor\">\n");
      out.write("             <img src=\"imagenes/logoPrincipal.png\" alt=\"70\" width=\"170\"/>\n");
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
