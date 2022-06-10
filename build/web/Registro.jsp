<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <title>Document</title>
        <link rel="stylesheet" href="styles.css">

        <style>
            @import url('https://fonts.googleapis.com/css2?family=Lato&display=swap');

            /* Get rid of all default margins/paddings. Set typeface */
            body {
                box-sizing: border-box;
                margin: 0;
                background-color:#F7F2F1;
                font-family: "lato", sans-serif;
            }

            .signupFrm {
                display: flex;
                justify-content: center;
                align-items: center;
                height: 100%;
            }

            .form {
                background-color: white;
                width: 800px;
                height: 70%;
                border-radius: 8px;
                padding: 30px 20px;
                box-shadow: 2px 6px 10px 15px grey;
            }

            .title {
                font-size: 30px;
                margin-bottom: 35px;
            }

            .inputContainer {
                position: relative;
                height: 45px;
                width: 95%;
                margin-bottom: 15px;
            }

            .input {
                position: absolute;
                top: 0px;
                left: 30px;
                height: 100%;
                width: 100%;
                border: 1px solid #DADCE0;
                border-radius: 7px;
                font-size: 16px;
                padding: 0 20px;
                outline: none;
                background: none;
            }



            /* Hide the placeholder texts (a) */




            .submitBtn {
                position: relative;
                top: 15px;
                left: -70px;
                display: block;
                margin-left: auto;
                padding: 15px 30px;
                border: none;
                background-color:forestgreen;
                color: white;
                border-radius: 6px;
                cursor: pointer;
                font-size: 16px;
            }

            .submitBtn:hover {
                background-color: #0A9961;
                transform: translateY(-2px);
            }

            .label {
                position: absolute;
                display: inline-block;
                background: blue;
                background-color: white;
                top: -10px;
                left: 45px;
                font-size: 14px;
                font-weight: 600;
                color: purple;
            }

            .input:focus{
                border: 2px solid purple;
            }
            .columna{
                float:left;
            }
            .columna1 {
                width:45%;
            }
            .columna2 {
                width:45%;
            }

            .icono{
                position: relative;
                top: 1px;
                left: 310px;
                margin-left: auto;
                padding: 15px 30px;
                border: none;
                border-radius: 6px;
                cursor: pointer;
                font-size: 16px;
            }

            .logo{
                background-color: red;
                position: relative;
                top: -110px;
                left: -70px;
                cursor: pointer;
            }

            .alertError{
                color: red;
                font-size: 20px;
                font-weight: bold;
            }

            .alertOK{
                color: blue;
                font-size: 20px;
                font-weight: bold;
            }

        </style>

        <script>
            function mostrarContrasena() {
                var tipo = document.getElementById("password");
                if (tipo.type == "password") {
                    tipo.type = "text";
                    document.getElementById("icon1").display = none;
                    document.getElementById("icon2").display = none;
                } else {
                    tipo.type = "password";
                    document.getElementById("icon1").display = none;
                    document.getElementById("icon2").display = none
                }
            }
        </script>
    </head>
    <body>
        <div class="signupFrm">
            <form class="form" action="LogueoServlet" method="POST">
                <h1 class="title">    Registro de nuevo usuario</h1><a href="Principal.jsp"><img class="logo" src="imagenes/logoPrincipal.png" alt="40" width="80"/></a>

                <div class="columna columna1">
                    <div class="inputContainer">
                        <input type="text" class="input" name="txtNombres" placeholder="Juan">
                        <label for="" class="label">Nombres</label>
                    </div>

                    <div class="inputContainer">
                        <input type="text" class="input" name="txtApellidos" placeholder="Huamán">
                        <label for="" class="label">Apellidos</label>
                    </div>
                    <div class="inputContainer">
                        <input type="number" class="input" name="txtDni" placeholder="12345678">
                        <label for="" class="label">DNI</label>
                    </div>
                    <div class="inputContainer">
                        <input type="number" class="input" name="txtCelular"  placeholder="987654321">
                        <label for="" class="label">Celular</label>
                    </div>

                    <div class="inputContainer">
                        <input type="email" class="input"  name="txtCorreo" placeholder="juan@gmail.com">
                        <label for="" class="label">Correo</label>
                    </div>
                </div>


                <div  class="columna columna2">
                    <div class="inputContainer">
                        <input type="text" class="input"  name="txtCiudad" placeholder="Lima">
                        <label for="" class="label">Ciudad</label>
                    </div>
                    <div class="inputContainer">
                        <select  class="input" name="txtTipo" id="tipo" placeholder="">
                            <option hidden selected>Agricultor</option>
                            <option class="input" value="agricultor">Agricultor</option>
                            <option class="input" value="agronomo">Agrónomo</option>
                        </select>
                        <label class="label"for="">Tipo</label>

                    </div>
                    <div class="inputContainer">
                        <input type="text" class="input"  name="txtColegiatura" placeholder=" ">
                        <label for="" class="label">Nro Colegiatura</label>
                    </div>
                    <div class="inputContainer">
                        <input type="text" class="input"  name="txtUsuario" placeholder=" ">
                        <label for="" class="label">Nombre de Usuario</label>
                    </div>

                    <div class="inputContainer">
                        <input type="password" id="password"  name="txtPassword" class="input" placeholder=" ">
                        <label for="" class="label">Contraseña</label>
                        <img id="icon1" class="icono" src="imagenes/iconoMostrar.png" alt="10" width="20" onclick="mostrarContrasena()"/>
                    </div>
                </div>
                <input type="submit" class="submitBtn" name="accion" value="Registrar">
                <%
                    System.out.println("respuesta: " + request.getParameter("error"));
                    String rspt = request.getParameter("error");
                    String msg = request.getParameter("msgOK");
                    System.out.println("respuesta msg: " + msg);
                    if (rspt == null) {
                        System.out.println("respuesta msg 0: " + msg);
                        if (msg != "" && msg != null) {
                            System.out.println("respuesta msg 1: OK");

                %>
                <div id="msjOK" class="alertOK" role="alert">
                    <%=request.getParameter("msgOK")%>
                </div>
                <%
                    }
                } else if (rspt != "") {

                    System.out.println("respuesta msg 2: " + msg);

                    if (msg == "OK") {

                        System.out.println("respuesta msg 2: " + msg);

                %>
                <div id="msjOK" class="alertOK" role="alert">
                    <%=request.getParameter("msgOK")%>
                </div>
                <%
                } else {

                %>
                <div id="msjError" class="alertError" role="alert">
                    <%=request.getParameter("error")%>
                </div>
                <%
                        }
                    }
                %>
            </form>

        </div>
    </body>
</html>