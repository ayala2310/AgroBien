<%-- 
    Document   : newjsp
    Created on : 01/05/2022, 12:50:30 AM
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
        <!-- ICONOS MENU PRINCIPAL-->
        <!--<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">-->

        <!-- BARRA DE MENU PRINCIPAL-->
        <div class="navbar">
            <a class="active" href="Principal.jsp"><i class="fa fa-fw fa-home"></i> Inicio</a> 
            <a href="PublicacionesServlet"><i class="fa fa-fw fa-search"></i> Blog</a> 
            <a href="Agronomos.jsp"><i class="fa fa-fw fa-envelope"></i> Agrónomos</a> 
            <a href="Noticias.jsp"><i class="fa fa-fw fa-envelope"></i> Noticias</a> 
            <a href="Login.jsp"><i class="fa fa-fw fa-user"></i> Iniciar sesión</a>
            <a href="Registro.jsp"><span class="glyphicon glyphicon-user"></span> Registrarse</a>

        </div>

    </header>

    <script>
        var modal = document.getElementById('Login');

// When the user clicks anywhere outside of the modal, close it
        window.onclick = function (event) {
            if (event.target == modal) {
                modal.style.display = "";
            }
        }
    </script>

    <body>

        <p>usuario: ${usuario}</p>

        <div id="Login" class="modal" style="display:none">
            <div class="card col-sm-10">
                <div class="card-body">
                    <form class="form-sign" action="LogueoServlet" method="POST">
                        <div class="form-group  text-center" >
                            <h3>Bienvenido a AgroBien</h3>
                            <img src="imagenes/logoPrincipal.png" alt="70" width="170"/>
                            <!--<label>Bienvenidos al sistema</label>-->
                        </div>
                        <div class="form-group">
                            <label>Usuario:</label>
                            <input type="text" name="txtUsuario" class="form-control">
                        </div>
                        <div class="form-group">
                            <label>Contraseña:</label>
                            <input type="password" name="txtPassword" class="form-control">                            
                        </div>
                        <input type="submit" name="accion" value="login" class="btn btn-primary btn-b"> 
                        <button type="button" onclick="document.getElementById('Login').style.display = 'none'" class="cancelbtn">Cancel</button>
                    </form>
                </div>

                <!--<div class="alert alert-success" role="alert">
                    Notificación de ingreso satisfactorio.
                </div>
                -->
                <%
                    if (request.getParameter("error") == null) {

                    } else if (request.getParameter("error") != "") {
                %>
                <div id="msjError" class="alert alert-danger" role="alert">
                    <%=request.getParameter("error")%>
                </div>
                <%
                    }
                %>



                <div class="columna columna1">
                    <p><a href="#">Recuperar contraseña</a></p>
                </div>

            </div>

        </div>






    </body>
</html>
