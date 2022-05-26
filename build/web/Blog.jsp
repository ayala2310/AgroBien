<%-- 
    Document   : Blog
    Created on : 01/05/2022, 11:40:58 AM
    Author     : amontanez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <header>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/estilosCSS.css">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

        <script>
            function mostrar() {
                document.getElementById('panelComentario').style.display = 'block';
                document.getElementById('comentar').style.display = 'none';
                document.getElementById('guardar').style.display = 'block';
                document.getElementById('cancelar').style.display = 'block';
            }

            function ocultar() {
                document.getElementById('panelComentario').style.display = 'none';
                document.getElementById('comentar').style.display = 'block';
                document.getElementById('guardar').style.display = 'none';
                document.getElementById('cancelar').style.display = 'none';
            }
        </script>


        <!-- BARRA DE MENU PRINCIPAL-->
        <div class="navbar">
            <a class="active" href="Principal.jsp"><i class="fa fa-fw fa-home"></i> Inicio</a> 
            <a href="Blog.jsp"><i class="fa fa-fw fa-search"></i> Blog</a> 
            <a href="Agronomos.jsp"><i class="fa fa-fw fa-envelope"></i> Agrónomos</a> 
            <a href="Noticias.jsp"><i class="fa fa-fw fa-envelope"></i> Noticias</a> 
            <a href="Login.jsp"><i class="fa fa-fw fa-user"></i> Iniciar sesión</a>
            <a href="Registro.jsp"><span class="glyphicon glyphicon-user"></span> Registrarse</a>

        </div>


    </header>
    <body>
        <div><br></br></div>
        <main class="main">
            <br>

            <div class="columna columna1">
                <h5>Entidades Gubernamentales</h5>
                <p><a href="https://www.gob.pe/institucion/midagri/noticias">Noticias Ministerio de Agricultura</a></p>
                <p><a href="https://es-la.facebook.com/minagriperu/">Ministerio de Agricultura Facebook</a></p>
                <p><a href="https://www.gob.pe/institucion/midagri/noticias"><img src="imagenes/enlaceMidagri.png" alt="30" width="30"/></a></p>
            </div>

            <!-- COLUMNA CENTRAL -->
            <div class="columna columna2"> 
                <form >
                    <input type="search" placeholder="Buscar" >
                    <button  type="submit">Buscar</button>
                </form>

                <br><br>

                <form class="form" action="PublicacionesServlet?accion=insert" method="POST">
                    <div>
                        <input type="text" placeholder="Asunto" name="txtAsunto" required>
                    </div>
                    <div>
                        <textarea class="textArea" rows="3" name="txtCuerpo" required placeholder="Publicar dudas o sugerencias."></textarea>
                    </div>
                    <button type="submit" class="btn btn-success">Publicar</button>
                </form>

                <br><br>

                <h4><small>Publicaciones recientes</small></h4>


                <div >
                    <div class="panelBlog">
                        <h2>Cómo saber que plaguicida utilizar para el cacao</h2>
                        <h5><span ></span> Publicado por Anthony Montañez, 30 Abril, 2022.</h5>
                        <p>Nececito saber que tipo de plaguicidas utilizar para las plantaciones de cacao que tienen 6 meses. He intentado con el palaguicida A pero no obtuve buenos resultados.</p>
                        <span ><span >0</span> respuestas</span> 
                        <!--document.getElementById("element").style.display = "none";-->
                        <form  role="form">
                            <div id="panelComentario" class="form-group" style="display:none">
                                <textarea class="form-control" rows="3" required></textarea>
                            </div>
                            <button id="comentar" type="submit" class="btn btn-success" onclick="mostrar()">Comentar</button>
                            <button id="guardar" type="submit" class="btn btn-success" onclick="mostrar()" style="display:none">Guardar</button>
                            <button id="cancelar" type="submit" class="btn btn-success" onclick="ocultar()" style="display:none">Cancelar</button>
                        </form>
                    </div>
                    <br>

                </div>

                <div >
                    <c:forEach var="publicacion" items="${lista}">
                        <div class="panelBlog">
                            <h2><c:out value="${publicacion.asunto}"/></h2>
                            <h5><span ></span>Publicado por <c:out value="${publicacion.usuario}"/>, <c:out value="${publicacion.fecha}"/></h5>
                            <p><c:out value="${publicacion.cuerpo}"/></p>
                            <span ><span >0</span> respuestas</span> 
                            <!--document.getElementById("element").style.display = "none";-->
                            <form  role="form">
                                <div id="panelComentario" class="form-group" style="display:none">
                                    <textarea class="form-control" rows="3" required></textarea>
                                </div>
                                <button id="comentar" type="submit" class="btn btn-success" onclick="mostrar()">Comentar</button>
                                <button id="guardar" type="submit" class="btn btn-success" onclick="mostrar()" style="display:none">Guardar</button>
                                <button id="cancelar" type="submit" class="btn btn-success" onclick="ocultar()" style="display:none">Cancelar</button>
                            </form>
                        </div>
                        <br>
                    </c:forEach>
                </div>
            </div>


            <!-- COLUMNA DERECHA -->
            <div class="columna columna3">
                <h5>Organismos Locales</h5>
                <p><a href="#">Organismos Locales</a></p>
            </div>

        </main>
    </body>

    <footer class="footer">

        <div >
            <a href="#"><img src="imagenes/facebook.png" alt="30" width="30"/></a>
            <a href="#"><img src="imagenes/instagram.png" alt="30" width="30"/></a>
            <a href="#"><img src="imagenes/whatsapp.png" alt="30" width="30"/></a>
        </div>

        <div class="footer-center">
            <p>Derechos Reservados &copy; 2022</p>
        </div>

    </footer>
</html>
