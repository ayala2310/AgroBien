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
                padding: 0;
                background-color: white;
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
                width: 400px;
                height: 70%;
                border-radius: 8px;
                padding: 30px 20px;
                box-shadow: 2px 6px 10px 15px grey;
            }

            .title {
                font-size: 25px;
            }

            .inputContainer {
                position: relative;
                height: 45px;
                width: 100%;
                margin-bottom: 15px;
            }

            .input {
                position: absolute;
                top: -50px;
                left: 0px;
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
                top: -45px;
                left: -20px;
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
                top: -60px;
                left: 20px;
                font-size: 14px;
                font-weight: 600;
                color: purple;
            }

            .input:focus{
                border: 2px solid purple;
            }
          
         
            .icono{
                position: relative;
                top: -50px;
                left: 330px;
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
                top: -160px;
                left: 270px;
                cursor: pointer;
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
                <h3>Bienvenido a AgroBien</h3>
                <h1 class="title">Inicie sesión con su cuenta de usuario</h1><img class="logo" src="imagenes/logoPrincipal.png" alt="40" width="80"/>

                <div  class="columna columna2">
                    
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
                <input type="submit" class="submitBtn" name="accion" value="Iniciar Sesión">
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
            </form>

        </div>
    </body>
</html>