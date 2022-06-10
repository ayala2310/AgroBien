<%-- 
    Document   : Noticias
    Created on : 23/05/2022, 10:16:04 PM
    Author     : amontanez
--%>


<!DOCTYPE html>
<html>
    <header>


        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>AGRO BIEN INTEGRADOR II</title>
        <link href="https://fonts.googleapis.com/css?family=Varela+Round" rel="stylesheet">
        <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">  
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <style>
            body {
                font-family: 'Varela Round', sans-serif;
            }
            .form-control {
                box-shadow: none;		
                font-weight: normal;
                font-size: 13px;
            }
            .form-control:focus {
                border-color: #33cabb;
                box-shadow: 0 0 8px rgba(0,0,0,0.1);
            }

            .navbar {
                background: white;
                padding-left: 16px;
                padding-right: 16px;
                border-bottom: 1px solid #dfe3e8;
                border-radius: 0;
            }
            .nav img {
                border-radius: 50%;
                width: 36px;
                height: 36px;
                margin: -8px 0;
                float: left;
                margin-right: 10px;
            }
            .navbar .navbar-brand, .navbar .navbar-brand:hover, .navbar .navbar-brand:focus {
                padding-left: 0;
                font-size: 20px;
                padding-right: 50px;
            }
            .navbar .navbar-brand b {
                font-weight: bold;
                color: white;		
            }
            .navbar .form-inline {
                display: inline-block;
            }
            .navbar .nav li {
                position: relative;
            }
            .navbar .nav li a {
                color: #888;
            }
            .search-box {
                position: relative;
            }	
            .search-box input {
                padding-right: 35px;
                border-color: #dfe3e8;
                border-radius: 4px !important;
                box-shadow: none
            }
            .search-box .input-group-addon {
                min-width: 35px;
                border: none;
                background: transparent;
                position: absolute;
                right: 0;
                z-index: 9;
                padding: 7px;
                height: 100%;
            }
            .search-box i {
                color: #a0a5b1;
                font-size: 19px;
            }
            .navbar .nav .btn-primary, .navbar .nav .btn-primary:active {
                color: #fff;
                background: #33cabb;
                padding-top: 8px;
                padding-bottom: 6px;
                vertical-align: middle;
                border: none;
            }	
            .navbar .nav .btn-primary:hover, .navbar .nav .btn-primary:focus {		
                color: #fff;
                outline: none;
                background: #31bfb1;
            }
            .navbar .navbar-right li:first-child a {
                padding-right: 30px;
            }
            .navbar ul li i {
                font-size: 18px;
            }
            .navbar .dropdown-menu i {
                font-size: 16px;
                min-width: 22px;
            }
            .navbar ul.nav li.active a, .navbar ul.nav li.open > a {
                background: transparent !important;
            }	
            .navbar .nav .get-started-btn {
                min-width: 120px;
                margin-top: 8px;
                margin-bottom: 8px;
            }
            .navbar ul.nav li.open > a.get-started-btn {
                color: #fff;
                background: #31bfb1 !important;
            }
            .navbar .dropdown-menu {
                border-radius: 1px;
                border-color: #e5e5e5;
                box-shadow: 0 2px 8px rgba(0,0,0,.05);
            }
            .navbar .nav .dropdown-menu li {
                color: #999;
                font-weight: normal;
            }
            .navbar .nav .dropdown-menu li a, .navbar .nav .dropdown-menu li a:hover, .navbar .nav .dropdown-menu li a:focus {
                padding: 8px 20px;
                line-height: normal;
            }
            .navbar .navbar-form {
                border: none;
            }
            .navbar .dropdown-menu.form-wrapper {
                width: 280px;
                padding: 20px;
                left: auto;
                right: 0;
                font-size: 14px;
            }
            .navbar .dropdown-menu.form-wrapper a {		
                color: #33cabb;
                padding: 0 !important;
            }
            .navbar .dropdown-menu.form-wrapper a:hover{
                text-decoration: underline;
            }
            .navbar .form-wrapper .hint-text {
                text-align: center;
                margin-bottom: 15px;
                font-size: 13px;
            }
            .navbar .form-wrapper .social-btn .btn, .navbar .form-wrapper .social-btn .btn:hover {
                color: #fff;
                margin: 0;
                padding: 0 !important;
                font-size: 13px;
                border: none;
                transition: all 0.4s;
                text-align: center;
                line-height: 34px;
                width: 47%;
                text-decoration: none;
            }	
            .navbar .social-btn .btn-primary {
                background: #507cc0;
            }
            .navbar .social-btn .btn-primary:hover {
                background: #4676bd;
            }
            .navbar .social-btn .btn-info {
                background: #64ccf1;
            }
            .navbar .social-btn .btn-info:hover {
                background: #4ec7ef;
            }
            .navbar .social-btn .btn i {
                margin-right: 5px;
                font-size: 16px;
                position: relative;
                top: 2px;
            }
            .navbar .form-wrapper .form-footer {
                text-align: center;
                padding-top: 10px;
                font-size: 13px;
            }
            .navbar .form-wrapper .form-footer a:hover{
                text-decoration: underline;
            }
            .navbar .form-wrapper .checkbox-inline input {
                margin-top: 3px;
            }
            .or-seperator {
                margin-top: 32px;
                text-align: center;
                border-top: 1px solid #e0e0e0;
            }
            .or-seperator b {
                color: #666;
                padding: 0 8px;
                width: 30px;
                height: 30px;
                font-size: 13px;
                text-align: center;
                line-height: 26px;
                background: #fff;
                display: inline-block;
                border: 1px solid #e0e0e0;
                border-radius: 50%;
                position: relative;
                top: -15px;
                z-index: 1;
            }
            .navbar .checkbox-inline {
                font-size: 13px;
            }
            .navbar .navbar-right .dropdown-toggle::after {
                display: none;
            }
            @media (min-width: 1200px){
                .form-inline .input-group {
                    width: 300px;
                    margin-left: 30px;
                }
            }
            @media (max-width: 768px){
                .navbar .dropdown-menu.form-wrapper {
                    width: 100%;
                    padding: 10px 15px;
                    background: transparent;
                    border: none;
                }
                .navbar .form-inline {
                    display: block;
                }
                .navbar .input-group {
                    width: 100%;
                }
                .navbar .nav .btn-primary, .navbar .nav .btn-primary:active {
                    display: block;
                }
            }
            /*  estilos del fondo principal */
            .container-all{
                position:fixed;
                max-width: 900px;
                width: 100%;
                left: 17%;
                border-radius: 8px;
                overflow: hidden;
                box-shadow: 5px 5px 20px 1px ;
            }
            .slide{
                display: flex;
                transform: translate3d(0,0,0);
                transition: all 600ms;
                animation-name: autoplay;
                animation-duration: 10s;
                animation-direction:normal;
                animation-fill-mode: forwards;
                animation-iteration-count: infinite;
            }
            .item-slide{
                position: relative;
                display: flex;
                flex-direction: column;
                flex-shrink: 0;
                flex-grow: 0;
                max-width: 100%;
            }
            .paginaSlider{
                position: absolute;
                bottom: 20px;
                left: 0;
                display: flex;
                flex-wrap: wrap;
                align-items: center;
                justify-content: center;
                width: 100%;
            }
            .paginaSlider-item{
                display: flex;
                flex-direction: column;
                align-items: center;
                border: 2px solid white;
                width: 16px;
                height: 16px;
                border-radius: 4px;
                overflow: hidden;
                cursor: pointer;
                background: rgba(255,255,255, 0.5);
                margin: 0 10px;
                text-align: center;
                transition:  all 900ms;
            }
            .paginaSlider-item:hover{
                transform: scale(3);
            }
            .paginaSlider-item img{
                display: inline-block;
                max-width: none;
                height: 100%;
                transform: scale(1);
                opacity: 1;
                transition:  all 900ms;                 
            }
            .paginaSlider-item:hover img{
                opacity: 1;
                transform: scale(1);
            }
            input[id="1"]:checked ~ .slide{
                animation: none;
                transform: translate3d(0,0,0);
            }
            input[id="1"]:checked ~ .paginaSlider .paginaSlider-item[for="1"]{
                background: #fff;
            }
            input[id="2"]:checked ~ .slide{
                animation: none;
                transform: translate3d(calc(-100% * 1),0,0);
            }
            input[id="2"]:checked ~ .paginaSlider .paginaSlider-item[for="2"]{
                background: #fff;
            }
            input[id="3"]:checked ~ .slide{
                animation: none;
                transform: translate3d(calc(-100% * 2),0,0);
            }
            input[id="3"]:checked ~ .paginaSlider .paginaSlider-item[for="3"]{
                background: #fff;
            }

            @keyframes autoplay{
                33%{
                    transform: translate3d(calc(-100% * 0),0,0);
                }
                66%{
                    transform: translate3d(calc(-100% * 1),0,0);
                }
                100%{
                    transform: translate3d(calc(-100% * 2),0,0);
                }
            }

            .icono{
                position: relative;
                top: -25px;
                left: 200px;
                margin-left: auto;
                cursor: pointer;
                padding: 0px 0px;
                height: 1%;
                width: 1%;
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
                padding: 3px 20px;
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

            .columnaBlog{
                float:left;
            }
            .columnaBlog1 {
                width:15%;
            }
            .columnaBlog2 {
                width:70%;
            }  
            .columnaBlog3 {
                width:15%;
            }
            .inputContainer {
                position: relative;
                height: 45px;
                width: 65%;
                margin-bottom: 15px;
                left: -15px;
            }

            .input {
                position: absolute;
                top: 0px;
                left: 30px;
                height: 100%;
                width: 150%;
                border: 1px solid #DADCE0;
                border-radius: 7px;
                font-size: 16px;
                padding: 0 20px;
                outline: none;
                background: none;
            }
            .input:focus{
                border: 1px solid #1aafa0;
            }
            .submitBtn {
                position: relative;
                top: 0px;
                left: -70px;
                display: block;
                margin-left: auto;
                padding: 15px 30px;
                border: none;
                background-color:#31bfb1;
                color: white;
                border-radius: 6px;
                cursor: pointer;
                font-size: 16px;
            }

            .submitBtn:hover {
                background-color: #1aafa0;
            }
            .label {
                position: absolute;
                display: inline-block;
                background: blue;
                background-color: white;
                top: -6px;
                left: 45px;
                font-size: 10px;
                color: #1aafa0;
            }
            .label1 {
                position: absolute;
                display: inline-block;
                background: blue;
                background-color: white;
                top: 46px;
                left: 15px;
                font-size: 10px;
                color: #1aafa0;
            }
            .label2 {
                position: absolute;
                display: inline-block;
                background: blue;
                background-color: white;
                top: 96px;
                left: 15px;
                font-size: 10px;
                color: #1aafa0;
            }


            .main {
                padding: 106px;
                margin-top: -50px;
                height: 1500px; /* Used in this example to enable scrolling */
            }
            .textArea{
                width: 50%;
                max-width: 900px;
            }
 .menu{
                background-color:#33cabb;
            }
        </style>
        <script>


            function mostrarContrasena() {
                var tipo = document.getElementById("password");
                if (tipo.type === "password") {
                    tipo.type = "text";
                } else {
                    tipo.type = "password";
                }
            }

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

            // Prevent dropdown menu from closing when click inside the form
            $(document).on("click", ".navbar-right .dropdown-menu", function (e) {
                e.stopPropagation();
            });


        </script>

        <nav class="navbar navbar-default navbar-expand-lg navbar-light">
            <div class="navbar-header">
                <a class="navbar-brand" href="#">Agro<b>Bien</b></a>  		
                <!--
                <button type="button" data-target="#navbarCollapse" data-toggle="collapse" class="navbar-toggle">
                    <span class="navbar-toggler-icon"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                -->
            </div>
            <!-- Collection of nav links, forms, and other content for toggling -->
            <div id="menu navbarCollapse" class="collapse navbar-collapse">
                <ul class="nav navbar-nav">
                    <li><a href="Principal.jsp">Inicio</a></li>
                    <li><a href="PublicacionesServlet">Blog</a></li>	
                    <!--
                    <li class="dropdown">
                            <a data-toggle="dropdown" class="dropdown-toggle" href="#">Services <b class="caret"></b></a>
                            <ul class="dropdown-menu">					
                                    <li><a href="#">Web Design</a></li>
                                    <li><a href="#">Web Development</a></li>
                                    <li><a href="#">Graphic Design</a></li>
                                    <li><a href="#">Digital Marketing</a></li>
                            </ul>
                    </li>
                    -->
                    <li style="display:${mostrarAgronomo}"><a href="AgronomoServlet">Agrónomos</a></li>
                    <li  class="active"><a href="Noticias.jsp">Noticias</a></li>

                </ul>
                <!--
                    <form class="navbar-form form-inline">
                            <div class="input-group search-box">								
                                    <input type="text" id="search" class="form-control" placeholder="Search here...">
                                    <span class="input-group-addon"><i class="material-icons">&#xE8B6;</i></span>
                            </div>
                    </form>
                -->

                <ul class="nav navbar-nav navbar-right" style="display:${displayNoneUsuario}">
                    <li class="dropdown">
                        <a href="#" data-toggle="dropdown" class="dropdown-toggle user-action"><img src="https://www.tutorialrepublic.com/examples/images/avatar/3.jpg" class="avatar" alt="Avatar"> ${usuarioSesion} <b class="caret"></b></a>
                        <ul class="dropdown-menu">
                            <li><a href="#"><i class="fa fa-user-o"></i> Profile</a></li>
                            <li><a href="#"><i class="fa fa-calendar-o"></i> Calendar</a></li>
                            <li><a href="#"><i class="fa fa-sliders"></i> Settings</a></li>
                            <li class="divider"></li>
                            <form action="LogueoServlet" method="POST">
                                 <input type="text" name="txtPaginaActual" value="Noticias" style="display:none"></input>
                                <input type="submit" class="btn btn-primary btn-block" name="accion" value="Cerrar Sesión">
                            </form>
                        </ul>
                    </li>
                </ul>   

                <ul class="nav navbar-nav navbar-right" style="display:${displayNoneLogin}">
                    <li>
                        <a data-toggle="dropdown" class="dropdown-toggle" href="#">Iniciar Sesión</a>
                        <ul class="dropdown-menu form-wrapper">					
                            <li>
                                <form action="LogueoServlet" method="POST">
                                    <p class="hint-text">Inicie sesión con su usuario y contraseña.</p>
                                    <!--
                                    <div class="form-group social-btn clearfix">
                                        <a href="#" class="btn btn-primary pull-left"><i class="fa fa-facebook"></i> Facebook</a>
                                        <a href="#" class="btn btn-info pull-right"><i class="fa fa-twitter"></i> Twitter</a>
                                    </div>
                                    <div class="or-seperator"><b>or</b></div>
                                    -->
                                     <input type="text" name="txtPaginaActual" value="Noticias" style="display:none"></input>
                                    <div class="form-group">
                                        <input type="text" class="form-control" name="txtUsuario" placeholder="Username" required="required">
                                        <label for="" class="label1">Usuario</label>
                                    </div>
                                    <div class="form-group">
                                        <input type="password" id="password" class="form-control" name="txtPassword" placeholder="Password" required="required">
                                        <!--  <img id="icon1" class="icono" src="imagenes/iconoMostrar.png" onclick="mostrarContrasena()"/>-->
                                        <label for="" class="label2">Contraseña</label>
                                    </div>
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
                                    <input type="submit" class="btn btn-primary btn-block" name="accion" value="Iniciar Sesión">

                                    <div class="form-footer">
                                        <a href="#">¿Olvidó su contraseña?</a>
                                    </div>
                                </form>
                            </li>
                        </ul>
                    </li>
                </ul>



                <ul class="nav navbar-nav navbar-right">
                    <li><a href="#" class="notifications"><i class="fa fa-bell-o"></i><span class="badge">1</span></a></li>
                    <li>
                        <a href="#" data-toggle="dropdown" class="btn btn-primary dropdown-toggle get-started-btn mt-1 mb-1">Registrarse</a>
                        <ul class="dropdown-menu">	

                            <div class="signupFrm">
                                <form class="form" action="LogueoServlet" method="POST">

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
                                            <input type="email" class="input"  name="txtCorreo" placeholder="juan@gmail.com">
                                            <label for="" class="label">Correo</label>
                                        </div>

                                        <div class="inputContainer">
                                            <input type="text" class="input"  name="txtCiudad" placeholder="Lima">
                                            <label for="" class="label">Ciudad</label>
                                        </div>
                                    </div>


                                    <div  class="columna columna2">

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

                        </ul>
                    </li>


                </ul>
            </div>
        </nav>

    </header> 

  
    <body>
        <h1>Página en proceso de construcción....</h1>
    </body>
</html>
