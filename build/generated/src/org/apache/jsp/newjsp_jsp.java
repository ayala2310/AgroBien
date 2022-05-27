package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class newjsp_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\n");
      out.write("        <title>Document</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"styles.css\">\n");
      out.write("\n");
      out.write("        <style>\n");
      out.write("            @import url('https://fonts.googleapis.com/css2?family=Lato&display=swap');\n");
      out.write("\n");
      out.write("            /* Get rid of all default margins/paddings. Set typeface */\n");
      out.write("            body {\n");
      out.write("                box-sizing: border-box;\n");
      out.write("                margin: 0;\n");
      out.write("                padding: 0;\n");
      out.write("                background-color: white;\n");
      out.write("                font-family: \"lato\", sans-serif;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .signupFrm {\n");
      out.write("                display: flex;\n");
      out.write("                justify-content: center;\n");
      out.write("                align-items: center;\n");
      out.write("                height: 100%;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .form {\n");
      out.write("                background-color: white;\n");
      out.write("                width: 800px;\n");
      out.write("                height: 70%;\n");
      out.write("                border-radius: 8px;\n");
      out.write("                padding: 30px 20px;\n");
      out.write("                box-shadow: 2px 6px 10px 15px grey;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .title {\n");
      out.write("                font-size: 30px;\n");
      out.write("                margin-bottom: 35px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .inputContainer {\n");
      out.write("                position: relative;\n");
      out.write("                height: 45px;\n");
      out.write("                width: 95%;\n");
      out.write("                margin-bottom: 15px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .input {\n");
      out.write("                position: absolute;\n");
      out.write("                top: 0px;\n");
      out.write("                left: 30px;\n");
      out.write("                height: 100%;\n");
      out.write("                width: 100%;\n");
      out.write("                border: 1px solid #DADCE0;\n");
      out.write("                border-radius: 7px;\n");
      out.write("                font-size: 16px;\n");
      out.write("                padding: 0 20px;\n");
      out.write("                outline: none;\n");
      out.write("                background: none;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            /* Hide the placeholder texts (a) */\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            .submitBtn {\n");
      out.write("                position: relative;\n");
      out.write("                top: 15px;\n");
      out.write("                left: -70px;\n");
      out.write("                display: block;\n");
      out.write("                margin-left: auto;\n");
      out.write("                padding: 15px 30px;\n");
      out.write("                border: none;\n");
      out.write("                background-color:forestgreen;\n");
      out.write("                color: white;\n");
      out.write("                border-radius: 6px;\n");
      out.write("                cursor: pointer;\n");
      out.write("                font-size: 16px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .submitBtn:hover {\n");
      out.write("                background-color: #0A9961;\n");
      out.write("                transform: translateY(-2px);\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .label {\n");
      out.write("                position: absolute;\n");
      out.write("                display: inline-block;\n");
      out.write("                background: blue;\n");
      out.write("                background-color: white;\n");
      out.write("                top: -10px;\n");
      out.write("                left: 45px;\n");
      out.write("                font-size: 14px;\n");
      out.write("                font-weight: 600;\n");
      out.write("                color: purple;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .input:focus{\n");
      out.write("                border: 2px solid purple;\n");
      out.write("            }\n");
      out.write("            .columna{\n");
      out.write("                float:left;\n");
      out.write("            }\n");
      out.write("            .columna1 {\n");
      out.write("                width:45%;\n");
      out.write("            }\n");
      out.write("            .columna2 {\n");
      out.write("                width:45%;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .icono{\n");
      out.write("                position: relative;\n");
      out.write("                top: 1px;\n");
      out.write("                left: 310px;\n");
      out.write("                margin-left: auto;\n");
      out.write("                padding: 15px 30px;\n");
      out.write("                border: none;\n");
      out.write("                border-radius: 6px;\n");
      out.write("                cursor: pointer;\n");
      out.write("                font-size: 16px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .logo{\n");
      out.write("                background-color: red;\n");
      out.write("                position: relative;\n");
      out.write("                top: -110px;\n");
      out.write("                left: -70px;\n");
      out.write("                cursor: pointer;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("\n");
      out.write("        <script>\n");
      out.write("            function mostrarContrasena() {\n");
      out.write("                var tipo = document.getElementById(\"password\");\n");
      out.write("                if (tipo.type == \"password\") {\n");
      out.write("                    tipo.type = \"text\";\n");
      out.write("                    document.getElementById(\"icon1\").display = none;\n");
      out.write("                    document.getElementById(\"icon2\").display = none;\n");
      out.write("                } else {\n");
      out.write("                    tipo.type = \"password\";\n");
      out.write("                    document.getElementById(\"icon1\").display = none;\n");
      out.write("                    document.getElementById(\"icon2\").display = none\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"signupFrm\">\n");
      out.write("            <form class=\"form\" action=\"LogueoServlet\" method=\"POST\">\n");
      out.write("                <h3>Bienvenido a AgroBien</h3>\n");
      out.write("                <h1 class=\"title\">Inicie sesión con su cuenta de usuario</h1><img class=\"logo\" src=\"imagenes/logoPrincipal.png\" alt=\"40\" width=\"80\"/>\n");
      out.write("\n");
      out.write("                <div  class=\"columna columna2\">\n");
      out.write("                    \n");
      out.write("                    <div class=\"inputContainer\">\n");
      out.write("                        <input type=\"text\" class=\"input\"  name=\"txtUsuario\" placeholder=\" \">\n");
      out.write("                        <label for=\"\" class=\"label\">Nombre de Usuario</label>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"inputContainer\">\n");
      out.write("                        <input type=\"password\" id=\"password\"  name=\"txtPassword\" class=\"input\" placeholder=\" \">\n");
      out.write("                        <label for=\"\" class=\"label\">Contraseña</label>\n");
      out.write("                        <img id=\"icon1\" class=\"icono\" src=\"imagenes/iconoMostrar.png\" alt=\"10\" width=\"20\" onclick=\"mostrarContrasena()\"/>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <input type=\"submit\" class=\"submitBtn\" name=\"accion\" value=\"Registrar\">\n");
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
      out.write("            </form>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>");
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
