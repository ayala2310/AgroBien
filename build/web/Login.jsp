<%-- 
    Document   : Login
    Created on : 01/05/2022, 11:31:30 AM
    Author     : amontanez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

    </head>

    <script type="text/javascript">

    </script>
    <body>
        <div id="Login" class="container mt-4 col-lg-4">
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
                    </form>
                </div>

                <!--<div class="alert alert-success" role="alert">
                    Notificación de ingreso satisfactorio.
                </div>
                -->
                <%
                    if (request.getParameter("error") == null) {
                        
                    }else if (request.getParameter("error") != "") {
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
