<%@page import="DAO.UsuarioDAO"%>
<html lang="en">
    <header>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <title>Document</title>
        <link rel="stylesheet" href="styles.css">

        <style>
            @import url('https://fonts.googleapis.com/css2?family=Lato&display=swap');

             html {
                min-height: 100%;
                position: relative;
            }
            body {
                box-sizing: border-box;
                margin: 0;
                padding: 0;
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
                height: 55px;
                width: 100%;
                margin-bottom: 15px;
            }

            .input {
                position: absolute;
                top: -50px;
                left: 0px;
                height: 80%;
                width: 100%;
                border: 1px solid #43A047;
                border-radius: 7px;
                font-size: 16px;
                outline: none;
            }



            /* Hide the placeholder texts (a) */




            .submitBtn {
                position: absolute;
                top: 480px;
                left: 800px;
                display: block;
                margin-left: auto;
                padding: 10px 10px;
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
                color: #43A047;
            }

            .input:focus{
                border: 2px solid #43A047;
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
                position: relative;
                top: -160px;
                left: 270px;
                cursor: pointer;
            }
            
             .footer {
                position: absolute;
                left: 0;
                bottom: 0;
                width: 100%;
                background-color: #1aafa0;
                color: white;
                text-align: center;
            }
            
             .ir-arriba {
                   top: 530px;
                height: 50px;
                display:none;
                cursor:pointer;
                position: fixed;
                bottom:20px;
                right:10px;
                background-color: #1aafa0;
                box-shadow: 0px 0px 10px;
            }

        </style>

        <script>
            function mostrarContrasena(idLinea) {
                var tipo;
                if (idLinea === "icon1") {
                    tipo = document.getElementById("password1");
                } else if (idLinea === "icon2") {
                    tipo = document.getElementById("password2");
                }

                if (tipo.type === "password") {
                    tipo.type = "text";
                    document.getElementById(idLinea).display = "";
                } else {
                    tipo.type = "password";
                    document.getElementById(idLinea).display = none;
                }

            }

            function fn_coincidirPassword() {
                alert()
            }
            
               $(document).ready(function () {

                $('.ir-arriba').click(function () {
                    $('body, html').animate({
                        scrollTop: '0px'
                    }, 300);
                });

                $(window).scroll(function () {
                    if ($(this).scrollTop() > 0) {
                        $('.ir-arriba').slideDown(300);
                    } else {
                        $('.ir-arriba').slideUp(300);
                    }
                });

            });
            
        </script>
    </header>
    <body>
        <div class="signupFrm">
            <div class="form">
                <h3>Bienvenido a AgroBien</h3>
                <h1 class="title">Hola, estás a un paso de cambiar tu contraseña.</h1><a href="Principal.jsp"><img class="logo" src="imagenes/logoPrincipal.png" alt="40" width="80" title="Portal web AgroBien"/></a>

                <div  class="columna columna2">
                    <form action="LogueoServlet" method="POST">
                        <div class="inputContainer">
                            <input type="search" name="txtUsuario" class="input"  placeholder=" " >
                            <label for="" class="label">Nombre de Usuario</label>
                        </div>

                        <div class="inputContainer">
                            <input type="password" id="password1"  name="txtPassword" class="input" placeholder=" " minlength="8">
                            <label for="" class="label">Nueva Contraseña</label>
                            <img id="icon1" class="icono" src="imagenes/iconoMostrar.png" alt="10" width="20" onclick="mostrarContrasena('icon1')"/>
                        </div>

                        <div class="inputContainer">
                            <input type="password" id="password2"  name="txtPassword2" class="input" placeholder=" " minlength="8">
                            <label for="" class="label">Repetir Contraseña</label>
                            <img id="icon2" class="icono" src="imagenes/iconoMostrar.png" alt="10" width="20" onclick="mostrarContrasena('icon2')"/>
                        </div>
                         <div>
                        <input type="submit" class="submitBtn" name="accion" value="Guardar">
                        </div>
                      
                        <div id="msjError" style="color:red" role="alert">
                            ${ErrorPassword}
                        </div>
                         <div id="msjOK" style="color:blue"role="alert">
                            ${OKPassword}
                        </div>
                       
                    </form>

                    <!--
                                        <div class="inputContainer">
                                            <input type="password" id="password3"  name="txtPassword" class="input" placeholder=" ">
                                            <label for="" class="label">Repetir Nueva Contraseña</label>
                                            <img id="icon3" class="icono" src="imagenes/iconoMostrar.png" alt="10" width="20" onclick="mostrarContrasena('icon3')"/>
                                        </div>
                                    </div>
                    -->

                </div>

            </div>
    
        <span class="ir-arriba"><img src="imagenes/volverArriba.png" alt="50" width="50"/></span>
        </body>
    
<script>
     /*.submitBtn {
            background-color:#31bfb1;
            color: white;
            cursor: pointer;
        }

        .submitBtn:hover {
            background-color: #1aafa0;
        }*/
    document.getElementById('txtCorreo').addEventListener('input', function () {
        campo = event.target;
        valido = document.getElementById('emailOK');

        emailRegex = /^[-\w.%+]{1,64}@(?:[A-Z0-9-]{1,63}\.){1,125}[A-Z]{2,63}$/i;
            //valido.innerText = "";
        //Se muestra un texto a modo de ejemplo, luego va a ser un icono
        if (emailRegex.test(campo.value)) { 
            document.getElementById("txtCorreo").style.border = "1px solid #1aafa0";
            document.getElementById("idBtnRegistrar").disabled = false;
            document.getElementById("idBtnRegistrar").style = "background-color: #31bfb1";
            document.getElementById("idBtnRegistrar").style.cursor = "";
        } else {
            //valido.innerText = "incorrecto";
            document.getElementById("txtCorreo").style.border = "1px solid red";
            document.getElementById("idBtnRegistrar").disabled = true;
            document.getElementById("idBtnRegistrar").style = "background-color: grey";
        }
    });
</script>



</html>