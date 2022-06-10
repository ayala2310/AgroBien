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

      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <style>\n");
      out.write("            body{\n");
      out.write("                display: flex;\n");
      out.write("                align-items: center;\n");
      out.write("                justify-content: center;\n");
      out.write("                padding: 30px;\n");
      out.write("            }\n");
      out.write("            img{\n");
      out.write("                max-width: 100%;\n");
      out.write("            }\n");
      out.write("            .container-all{\n");
      out.write("                position: relative;\n");
      out.write("                max-width: 800px;\n");
      out.write("                width: 100%;\n");
      out.write("                border-radius: 8px;\n");
      out.write("                overflow: hidden;\n");
      out.write("                box-shadow: 5px 5px 20px 1px ;\n");
      out.write("            }\n");
      out.write("            .slide{\n");
      out.write("                display: flex;\n");
      out.write("                transform: translate3d(0,0,0);\n");
      out.write("                transition: all 600ms;\n");
      out.write("                animation-name: autoplay;\n");
      out.write("                animation-duration: 10s;\n");
      out.write("                animation-direction:normal;\n");
      out.write("                animation-fill-mode: forwards;\n");
      out.write("                animation-iteration-count: infinite;\n");
      out.write("            }\n");
      out.write("            .item-slide{\n");
      out.write("                position: relative;\n");
      out.write("                display: flex;\n");
      out.write("                flex-direction: column;\n");
      out.write("                flex-shrink: 0;\n");
      out.write("                flex-grow: 0;\n");
      out.write("                max-width: 100%;\n");
      out.write("            }\n");
      out.write("            .pagination{\n");
      out.write("                position: absolute;\n");
      out.write("                bottom: 20px;\n");
      out.write("                left: 0;\n");
      out.write("                display: flex;\n");
      out.write("                flex-wrap: wrap;\n");
      out.write("                align-items: center;\n");
      out.write("                justify-content: center;\n");
      out.write("                width: 100%;\n");
      out.write("            }\n");
      out.write("            .pagination-item{\n");
      out.write("                display: flex;\n");
      out.write("                flex-direction: column;\n");
      out.write("                align-items: center;\n");
      out.write("                border: 2px solid white;\n");
      out.write("                width: 16px;\n");
      out.write("                height: 16px;\n");
      out.write("                border-radius: 4px;\n");
      out.write("                overflow: hidden;\n");
      out.write("                cursor: pointer;\n");
      out.write("                background: rgba(255,255,255, 0.5);\n");
      out.write("                margin: 0 10px;\n");
      out.write("                text-align: center;\n");
      out.write("                transition:  all 900ms;\n");
      out.write("            }\n");
      out.write("            .pagination-item:hover{\n");
      out.write("                transform: scale(3);\n");
      out.write("            }\n");
      out.write("            .pagination-item img{\n");
      out.write("                display: inline-block;\n");
      out.write("                max-width: none;\n");
      out.write("                height: 100%;\n");
      out.write("                transform: scale(1);\n");
      out.write("                opacity: 1;\n");
      out.write("                transition:  all 900ms;                 \n");
      out.write("            }\n");
      out.write("            .pagination-item:hover img{\n");
      out.write("                opacity: 1;\n");
      out.write("                transform: scale(1);\n");
      out.write("            }\n");
      out.write("            input[id=\"1\"]:checked ~ .slide{\n");
      out.write("                animation: none;\n");
      out.write("                transform: translate3d(0,0,0);\n");
      out.write("            }\n");
      out.write("            input[id=\"1\"]:checked ~ .pagination .pagination-item[for=\"1\"]{\n");
      out.write("                background: #fff;\n");
      out.write("            }\n");
      out.write("            input[id=\"2\"]:checked ~ .slide{\n");
      out.write("                animation: none;\n");
      out.write("                transform: translate3d(calc(-100% * 1),0,0);\n");
      out.write("            }\n");
      out.write("            input[id=\"2\"]:checked ~ .pagination .pagination-item[for=\"2\"]{\n");
      out.write("                background: #fff;\n");
      out.write("            }\n");
      out.write("            input[id=\"3\"]:checked ~ .slide{\n");
      out.write("                animation: none;\n");
      out.write("                transform: translate3d(calc(-100% * 2),0,0);\n");
      out.write("            }\n");
      out.write("            input[id=\"3\"]:checked ~ .pagination .pagination-item[for=\"3\"]{\n");
      out.write("                background: #fff;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            @keyframes autoplay{\n");
      out.write("                33%{\n");
      out.write("                    transform: translate3d(calc(-100% * 0),0,0);\n");
      out.write("                }\n");
      out.write("                66%{\n");
      out.write("                    transform: translate3d(calc(-100% * 1),0,0);\n");
      out.write("                }\n");
      out.write("                100%{\n");
      out.write("                    transform: translate3d(calc(-100% * 2),0,0);\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container-all\">\n");
      out.write("            <input type=\"radio\" id=\"1\" name=\"image-slide\" hidden/>\n");
      out.write("            <input type=\"radio\" id=\"2\" name=\"image-slide\" hidden/>\n");
      out.write("            <input type=\"radio\" id=\"3\" name=\"image-slide\" hidden/>\n");
      out.write("\n");
      out.write("            <div class=\"slide\">\n");
      out.write("                <div class=\"item-slide\">\n");
      out.write("                    <img src=\"imagenes/slide1.jpg\" width=\"800px\" height=\"500px\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"item-slide\">\n");
      out.write("                    <img src=\"imagenes/slide2.jpg\" width=\"800px\" height=\"500px\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"item-slide\">\n");
      out.write("                    <img src=\"imagenes/slide3.jpg\" width=\"800px\" height=\"500px\">\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"pagination\">\n");
      out.write("                <label class=\"pagination-item\" for=\"1\">\n");
      out.write("                    <img src=\"imagenes/slide1.jpg\"> \n");
      out.write("                </label>\n");
      out.write("                <label class=\"pagination-item\" for=\"2\">\n");
      out.write("                    <img src=\"imagenes/slide2.jpg\"> \n");
      out.write("                </label>\n");
      out.write("                <label class=\"pagination-item\" for=\"3\">\n");
      out.write("                    <img src=\"imagenes/slide3.jpg\"> \n");
      out.write("                </label>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("             <a class=\"prev\" onclick=\"plusSlides(-1)\">?</a>\n");
      out.write("            <a class=\"next\" onclick=\"plusSlides(1)\">?</a>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html> \n");
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
