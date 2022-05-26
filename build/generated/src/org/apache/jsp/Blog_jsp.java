package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Blog_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/estilosCSS.css\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("        <script>\n");
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
      out.write("        </script>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- BARRA DE MENU PRINCIPAL-->\n");
      out.write("        <div class=\"navbar\">\n");
      out.write("            <a class=\"active\" href=\"Principal.jsp\"><i class=\"fa fa-fw fa-home\"></i> Inicio</a> \n");
      out.write("            <a href=\"Blog.jsp\"><i class=\"fa fa-fw fa-search\"></i> Blog</a> \n");
      out.write("            <a href=\"Agronomos.jsp\"><i class=\"fa fa-fw fa-envelope\"></i> Agrónomos</a> \n");
      out.write("            <a href=\"Noticias.jsp\"><i class=\"fa fa-fw fa-envelope\"></i> Noticias</a> \n");
      out.write("            <a href=\"Login.jsp\"><i class=\"fa fa-fw fa-user\"></i> Iniciar sesión</a>\n");
      out.write("            <a href=\"Registro.jsp\"><span class=\"glyphicon glyphicon-user\"></span> Registrarse</a>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </header>\n");
      out.write("    <body>\n");
      out.write("        <div><br></br></div>\n");
      out.write("        <main class=\"main\">\n");
      out.write("            <br>\n");
      out.write("\n");
      out.write("            <div class=\"columna columna1\">\n");
      out.write("                <h5>Entidades Gubernamentales</h5>\n");
      out.write("                <p><a href=\"https://www.gob.pe/institucion/midagri/noticias\">Noticias Ministerio de Agricultura</a></p>\n");
      out.write("                <p><a href=\"https://es-la.facebook.com/minagriperu/\">Ministerio de Agricultura Facebook</a></p>\n");
      out.write("                <p><a href=\"https://www.gob.pe/institucion/midagri/noticias\"><img src=\"imagenes/enlaceMidagri.png\" alt=\"30\" width=\"30\"/></a></p>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <!-- COLUMNA CENTRAL -->\n");
      out.write("            <div class=\"columna columna2\"> \n");
      out.write("                <form >\n");
      out.write("                    <input type=\"search\" placeholder=\"Buscar\" >\n");
      out.write("                    <button  type=\"submit\">Buscar</button>\n");
      out.write("                </form>\n");
      out.write("\n");
      out.write("                <br><br>\n");
      out.write("\n");
      out.write("                <form class=\"form\" action=\"PublicacionesServlet?accion=insert\" method=\"POST\">\n");
      out.write("                    <div>\n");
      out.write("                        <input type=\"text\" placeholder=\"Asunto\" name=\"txtAsunto\" required>\n");
      out.write("                    </div>\n");
      out.write("                    <div>\n");
      out.write("                        <textarea class=\"textArea\" rows=\"3\" name=\"txtCuerpo\" required placeholder=\"Publicar dudas o sugerencias.\"></textarea>\n");
      out.write("                    </div>\n");
      out.write("                    <button type=\"submit\" class=\"btn btn-success\">Publicar</button>\n");
      out.write("                </form>\n");
      out.write("\n");
      out.write("                <br><br>\n");
      out.write("\n");
      out.write("                <h4><small>Publicaciones recientes</small></h4>\n");
      out.write("\n");
      out.write("\n");
      out.write("                <div >\n");
      out.write("                    <div class=\"panelBlog\">\n");
      out.write("                        <h2>Cómo saber que plaguicida utilizar para el cacao</h2>\n");
      out.write("                        <h5><span ></span> Publicado por Anthony Montañez, 30 Abril, 2022.</h5>\n");
      out.write("                        <p>Nececito saber que tipo de plaguicidas utilizar para las plantaciones de cacao que tienen 6 meses. He intentado con el palaguicida A pero no obtuve buenos resultados.</p>\n");
      out.write("                        <span ><span >0</span> respuestas</span> \n");
      out.write("                        <!--document.getElementById(\"element\").style.display = \"none\";-->\n");
      out.write("                        <form  role=\"form\">\n");
      out.write("                            <div id=\"panelComentario\" class=\"form-group\" style=\"display:none\">\n");
      out.write("                                <textarea class=\"form-control\" rows=\"3\" required></textarea>\n");
      out.write("                            </div>\n");
      out.write("                            <button id=\"comentar\" type=\"submit\" class=\"btn btn-success\" onclick=\"mostrar()\">Comentar</button>\n");
      out.write("                            <button id=\"guardar\" type=\"submit\" class=\"btn btn-success\" onclick=\"mostrar()\" style=\"display:none\">Guardar</button>\n");
      out.write("                            <button id=\"cancelar\" type=\"submit\" class=\"btn btn-success\" onclick=\"ocultar()\" style=\"display:none\">Cancelar</button>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                    <br>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div >\n");
      out.write("                    ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("            <!-- COLUMNA DERECHA -->\n");
      out.write("            <div class=\"columna columna3\">\n");
      out.write("                <h5>Organismos Locales</h5>\n");
      out.write("                <p><a href=\"#\">Organismos Locales</a></p>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </main>\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("    <footer class=\"footer\">\n");
      out.write("\n");
      out.write("        <div >\n");
      out.write("            <a href=\"#\"><img src=\"imagenes/facebook.png\" alt=\"30\" width=\"30\"/></a>\n");
      out.write("            <a href=\"#\"><img src=\"imagenes/instagram.png\" alt=\"30\" width=\"30\"/></a>\n");
      out.write("            <a href=\"#\"><img src=\"imagenes/whatsapp.png\" alt=\"30\" width=\"30\"/></a>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"footer-center\">\n");
      out.write("            <p>Derechos Reservados &copy; 2022</p>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </footer>\n");
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
    _jspx_th_c_forEach_0.setVar("publicacion");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${lista}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                        <div class=\"panelBlog\">\n");
          out.write("                            <h2>");
          if (_jspx_meth_c_out_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("</h2>\n");
          out.write("                            <h5><span ></span>Publicado por ");
          if (_jspx_meth_c_out_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write(',');
          out.write(' ');
          if (_jspx_meth_c_out_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("</h5>\n");
          out.write("                            <p>");
          if (_jspx_meth_c_out_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("</p>\n");
          out.write("                            <span ><span >0</span> respuestas</span> \n");
          out.write("                            <!--document.getElementById(\"element\").style.display = \"none\";-->\n");
          out.write("                            <form  role=\"form\">\n");
          out.write("                                <div id=\"panelComentario\" class=\"form-group\" style=\"display:none\">\n");
          out.write("                                    <textarea class=\"form-control\" rows=\"3\" required></textarea>\n");
          out.write("                                </div>\n");
          out.write("                                <button id=\"comentar\" type=\"submit\" class=\"btn btn-success\" onclick=\"mostrar()\">Comentar</button>\n");
          out.write("                                <button id=\"guardar\" type=\"submit\" class=\"btn btn-success\" onclick=\"mostrar()\" style=\"display:none\">Guardar</button>\n");
          out.write("                                <button id=\"cancelar\" type=\"submit\" class=\"btn btn-success\" onclick=\"ocultar()\" style=\"display:none\">Cancelar</button>\n");
          out.write("                            </form>\n");
          out.write("                        </div>\n");
          out.write("                        <br>\n");
          out.write("                    ");
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
    _jspx_th_c_out_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${publicacion.asunto}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
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
    _jspx_th_c_out_1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${publicacion.usuario}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
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
    _jspx_th_c_out_2.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${publicacion.fecha}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
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
    _jspx_th_c_out_3.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${publicacion.cuerpo}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_3 = _jspx_th_c_out_3.doStartTag();
    if (_jspx_th_c_out_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_3);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_3);
    return false;
  }
}
