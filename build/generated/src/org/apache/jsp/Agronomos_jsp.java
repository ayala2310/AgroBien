package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Agronomos_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_out_value_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_out_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_out_value_nobody.release();
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
      out.write("\n");
      out.write("\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <title>AGRO BIEN INTEGRADOR II</title>\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Varela+Round\" rel=\"stylesheet\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/icon?family=Material+Icons\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">  \n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("        <style>\n");
      out.write("            body {\n");
      out.write("                font-family: 'Varela Round', sans-serif;\n");
      out.write("            }\n");
      out.write("            .form-control {\n");
      out.write("                box-shadow: none;\t\t\n");
      out.write("                font-weight: normal;\n");
      out.write("                font-size: 13px;\n");
      out.write("            }\n");
      out.write("            .form-control:focus {\n");
      out.write("                border-color: #33cabb;\n");
      out.write("                box-shadow: 0 0 8px rgba(0,0,0,0.1);\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .navbar {\n");
      out.write("                background: white;\n");
      out.write("                padding-left: 16px;\n");
      out.write("                padding-right: 16px;\n");
      out.write("                border-bottom: 1px solid #dfe3e8;\n");
      out.write("                border-radius: 0;\n");
      out.write("            }\n");
      out.write("            .nav img {\n");
      out.write("                border-radius: 50%;\n");
      out.write("                width: 36px;\n");
      out.write("                height: 36px;\n");
      out.write("                margin: -8px 0;\n");
      out.write("                float: left;\n");
      out.write("                margin-right: 10px;\n");
      out.write("            }\n");
      out.write("            .navbar .navbar-brand, .navbar .navbar-brand:hover, .navbar .navbar-brand:focus {\n");
      out.write("                padding-left: 0;\n");
      out.write("                font-size: 20px;\n");
      out.write("                padding-right: 50px;\n");
      out.write("            }\n");
      out.write("            .navbar .navbar-brand b {\n");
      out.write("                font-weight: bold;\n");
      out.write("                color: #33cabb;\t\t\n");
      out.write("            }\n");
      out.write("            .navbar .form-inline {\n");
      out.write("                display: inline-block;\n");
      out.write("            }\n");
      out.write("            .navbar .nav li {\n");
      out.write("                position: relative;\n");
      out.write("            }\n");
      out.write("            .navbar .nav li a {\n");
      out.write("                color: #888;\n");
      out.write("            }\n");
      out.write("            .search-box {\n");
      out.write("                position: relative;\n");
      out.write("            }\t\n");
      out.write("            .search-box input {\n");
      out.write("                padding-right: 35px;\n");
      out.write("                border-color: #dfe3e8;\n");
      out.write("                border-radius: 4px !important;\n");
      out.write("                box-shadow: none\n");
      out.write("            }\n");
      out.write("            .search-box .input-group-addon {\n");
      out.write("                min-width: 35px;\n");
      out.write("                border: none;\n");
      out.write("                background: transparent;\n");
      out.write("                position: absolute;\n");
      out.write("                right: 0;\n");
      out.write("                z-index: 9;\n");
      out.write("                padding: 7px;\n");
      out.write("                height: 100%;\n");
      out.write("            }\n");
      out.write("            .search-box i {\n");
      out.write("                color: #a0a5b1;\n");
      out.write("                font-size: 19px;\n");
      out.write("            }\n");
      out.write("            .navbar .nav .btn-primary, .navbar .nav .btn-primary:active {\n");
      out.write("                color: #fff;\n");
      out.write("                background: #33cabb;\n");
      out.write("                padding-top: 8px;\n");
      out.write("                padding-bottom: 6px;\n");
      out.write("                vertical-align: middle;\n");
      out.write("                border: none;\n");
      out.write("            }\t\n");
      out.write("            .navbar .nav .btn-primary:hover, .navbar .nav .btn-primary:focus {\t\t\n");
      out.write("                color: #fff;\n");
      out.write("                outline: none;\n");
      out.write("                background: #31bfb1;\n");
      out.write("            }\n");
      out.write("            .navbar .navbar-right li:first-child a {\n");
      out.write("                padding-right: 30px;\n");
      out.write("            }\n");
      out.write("            .navbar ul li i {\n");
      out.write("                font-size: 18px;\n");
      out.write("            }\n");
      out.write("            .navbar .dropdown-menu i {\n");
      out.write("                font-size: 16px;\n");
      out.write("                min-width: 22px;\n");
      out.write("            }\n");
      out.write("            .navbar ul.nav li.active a, .navbar ul.nav li.open > a {\n");
      out.write("                background: transparent !important;\n");
      out.write("            }\t\n");
      out.write("            .navbar .nav .get-started-btn {\n");
      out.write("                min-width: 120px;\n");
      out.write("                margin-top: 8px;\n");
      out.write("                margin-bottom: 8px;\n");
      out.write("            }\n");
      out.write("            .navbar ul.nav li.open > a.get-started-btn {\n");
      out.write("                color: #fff;\n");
      out.write("                background: #31bfb1 !important;\n");
      out.write("            }\n");
      out.write("            .navbar .dropdown-menu {\n");
      out.write("                border-radius: 1px;\n");
      out.write("                border-color: #e5e5e5;\n");
      out.write("                box-shadow: 0 2px 8px rgba(0,0,0,.05);\n");
      out.write("            }\n");
      out.write("            .navbar .nav .dropdown-menu li {\n");
      out.write("                color: #999;\n");
      out.write("                font-weight: normal;\n");
      out.write("            }\n");
      out.write("            .navbar .nav .dropdown-menu li a, .navbar .nav .dropdown-menu li a:hover, .navbar .nav .dropdown-menu li a:focus {\n");
      out.write("                padding: 8px 20px;\n");
      out.write("                line-height: normal;\n");
      out.write("            }\n");
      out.write("            .navbar .navbar-form {\n");
      out.write("                border: none;\n");
      out.write("            }\n");
      out.write("            .navbar .dropdown-menu.form-wrapper {\n");
      out.write("                width: 280px;\n");
      out.write("                padding: 20px;\n");
      out.write("                left: auto;\n");
      out.write("                right: 0;\n");
      out.write("                font-size: 14px;\n");
      out.write("            }\n");
      out.write("            .navbar .dropdown-menu.form-wrapper a {\t\t\n");
      out.write("                color: #33cabb;\n");
      out.write("                padding: 0 !important;\n");
      out.write("            }\n");
      out.write("            .navbar .dropdown-menu.form-wrapper a:hover{\n");
      out.write("                text-decoration: underline;\n");
      out.write("            }\n");
      out.write("            .navbar .form-wrapper .hint-text {\n");
      out.write("                text-align: center;\n");
      out.write("                margin-bottom: 15px;\n");
      out.write("                font-size: 13px;\n");
      out.write("            }\n");
      out.write("            .navbar .form-wrapper .social-btn .btn, .navbar .form-wrapper .social-btn .btn:hover {\n");
      out.write("                color: #fff;\n");
      out.write("                margin: 0;\n");
      out.write("                padding: 0 !important;\n");
      out.write("                font-size: 13px;\n");
      out.write("                border: none;\n");
      out.write("                transition: all 0.4s;\n");
      out.write("                text-align: center;\n");
      out.write("                line-height: 34px;\n");
      out.write("                width: 47%;\n");
      out.write("                text-decoration: none;\n");
      out.write("            }\t\n");
      out.write("            .navbar .social-btn .btn-primary {\n");
      out.write("                background: #507cc0;\n");
      out.write("            }\n");
      out.write("            .navbar .social-btn .btn-primary:hover {\n");
      out.write("                background: #4676bd;\n");
      out.write("            }\n");
      out.write("            .navbar .social-btn .btn-info {\n");
      out.write("                background: #64ccf1;\n");
      out.write("            }\n");
      out.write("            .navbar .social-btn .btn-info:hover {\n");
      out.write("                background: #4ec7ef;\n");
      out.write("            }\n");
      out.write("            .navbar .social-btn .btn i {\n");
      out.write("                margin-right: 5px;\n");
      out.write("                font-size: 16px;\n");
      out.write("                position: relative;\n");
      out.write("                top: 2px;\n");
      out.write("            }\n");
      out.write("            .navbar .form-wrapper .form-footer {\n");
      out.write("                text-align: center;\n");
      out.write("                padding-top: 10px;\n");
      out.write("                font-size: 13px;\n");
      out.write("            }\n");
      out.write("            .navbar .form-wrapper .form-footer a:hover{\n");
      out.write("                text-decoration: underline;\n");
      out.write("            }\n");
      out.write("            .navbar .form-wrapper .checkbox-inline input {\n");
      out.write("                margin-top: 3px;\n");
      out.write("            }\n");
      out.write("            .or-seperator {\n");
      out.write("                margin-top: 32px;\n");
      out.write("                text-align: center;\n");
      out.write("                border-top: 1px solid #e0e0e0;\n");
      out.write("            }\n");
      out.write("            .or-seperator b {\n");
      out.write("                color: #666;\n");
      out.write("                padding: 0 8px;\n");
      out.write("                width: 30px;\n");
      out.write("                height: 30px;\n");
      out.write("                font-size: 13px;\n");
      out.write("                text-align: center;\n");
      out.write("                line-height: 26px;\n");
      out.write("                background: #fff;\n");
      out.write("                display: inline-block;\n");
      out.write("                border: 1px solid #e0e0e0;\n");
      out.write("                border-radius: 50%;\n");
      out.write("                position: relative;\n");
      out.write("                top: -15px;\n");
      out.write("                z-index: 1;\n");
      out.write("            }\n");
      out.write("            .navbar .checkbox-inline {\n");
      out.write("                font-size: 13px;\n");
      out.write("            }\n");
      out.write("            .navbar .navbar-right .dropdown-toggle::after {\n");
      out.write("                display: none;\n");
      out.write("            }\n");
      out.write("            @media (min-width: 1200px){\n");
      out.write("                .form-inline .input-group {\n");
      out.write("                    width: 300px;\n");
      out.write("                    margin-left: 30px;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("            @media (max-width: 768px){\n");
      out.write("                .navbar .dropdown-menu.form-wrapper {\n");
      out.write("                    width: 100%;\n");
      out.write("                    padding: 10px 15px;\n");
      out.write("                    background: transparent;\n");
      out.write("                    border: none;\n");
      out.write("                }\n");
      out.write("                .navbar .form-inline {\n");
      out.write("                    display: block;\n");
      out.write("                }\n");
      out.write("                .navbar .input-group {\n");
      out.write("                    width: 100%;\n");
      out.write("                }\n");
      out.write("                .navbar .nav .btn-primary, .navbar .nav .btn-primary:active {\n");
      out.write("                    display: block;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("            /*  estilos del fondo principal */\n");
      out.write("            .container-all{\n");
      out.write("                position:fixed;\n");
      out.write("                max-width: 900px;\n");
      out.write("                width: 100%;\n");
      out.write("                left: 17%;\n");
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
      out.write("            .paginaSlider{\n");
      out.write("                position: absolute;\n");
      out.write("                bottom: 20px;\n");
      out.write("                left: 0;\n");
      out.write("                display: flex;\n");
      out.write("                flex-wrap: wrap;\n");
      out.write("                align-items: center;\n");
      out.write("                justify-content: center;\n");
      out.write("                width: 100%;\n");
      out.write("            }\n");
      out.write("            .paginaSlider-item{\n");
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
      out.write("            .paginaSlider-item:hover{\n");
      out.write("                transform: scale(3);\n");
      out.write("            }\n");
      out.write("            .paginaSlider-item img{\n");
      out.write("                display: inline-block;\n");
      out.write("                max-width: none;\n");
      out.write("                height: 100%;\n");
      out.write("                transform: scale(1);\n");
      out.write("                opacity: 1;\n");
      out.write("                transition:  all 900ms;                 \n");
      out.write("            }\n");
      out.write("            .paginaSlider-item:hover img{\n");
      out.write("                opacity: 1;\n");
      out.write("                transform: scale(1);\n");
      out.write("            }\n");
      out.write("            input[id=\"1\"]:checked ~ .slide{\n");
      out.write("                animation: none;\n");
      out.write("                transform: translate3d(0,0,0);\n");
      out.write("            }\n");
      out.write("            input[id=\"1\"]:checked ~ .paginaSlider .paginaSlider-item[for=\"1\"]{\n");
      out.write("                background: #fff;\n");
      out.write("            }\n");
      out.write("            input[id=\"2\"]:checked ~ .slide{\n");
      out.write("                animation: none;\n");
      out.write("                transform: translate3d(calc(-100% * 1),0,0);\n");
      out.write("            }\n");
      out.write("            input[id=\"2\"]:checked ~ .paginaSlider .paginaSlider-item[for=\"2\"]{\n");
      out.write("                background: #fff;\n");
      out.write("            }\n");
      out.write("            input[id=\"3\"]:checked ~ .slide{\n");
      out.write("                animation: none;\n");
      out.write("                transform: translate3d(calc(-100% * 2),0,0);\n");
      out.write("            }\n");
      out.write("            input[id=\"3\"]:checked ~ .paginaSlider .paginaSlider-item[for=\"3\"]{\n");
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
      out.write("\n");
      out.write("            .icono{\n");
      out.write("                position: relative;\n");
      out.write("                top: -25px;\n");
      out.write("                left: 200px;\n");
      out.write("                margin-left: auto;\n");
      out.write("                cursor: pointer;\n");
      out.write("                padding: 0px 0px;\n");
      out.write("                height: 1%;\n");
      out.write("                width: 1%;\n");
      out.write("            }\n");
      out.write("\n");
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
      out.write("                padding: 3px 20px;\n");
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
      out.write("            .columnaBlog{\n");
      out.write("                float:left;\n");
      out.write("            }\n");
      out.write("            .columnaBlog1 {\n");
      out.write("                width:15%;\n");
      out.write("            }\n");
      out.write("            .columnaBlog2 {\n");
      out.write("                width:70%;\n");
      out.write("            }  \n");
      out.write("            .columnaBlog3 {\n");
      out.write("                width:15%;\n");
      out.write("            }\n");
      out.write("            .inputContainer {\n");
      out.write("                position: relative;\n");
      out.write("                height: 45px;\n");
      out.write("                width: 65%;\n");
      out.write("                margin-bottom: 15px;\n");
      out.write("                left: -15px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .input {\n");
      out.write("                position: absolute;\n");
      out.write("                top: 0px;\n");
      out.write("                left: 30px;\n");
      out.write("                height: 100%;\n");
      out.write("                width: 150%;\n");
      out.write("                border: 1px solid #DADCE0;\n");
      out.write("                border-radius: 7px;\n");
      out.write("                font-size: 16px;\n");
      out.write("                padding: 0 20px;\n");
      out.write("                outline: none;\n");
      out.write("                background: none;\n");
      out.write("            }\n");
      out.write("            .input:focus{\n");
      out.write("                border: 1px solid #1aafa0;\n");
      out.write("            }\n");
      out.write("            .submitBtn {\n");
      out.write("                position: relative;\n");
      out.write("                top: 0px;\n");
      out.write("                left: -70px;\n");
      out.write("                display: block;\n");
      out.write("                margin-left: auto;\n");
      out.write("                padding: 15px 30px;\n");
      out.write("                border: none;\n");
      out.write("                background-color:#31bfb1;\n");
      out.write("                color: white;\n");
      out.write("                border-radius: 6px;\n");
      out.write("                cursor: pointer;\n");
      out.write("                font-size: 16px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .submitBtn:hover {\n");
      out.write("                background-color: #1aafa0;\n");
      out.write("            }\n");
      out.write("            .label {\n");
      out.write("                position: absolute;\n");
      out.write("                display: inline-block;\n");
      out.write("                background: blue;\n");
      out.write("                background-color: white;\n");
      out.write("                top: -6px;\n");
      out.write("                left: 45px;\n");
      out.write("                font-size: 10px;\n");
      out.write("                color: #1aafa0;\n");
      out.write("            }\n");
      out.write("            .label1 {\n");
      out.write("                position: absolute;\n");
      out.write("                display: inline-block;\n");
      out.write("                background: blue;\n");
      out.write("                background-color: white;\n");
      out.write("                top: 46px;\n");
      out.write("                left: 15px;\n");
      out.write("                font-size: 10px;\n");
      out.write("                color: #1aafa0;\n");
      out.write("            }\n");
      out.write("            .label2 {\n");
      out.write("                position: absolute;\n");
      out.write("                display: inline-block;\n");
      out.write("                background: blue;\n");
      out.write("                background-color: white;\n");
      out.write("                top: 96px;\n");
      out.write("                left: 15px;\n");
      out.write("                font-size: 10px;\n");
      out.write("                color: #1aafa0;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("            .main {\n");
      out.write("                padding: 106px;\n");
      out.write("                margin-top: -50px;\n");
      out.write("                height: 1500px; /* Used in this example to enable scrolling */\n");
      out.write("            }\n");
      out.write("            .textArea{\n");
      out.write("                width: 50%;\n");
      out.write("                max-width: 900px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("        <script>\n");
      out.write("\n");
      out.write("\n");
      out.write("            function mostrarContrasena() {\n");
      out.write("                var tipo = document.getElementById(\"password\");\n");
      out.write("                if (tipo.type === \"password\") {\n");
      out.write("                    tipo.type = \"text\";\n");
      out.write("                } else {\n");
      out.write("                    tipo.type = \"password\";\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            function mostrar() {\n");
      out.write("                document.getElementById('panelComentario').style.display = 'block';\n");
      out.write("                document.getElementById('comentar').style.display = 'none';\n");
      out.write("                document.getElementById('guardar').style.display = 'block';\n");
      out.write("                document.getElementById('cancelar').style.display = 'block';\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            function ocultar() {\n");
      out.write("                document.getElementById('panelComentario').style.display = 'none';\n");
      out.write("                document.getElementById('comentar').style.display = 'block';\n");
      out.write("                document.getElementById('guardar').style.display = 'none';\n");
      out.write("                document.getElementById('cancelar').style.display = 'none';\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            // Prevent dropdown menu from closing when click inside the form\n");
      out.write("            $(document).on(\"click\", \".navbar-right .dropdown-menu\", function (e) {\n");
      out.write("                e.stopPropagation();\n");
      out.write("            });\n");
      out.write("\n");
      out.write("\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("        <nav class=\"navbar navbar-default navbar-expand-lg navbar-light\">\n");
      out.write("            <div class=\"navbar-header\">\n");
      out.write("                <a class=\"navbar-brand\" href=\"#\">Agro<b>Bien</b></a>  \t\t\n");
      out.write("                <!--\n");
      out.write("                <button type=\"button\" data-target=\"#navbarCollapse\" data-toggle=\"collapse\" class=\"navbar-toggle\">\n");
      out.write("                    <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                </button>\n");
      out.write("                -->\n");
      out.write("            </div>\n");
      out.write("            <!-- Collection of nav links, forms, and other content for toggling -->\n");
      out.write("            <div id=\"navbarCollapse\" class=\"collapse navbar-collapse\">\n");
      out.write("                <ul class=\"nav navbar-nav\">\n");
      out.write("                    <li><a href=\"Principal.jsp\">Inicio</a></li>\n");
      out.write("                    <li><a href=\"Blog.jsp\">Blog</a></li>\t\n");
      out.write("                    <!--\n");
      out.write("                    <li class=\"dropdown\">\n");
      out.write("                            <a data-toggle=\"dropdown\" class=\"dropdown-toggle\" href=\"#\">Services <b class=\"caret\"></b></a>\n");
      out.write("                            <ul class=\"dropdown-menu\">\t\t\t\t\t\n");
      out.write("                                    <li><a href=\"#\">Web Design</a></li>\n");
      out.write("                                    <li><a href=\"#\">Web Development</a></li>\n");
      out.write("                                    <li><a href=\"#\">Graphic Design</a></li>\n");
      out.write("                                    <li><a href=\"#\">Digital Marketing</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                    </li>\n");
      out.write("                    -->\n");
      out.write("                    <li class=\"active\" style=\"display:");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mostrarAgronomo}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"><a href=\"AgronomoServlet\">Agrónomos</a></li>\n");
      out.write("                    <li><a href=\"Noticias.jsp\">Noticias</a></li>\n");
      out.write("\n");
      out.write("                </ul>\n");
      out.write("                <!--\n");
      out.write("                    <form class=\"navbar-form form-inline\">\n");
      out.write("                            <div class=\"input-group search-box\">\t\t\t\t\t\t\t\t\n");
      out.write("                                    <input type=\"text\" id=\"search\" class=\"form-control\" placeholder=\"Search here...\">\n");
      out.write("                                    <span class=\"input-group-addon\"><i class=\"material-icons\">&#xE8B6;</i></span>\n");
      out.write("                            </div>\n");
      out.write("                    </form>\n");
      out.write("                -->\n");
      out.write("\n");
      out.write("                <ul class=\"nav navbar-nav navbar-right\" style=\"display:");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${displayNoneUsuario}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                    <li class=\"dropdown\">\n");
      out.write("                        <a href=\"#\" data-toggle=\"dropdown\" class=\"dropdown-toggle user-action\"><img src=\"https://www.tutorialrepublic.com/examples/images/avatar/3.jpg\" class=\"avatar\" alt=\"Avatar\"> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usuarioSesion}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" <b class=\"caret\"></b></a>\n");
      out.write("                        <ul class=\"dropdown-menu\">\n");
      out.write("                            <li><a href=\"#\"><i class=\"fa fa-user-o\"></i> Profile</a></li>\n");
      out.write("                            <li><a href=\"#\"><i class=\"fa fa-calendar-o\"></i> Calendar</a></li>\n");
      out.write("                            <li><a href=\"#\"><i class=\"fa fa-sliders\"></i> Settings</a></li>\n");
      out.write("                            <li class=\"divider\"></li>\n");
      out.write("                            <form action=\"LogueoServlet\" method=\"POST\">\n");
      out.write("                                <input type=\"submit\" class=\"btn btn-primary btn-block\" name=\"accion\" value=\"Cerrar Sesión\">\n");
      out.write("                            </form>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                </ul>   \n");
      out.write("\n");
      out.write("                <ul class=\"nav navbar-nav navbar-right\" style=\"display:");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${displayNoneLogin}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                    <li>\n");
      out.write("                        <a data-toggle=\"dropdown\" class=\"dropdown-toggle\" href=\"#\">Iniciar Sesión</a>\n");
      out.write("                        <ul class=\"dropdown-menu form-wrapper\">\t\t\t\t\t\n");
      out.write("                            <li>\n");
      out.write("                                <form action=\"LogueoServlet\" method=\"POST\">\n");
      out.write("                                    <p class=\"hint-text\">Inicie sesión con su usuario y contraseña.</p>\n");
      out.write("                                    <!--\n");
      out.write("                                    <div class=\"form-group social-btn clearfix\">\n");
      out.write("                                        <a href=\"#\" class=\"btn btn-primary pull-left\"><i class=\"fa fa-facebook\"></i> Facebook</a>\n");
      out.write("                                        <a href=\"#\" class=\"btn btn-info pull-right\"><i class=\"fa fa-twitter\"></i> Twitter</a>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"or-seperator\"><b>or</b></div>\n");
      out.write("                                    -->\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <input type=\"text\" class=\"form-control\" name=\"txtUsuario\" placeholder=\"Username\" required=\"required\">\n");
      out.write("                                        <label for=\"\" class=\"label1\">Usuario</label>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <input type=\"password\" id=\"password\" class=\"form-control\" name=\"txtPassword\" placeholder=\"Password\" required=\"required\">\n");
      out.write("                                        <!--  <img id=\"icon1\" class=\"icono\" src=\"imagenes/iconoMostrar.png\" onclick=\"mostrarContrasena()\"/>-->\n");
      out.write("                                        <label for=\"\" class=\"label2\">Contraseña</label>\n");
      out.write("                                    </div>\n");
      out.write("                                    ");

                                        if (request.getParameter("error") == null) {

                                        } else if (request.getParameter("error") != "") {
                                    
      out.write("\n");
      out.write("                                    <div id=\"msjError\" class=\"alert alert-danger\" role=\"alert\">\n");
      out.write("                                        ");
      out.print(request.getParameter("error"));
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("                                    ");

                                        }
                                    
      out.write("\n");
      out.write("                                    <input type=\"submit\" class=\"btn btn-primary btn-block\" name=\"accion\" value=\"Iniciar Sesión\">\n");
      out.write("\n");
      out.write("                                    <div class=\"form-footer\">\n");
      out.write("                                        <a href=\"#\">¿Olvidó su contraseña?</a>\n");
      out.write("                                    </div>\n");
      out.write("                                </form>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                    <li><a href=\"#\" class=\"notifications\"><i class=\"fa fa-bell-o\"></i><span class=\"badge\">1</span></a></li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"#\" data-toggle=\"dropdown\" class=\"btn btn-primary dropdown-toggle get-started-btn mt-1 mb-1\">Registrarse</a>\n");
      out.write("                        <ul class=\"dropdown-menu\">\t\n");
      out.write("\n");
      out.write("                            <div class=\"signupFrm\">\n");
      out.write("                                <form class=\"form\" action=\"LogueoServlet\" method=\"POST\">\n");
      out.write("\n");
      out.write("                                    <div class=\"columna columna1\">\n");
      out.write("                                        <div class=\"inputContainer\">\n");
      out.write("                                            <input type=\"text\" class=\"input\" name=\"txtNombres\" placeholder=\"Juan\">\n");
      out.write("                                            <label for=\"\" class=\"label\">Nombres</label>\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("                                        <div class=\"inputContainer\">\n");
      out.write("                                            <input type=\"text\" class=\"input\" name=\"txtApellidos\" placeholder=\"Huamán\">\n");
      out.write("                                            <label for=\"\" class=\"label\">Apellidos</label>\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("                                        <div class=\"inputContainer\">\n");
      out.write("                                            <input type=\"email\" class=\"input\"  name=\"txtCorreo\" placeholder=\"juan@gmail.com\">\n");
      out.write("                                            <label for=\"\" class=\"label\">Correo</label>\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("                                        <div class=\"inputContainer\">\n");
      out.write("                                            <input type=\"text\" class=\"input\"  name=\"txtCiudad\" placeholder=\"Lima\">\n");
      out.write("                                            <label for=\"\" class=\"label\">Ciudad</label>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                    <div  class=\"columna columna2\">\n");
      out.write("\n");
      out.write("                                        <div class=\"inputContainer\">\n");
      out.write("                                            <select  class=\"input\" name=\"txtTipo\" id=\"tipo\" placeholder=\"\">\n");
      out.write("                                                <option hidden selected>Agricultor</option>\n");
      out.write("                                                <option class=\"input\" value=\"agricultor\">Agricultor</option>\n");
      out.write("                                                <option class=\"input\" value=\"agronomo\">Agrónomo</option>\n");
      out.write("                                            </select>\n");
      out.write("                                            <label class=\"label\"for=\"\">Tipo</label>\n");
      out.write("\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"inputContainer\">\n");
      out.write("                                            <input type=\"text\" class=\"input\"  name=\"txtColegiatura\" placeholder=\" \">\n");
      out.write("                                            <label for=\"\" class=\"label\">Nro Colegiatura</label>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"inputContainer\">\n");
      out.write("                                            <input type=\"text\" class=\"input\"  name=\"txtUsuario\" placeholder=\" \">\n");
      out.write("                                            <label for=\"\" class=\"label\">Nombre de Usuario</label>\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("                                        <div class=\"inputContainer\">\n");
      out.write("                                            <input type=\"password\" id=\"password\"  name=\"txtPassword\" class=\"input\" placeholder=\" \">\n");
      out.write("                                            <label for=\"\" class=\"label\">Contraseña</label>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <input type=\"submit\" class=\"submitBtn\" name=\"accion\" value=\"Registrar\">\n");
      out.write("                                    ");

                                        System.out.println("respuesta: " + request.getParameter("error"));
                                        String rspt = request.getParameter("error");
                                        String msg = request.getParameter("msgOK");
                                        System.out.println("respuesta msg: " + msg);
                                        if (rspt == null) {
                                            System.out.println("respuesta msg 0: " + msg);
                                            if (msg != "" && msg != null) {
                                                System.out.println("respuesta msg 1: OK");
                                    
      out.write("\n");
      out.write("                                    <div id=\"msjOK\" class=\"alertOK\" role=\"alert\">\n");
      out.write("                                        ");
      out.print(request.getParameter("msgOK"));
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("                                    ");

                                        }
                                    } else if (rspt != "") {

                                        System.out.println("respuesta msg 2: " + msg);

                                        if (msg == "OK") {

                                            System.out.println("respuesta msg 2: " + msg);

                                    
      out.write("\n");
      out.write("                                    <div id=\"msjOK\" class=\"alertOK\" role=\"alert\">\n");
      out.write("                                        ");
      out.print(request.getParameter("msgOK"));
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("                                    ");

                                    } else {

                                    
      out.write("\n");
      out.write("                                    <div id=\"msjError\" class=\"alertError\" role=\"alert\">\n");
      out.write("                                        ");
      out.print(request.getParameter("error"));
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("                                    ");

                                            }
                                        }
                                    
      out.write("\n");
      out.write("                                </form>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("\n");
      out.write("\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("\n");
      out.write("    </header> \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"table-responsive\">\n");
      out.write("                <div class=\"table-wrapper\">\n");
      out.write("                    <div class=\"table-title\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-sm-8\"><h2><b>Lista de Agrónomos</b></h2></div>\n");
      out.write("                            <div class=\"col-sm-4\">\n");
      out.write("                                <form class=\"navbar-form form-inline\">\n");
      out.write("                                    <div class=\"input-group search-box\">\t\t\t\t\t\t\t\t\n");
      out.write("                                        <input type=\"text\" id=\"search\" class=\"form-control\" placeholder=\"Ingrese una palabra que desee buscar.\">\n");
      out.write("                                        <span class=\"input-group-addon\"><i class=\"material-icons\">&#xE8B6;</i></span>\n");
      out.write("                                    </div>\n");
      out.write("                                </form>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <br>\n");
      out.write("                    <table class=\"table table-striped table-hover table-bordered\">\n");
      out.write("                        <thead>\n");
      out.write("                            <tr>\n");
      out.write("                                <th>#</th>\n");
      out.write("                                <th>NOMBRES</th>\n");
      out.write("                                <th>APELLIDOS</th>\n");
      out.write("                                <th>CIUDAD</th>\n");
      out.write("                                <th>CELULAR</th>\n");
      out.write("                            </tr>\n");
      out.write("                        </thead>\n");
      out.write("                        <tbody>\n");
      out.write("                            ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                        </tbody>\n");
      out.write("                    </table>\n");
      out.write("                    <div class=\"clearfix\">\n");
      out.write("                        <div class=\"hint-text\">Showing <b>5</b> out of <b>25</b> entries</div>\n");
      out.write("                        <ul class=\"pagination\">\n");
      out.write("                            <li class=\"page-item disabled\"><a href=\"#\"><i class=\"fa fa-angle-double-left\"></i></a></li>\n");
      out.write("                            <li class=\"page-item\"><a href=\"#\" class=\"page-link\">1</a></li>\n");
      out.write("                            <li class=\"page-item\"><a href=\"#\" class=\"page-link\">2</a></li>\n");
      out.write("                            <li class=\"page-item active\"><a href=\"#\" class=\"page-link\">3</a></li>\n");
      out.write("                            <li class=\"page-item\"><a href=\"#\" class=\"page-link\">4</a></li>\n");
      out.write("                            <li class=\"page-item\"><a href=\"#\" class=\"page-link\">5</a></li>\n");
      out.write("                            <li class=\"page-item\"><a href=\"#\" class=\"page-link\"><i class=\"fa fa-angle-double-right\"></i></a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>        \n");
      out.write("        </div>     \n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setVar("agronomo");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${lista}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                <tr>\n");
          out.write("                                    <td>0</td>\n");
          out.write("                                    <td>");
          if (_jspx_meth_c_out_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("</td>\n");
          out.write("                                    <td>");
          if (_jspx_meth_c_out_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("</td>\n");
          out.write("                                    <td>");
          if (_jspx_meth_c_out_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("</td>\n");
          out.write("                                    <td>");
          if (_jspx_meth_c_out_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("</td>\n");
          out.write("                                    <td>\n");
          out.write("                                        <a href=\"#\" class=\"view\" title=\"View\" data-toggle=\"tooltip\"><i class=\"material-icons\">&#xE417;</i></a>\n");
          out.write("                                        <a href=\"#\" class=\"edit\" title=\"Edit\" data-toggle=\"tooltip\"><i class=\"material-icons\">&#xE254;</i></a>\n");
          out.write("                                        <a href=\"#\" class=\"delete\" title=\"Delete\" data-toggle=\"tooltip\"><i class=\"material-icons\">&#xE872;</i></a>\n");
          out.write("                                    </td>\n");
          out.write("                                </tr>\n");
          out.write("                            ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_out_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_0.setPageContext(_jspx_page_context);
    _jspx_th_c_out_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${agronomo.nombres}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_0 = _jspx_th_c_out_0.doStartTag();
    if (_jspx_th_c_out_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
    return false;
  }

  private boolean _jspx_meth_c_out_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_1 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_1.setPageContext(_jspx_page_context);
    _jspx_th_c_out_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${agronomo.apellidos}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_1 = _jspx_th_c_out_1.doStartTag();
    if (_jspx_th_c_out_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_1);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_1);
    return false;
  }

  private boolean _jspx_meth_c_out_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_2 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_2.setPageContext(_jspx_page_context);
    _jspx_th_c_out_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_2.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${agronomo.ciudad}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_2 = _jspx_th_c_out_2.doStartTag();
    if (_jspx_th_c_out_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_2);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_2);
    return false;
  }

  private boolean _jspx_meth_c_out_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_3 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_3.setPageContext(_jspx_page_context);
    _jspx_th_c_out_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_3.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${agronomo.celular}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_3 = _jspx_th_c_out_3.doStartTag();
    if (_jspx_th_c_out_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_3);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_3);
    return false;
  }
}
