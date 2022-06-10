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

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("<style>\n");
      out.write("    body{\n");
      out.write("    margin: 0;\n");
      out.write("    padding: 0;\n");
      out.write("    width: 100%;\n");
      out.write("}\n");
      out.write("#hellobar-bar {\n");
      out.write("    font-family: \"Open Sans\", sans-serif;\n");
      out.write("    width: 100%;\n");
      out.write("    margin: 0;\n");
      out.write("    height: 30px;\n");
      out.write("    display: table;\n");
      out.write("    font-size: 17px;\n");
      out.write("    font-weight: 400;\n");
      out.write("    padding: .33em .5em;\n");
      out.write("    -webkit-font-smoothing: antialiased;\n");
      out.write("    color: #5c5e60;\n");
      out.write("    position: fixed;\n");
      out.write("    background-color: white;\n");
      out.write("    box-shadow: 0 1px 3px 2px rgba(0,0,0,0.15);\n");
      out.write("}\n");
      out.write("#hellobar-bar.regular {\n");
      out.write("    height: 30px;\n");
      out.write("    font-size: 14px;\n");
      out.write("    padding: .2em .5em;\n");
      out.write("}\n");
      out.write(".hb-content-wrapper {\n");
      out.write("    text-align: center;\n");
      out.write("    text-align: center;\n");
      out.write("    position: relative;\n");
      out.write("    display: table-cell;\n");
      out.write("    vertical-align: middle;\n");
      out.write("}\n");
      out.write(".hb-content-wrapper p {\n");
      out.write("    margin-top: 0;\n");
      out.write("    margin-bottom: 0;\n");
      out.write("}\n");
      out.write(".hb-text-wrapper {\n");
      out.write("    margin-right: .67em;\n");
      out.write("    display: inline-block;\n");
      out.write("    line-height: 1.3;\n");
      out.write("}\n");
      out.write(".hb-text-wrapper .hb-headline-text {\n");
      out.write("    font-size: 1em;\n");
      out.write("    display: inline-block;\n");
      out.write("    vertical-align: middle;\n");
      out.write("}\n");
      out.write("#hellobar-bar .hb-cta {\n");
      out.write("    display: inline-block;\n");
      out.write("    vertical-align: middle;\n");
      out.write("    margin: 5px 0;\n");
      out.write("    color: #ffffff;\n");
      out.write("    background-color: #22af73;\n");
      out.write("    border-color: #22af73\n");
      out.write("}\n");
      out.write(".hb-cta-button {\n");
      out.write("    opacity: 1;\n");
      out.write("    color: #fff;\n");
      out.write("    display: block;\n");
      out.write("    cursor: pointer;\n");
      out.write("    line-height: 1.5;\n");
      out.write("    max-width: 22.5em;\n");
      out.write("    text-align: center;\n");
      out.write("    position: relative;\n");
      out.write("    border-radius: 3px;\n");
      out.write("    white-space: nowrap;\n");
      out.write("    margin: 1.75em auto 0;\n");
      out.write("    text-decoration: none;\n");
      out.write("    padding: 0;\n");
      out.write("    overflow: hidden;\n");
      out.write("}\n");
      out.write(".hb-cta-button .hb-text-holder {\n");
      out.write("    border-radius: inherit;\n");
      out.write("    padding: 5px 15px;\n");
      out.write("}\n");
      out.write(".hb-close-wrapper {\n");
      out.write("    display: table-cell;\n");
      out.write("    width: 1.6em;\n");
      out.write("}\n");
      out.write(".hb-close-wrapper .icon-close {\n");
      out.write("    font-size: 14px;\n");
      out.write("    top: 15px;\n");
      out.write("    right: 25px;\n");
      out.write("    width: 15px;\n");
      out.write("    height: 15px;\n");
      out.write("    opacity: .3;\n");
      out.write("    color: #000;\n");
      out.write("    cursor: pointer;\n");
      out.write("    position: absolute;\n");
      out.write("    text-align: center;\n");
      out.write("    line-height: 15px;\n");
      out.write("    z-index: 1000;\n");
      out.write("    text-decoration: none;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <a href=\"javascript:void(0);\" class=\"icon-close\" onclick=\"$('#hellobar-bar').fadeOut()\">?</a>\n");
      out.write("<div id=\"hellobar-bar\" class=\"regular closable\">\n");
      out.write("    <div class=\"hb-content-wrapper\">\n");
      out.write("        <div class=\"hb-text-wrapper\">\n");
      out.write("            <div class=\"hb-headline-text\">\n");
      out.write("                <p><span>Regístrate ya en programacion.net y accederas a multitud de tutoriales gratuitos</span></p>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <a href=\"http://www.programacion.net\" target=\"_blank\" class=\"hb-cta hb-cta-button\">\n");
      out.write("            <div class=\"hb-text-holder\">\n");
      out.write("                <p>Regístrate</p>\n");
      out.write("            </div>\n");
      out.write("        </a>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"hb-close-wrapper\">\n");
      out.write("        <a href=\"javascript:void(0);\" class=\"icon-close\">?</a>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("</body>\n");
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
