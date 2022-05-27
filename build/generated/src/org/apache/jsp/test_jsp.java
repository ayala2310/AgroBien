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

      out.write("<header>\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/estilosCSS.css\">\n");
      out.write("\n");
      out.write("    <style>\n");
      out.write("        html{\n");
      out.write("            width: 100%;\n");
      out.write("            height: 100%;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        body{\n");
      out.write("            width: 100%;\n");
      out.write("            height: 100%;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        div{\n");
      out.write("            width: 30%;\n");
      out.write("            height: 20%;\n");
      out.write("            display: none;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        #opc1{\n");
      out.write("            background: red;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        #opc2{\n");
      out.write("            background: green;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .visible{\n");
      out.write("            display: block;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("\n");
      out.write("    <script>\n");
      out.write("        document.querySelector(\"#elige\").addEventListener(\"change\", function () {\n");
      out.write("            if (this.value.length) {\n");
      out.write("                if (document.querySelector(\".visible\")) {\n");
      out.write("                    document.querySelector(\".visible\").className = \"\";\n");
      out.write("                }\n");
      out.write("                document.querySelector(\"#\" + this.value).className = \"visible\";\n");
      out.write("            }\n");
      out.write("        }, false);\n");
      out.write("    </script>\n");
      out.write("</header>\n");
      out.write("<div >\n");
      out.write("    <select name=\"elige\" id=\"elige\">\n");
      out.write("        <option value=\"\">Seleccione una opción</option>\n");
      out.write("        <option value=\"opc1\">Específico</option>\n");
      out.write("        <option value=\"opc2\">Comercial</option>\n");
      out.write("    </select>\n");
      out.write("    <div id = \"opc1\"></div>\n");
      out.write("    <div id = \"opc2\"></div>\n");
      out.write("</div>\n");
      out.write("<!--<ul class=\"menu\">\n");
      out.write("    <li>\n");
      out.write("        <a href=\"#slide1\">1</a>\n");
      out.write("    </li>\n");
      out.write("    <li>\n");
      out.write("        <a href=\"#slide2\">2</a>\n");
      out.write("    </li>\n");
      out.write("    <li>\n");
      out.write("        <a href=\"#slide3\">3</a>\n");
      out.write("    </li>\n");
      out.write("</ul>-->\n");
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
