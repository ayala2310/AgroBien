package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class test_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Documento sin t&iacute;tulo</title>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=iso-8859-1\">\n");
      out.write("        <style>\n");
      out.write("            .tooltip{\n");
      out.write("\n");
      out.write(" \n");
      out.write("\n");
      out.write("display:none;\n");
      out.write("\n");
      out.write(" \n");
      out.write("\n");
      out.write("width:120px;\n");
      out.write("\n");
      out.write("height: 30px;\n");
      out.write("\n");
      out.write("color: #FFFFFF;\n");
      out.write("\n");
      out.write("background: #000000;\n");
      out.write("\n");
      out.write(" \n");
      out.write("\n");
      out.write("line-height: 20px;\n");
      out.write("\n");
      out.write("text-align: center;\n");
      out.write("\n");
      out.write("border-radius: 6px;\n");
      out.write("\n");
      out.write("font-size:12px;\n");
      out.write("\n");
      out.write(" \n");
      out.write("\n");
      out.write("margin-top: 10px;\n");
      out.write("\n");
      out.write("margin-left: 0px;\n");
      out.write("\n");
      out.write("border-top: 8px solid #000000;\n");
      out.write("\n");
      out.write(" \n");
      out.write("\n");
      out.write("opacity: 1;\n");
      out.write("\n");
      out.write(" \n");
      out.write("\n");
      out.write("}\n");
      out.write("        </style>\n");
      out.write("        \n");
      out.write("        <script>\n");
      out.write("            id = document.getElementById(\"tooltip\");\n");
      out.write("\n");
      out.write(" \n");
      out.write("\n");
      out.write("function dwec_tooltip(element, options){\n");
      out.write("\n");
      out.write("//Aqui puedes comprobar si el primer argumento que le pasas es una cadena y si es asi tendras que\n");
      out.write("\n");
      out.write("//usar la function getElementById para recuperar el objeto DOM del elemento\n");
      out.write("\n");
      out.write("    if(typeof element == \"string\"){\n");
      out.write("\n");
      out.write("    element = document.getElementById(element);\n");
      out.write("\n");
      out.write("    }\n");
      out.write("\n");
      out.write("//Aqui compruebas si el primer argumento es un objeto. Si es asi en realidad no tendrias que hacer nada mas.\n");
      out.write("\n");
      out.write("    if(typeof element == \"object\"){\n");
      out.write("\n");
      out.write("    element = element;\n");
      out.write("\n");
      out.write("    }\n");
      out.write("\n");
      out.write("//Ya que tenemos el elemento vamos a tomar su atributo y lo vamos a colocar dentro del div del tooltip\n");
      out.write("\n");
      out.write("// para poder mostrar un title diferente por cada input\n");
      out.write("\n");
      out.write("    atributo = element.getAttribute(\"title\");\n");
      out.write("\n");
      out.write("// Si existe un segundo argumento y es un objeto vamos a obtener de este el title y lo vamos a colocar dentro del div\n");
      out.write("\n");
      out.write("//del tooltip asi se puede personalizar el title.\n");
      out.write("\n");
      out.write("    if(typeof options == \"object\"){\n");
      out.write("\n");
      out.write("        atributo = options.title;\n");
      out.write("\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    id.innerHTML = atributo;\n");
      out.write("\n");
      out.write("//Por ultimo mostramos y ocultamos el div.\n");
      out.write("\n");
      out.write("//No ha quedado muy bien esta parte asi que sera cosa de revisarlo.\n");
      out.write("\n");
      out.write("    setTimeout(function() {\n");
      out.write("\n");
      out.write("        id.style.display=\"block\";\n");
      out.write("\n");
      out.write("    }, 300);\n");
      out.write("\n");
      out.write("    setTimeout(function() {\n");
      out.write("\n");
      out.write("        id.style.display=\"none\";\n");
      out.write("\n");
      out.write("    }, 1000);\n");
      out.write("\n");
      out.write("}\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("     <input name=\"\" type=\"text\" placeholder=\"Apartado\" onmouseover=\"dwec_tooltip(this,{title:'esto es un demo1'})\">\n");
      out.write("\n");
      out.write(" <input id=\"prueba1\" name=\"\" title=\"demo2\" type=\"text\" placeholder=\"Apartado\" onmouseover=\"dwec_tooltip('prueba1')\">\n");
      out.write("\n");
      out.write("<div class=\"tooltip\" id=\"tooltip\"></div>\n");
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
