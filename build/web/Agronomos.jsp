<%-- 
    Document   : Agronomos
    Created on : 23/05/2022, 10:15:28 PM
    Author     : amontanez
--%>



<%@page import="DAO.AgronomoDAO"%>
<%@page import="java.sql.ResultSet"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
                padding-left: 16px;
                padding-right: 16px;
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
                max-width: 930px;
                max-height: 500px;
                width: 100%;
                border-radius: 6px;
                overflow: hidden;
                box-shadow: 2px 2px 10px 1px ;
            }
            .slide{
                display:flex;
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
                position: relative;
                bottom: 20px;
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
                height: 40%;
            }
            .columnaBlog1 {
                width:15%;
            }
            .columnaBlog2 {
                width:70%;
                background-color:#dfe3e8;
            }  
            .columnaBlog3 {
                width:15%;
                padding:5px;
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
                margin-top: -30px;
                padding: 10px;
                height: 1500px; /* Used in this example to enable scrolling */
            }
            .textArea{
                width: 50%;
                max-width: 900px;
            }
            .menu{
                background-color:#33cabb;
            }
            .publicarBlog{
                padding:20px;
            }
            .inputBlog{		
                max-width: 70%;
            }
            .searchBlog{		
                max-width: 40%;
            }
            .submitBtnBlog {
                top: 5px;
                left: -91%;
                display: block;
                margin-left: auto;
                padding: 5px 8px;
                border: none;
                background-color:#31bfb1;
                color: white;
                border-radius: 6px;
                cursor: pointer;
                font-size: 16px;
                position:relative;
            }
            .submitBtnBlog:hover {
                background-color: #1aafa0;
            }
            .searchBtnBlog {
                margin-left: auto;
                padding: 5px 8px;
                top:5px;
                border: none;
                background-color:#31bfb1;
                color: white;
                border-radius: 6px;
                cursor: pointer;
                font-size: 16px;
            }

            .searchBtnBlog:hover {
                background-color: #1aafa0;
            }

           #hellobar-bar {
                position: fixed;
                display: table;
                z-index: 5;
                margin: -15px;
                width: 100%;
                left:1%;
                height: 50px;
                border-radius: 6px;
                font-size: 20px;
                font-weight: 400;
                padding: .33em .5em;
                -webkit-font-smoothing: antialiased;
                box-shadow: 0 1px 3px 2px rgba(0,0,0,0.15);
                color:#721c24;
                background-color:#f8d7da;
                border-color:#f8d7da;
            }
            #hellobar-bar {
                font-size: 14px;
                padding: .2em .5em;
            }
            
            .hb-content-wrapper {
                text-align: center;
                text-align: center;
                position: relative;
                vertical-align: middle;
            }
            .hb-content-wrapper p {
                margin-top: 0;
                margin-bottom: 0;
            }
            .hb-text-wrapper {
                margin-right: .67em;
                line-height: 1.3;
            }
            .hb-text-wrapper .hb-headline-text {
                font-size: 1em;
                display: inline-block;
                vertical-align: middle;
            }
            #hellobar-bar .hb-cta {
                display: inline-block;
                vertical-align: middle;
                margin: 5px 0;
                color: #ffffff;
                background-color: #22af73;
                border-color: #22af73
            }
            .hb-cta-button {
                opacity: 1;
                color: #fff;
                display: block;
                cursor: pointer;
                line-height: 1.5;
                max-width: 22.5em;
                text-align: center;
                position: relative;
                border-radius: 3px;
                white-space: nowrap;
                margin: 1.75em auto 0;
                text-decoration: none;
                padding: 0;
                overflow: hidden;
            }
            .hb-cta-button .hb-text-holder {
                border-radius: inherit;
                padding: 5px 15px;
            }
            .hb-close-wrapper {
                display: table-cell;
                width: 1.6em;
            }
            .hb-close-wrapper .icon-close {
                font-size: 14px;
                top: 15px;
                right: 25px;
                width: 15px;
                height: 15px;
                opacity: .3;
                color: #000;
                cursor: pointer;
                position: absolute;
                text-align: center;
                line-height: 15px;
                z-index: 1000;
                text-decoration: none;
            }

            #txtMsgErrorNombres{
                color: red;
                position: absolute;
                top: 0px;
                left: 30px;
                font-size: 12px;
            }

            .idX{
                border: 1px solid red;
                border-radius: 7px;
                font-size: 16px;
                outline: none;
                color: red;
                background: white;
            }


            .pagAgronomoAnt {
                border: 1px solid gray;
                border-top-left-radius: 8px;
                border-bottom-left-radius: 8px;
                padding: 4px 8px;
                background-color:cadetblue;
                color: white;
            }
            .pagAgronomo {
                padding: 4px 8px;
                margin-left: auto;
                padding: 5px 10px;
                border: none;
                background-color:cadetblue;
                color: white;
                border-radius: 4px;
                cursor: pointer;
                margin: 2px;
            }
            .pagAgronomoDes {
                border: 1px solid gray;
                border-top-right-radius: 8px;
                border-bottom-right-radius: 8px;
                padding: 4px 8px;
                background-color:cadetblue;
                color: white;
            }

            .searchBtnBlog {
                margin-left: auto;
                padding: 5px 8px;
                top:5px;
                border: none;
                background-color:#31bfb1;
                color: white;
                border-radius: 6px;
                cursor: pointer;
                font-size: 16px;
            }

            .searchBtnBlog:hover {
                background-color: #1aafa0;
            }

            .table-responsive{
                max-width: 80%;
            }

            /* table {
                 border-collapse:initial;
                 width: 100%;
             }
             th {
                 background-color: #04AA6D;
                 color: white;
             }
             th, td {
                 padding: 8px;
                 text-align: left;
                 border-bottom: 1px solid #ddd;
             }
 
             tr:hover {background-color: coral;}*/

            /*tr:nth-child(even) {background-color: #f2f2f2;}*/


            .headerTable{
                width:100%; 
                border-collapse:collapse; 
                background-color: cadetblue;
                box-shadow: 0px 0px 10px;
                padding: 1rem 2rem;
            }
            td{
                padding: 1rem 2rem;
            } th{
                padding: 1rem 2rem;
            }
            .bodyTable{
                width:100%; 
                border-collapse: separate; 
                background-color:#ebf1f4;
                padding: 8px;
            }
            .bodyTable tr:hover {
                background-color:#DADCE0;
            }





            ::-webkit-scrollbar {
                display: none;
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
            /*const tipo = document.querySelector("#txtTipo");
             const input = document.querySelector("[name=divColegiatura]");
             tipo.addEventListener("change", () => {
             if (tipo.value === "agronomo") {
             input.style.display = 'initial';
             } else {
             input.style.display = 'none';
             }
             });*/

            function fn_mostrarColegiatura() {
                tipo = document.getElementById("txtTipo").value;
                if (tipo === "Agrónomo") {
                    document.getElementById("divColegiatura").style.display = "block";
                } else {
                    document.getElementById("divColegiatura").style.display = "none";
                }
            }

            function mostrarRegistro() {

                if (document.getElementById('idPanelRegistro').style.display === "") {
                    document.getElementById('idPanelRegistro').style.display = "";
                } else {
                    document.getElementById('idPanelRegistro').style.display = "";
                }
            }


            (function () {
                'use strict';
                window.addEventListener('load', function () {
                    // Fetch all the forms we want to apply custom Bootstrap validation styles to
                    var forms = document.getElementsByClassName('form');
                    // Loop over them and prevent submission
                    var validation = Array.prototype.filter.call(forms, function (form) {
                        form.addEventListener('submit', function (event) {
                            var cantErrores = 0;
                            if (form.checkValidity() === false) {
                                event.preventDefault();
                                event.stopPropagation();
                                if (document.getElementById("txtNombres").value === "") {
                                    cantErrores = cantErrores + 1;
                                    document.getElementById("txtNombres").style.border = "1px solid red";
                                } else {
                                    document.getElementById("txtNombres").style.border = "1px solid #1aafa0";
                                }
                                if (document.getElementById("txtApellidos").value === "") {
                                    cantErrores = cantErrores + 1;
                                    document.getElementById("txtApellidos").style.border = "1px solid red";
                                } else {
                                    document.getElementById("txtApellidos").style.border = "1px solid #1aafa0";
                                }
                                if (document.getElementById("txtCorreo").value === "") {
                                    cantErrores = cantErrores + 1;
                                    document.getElementById("txtCorreo").style.border = "1px solid red";
                                } else {
                                    document.getElementById("txtCorreo").style.border = "1px solid #1aafa0";
                                }
                                if (document.getElementById("txtCiudad").value === "") {
                                    cantErrores = cantErrores + 1;
                                    document.getElementById("txtCiudad").style.border = "1px solid red";
                                } else {
                                    document.getElementById("txtCiudad").style.border = "1px solid #1aafa0";
                                }
                                if (document.getElementById("txtTipo").value === "") {
                                    cantErrores = cantErrores + 1;
                                    document.getElementById("txtColegiatura").required = false;
                                    document.getElementById("txtTipo").style.border = "1px solid red";
                                } else {
                                    document.getElementById("txtTipo").style.border = "1px solid #1aafa0";
                                    if (document.getElementById("txtTipo").value === "Agrónomo") {
                                        document.getElementById("txtColegiatura").required = true;
                                        if (document.getElementById("txtColegiatura").value === "") {
                                            cantErrores = cantErrores + 1;
                                            document.getElementById("txtColegiatura").style.border = "1px solid red";
                                        } else {
                                            document.getElementById("txtColegiatura").style.border = "1px solid #1aafa0";
                                        }
                                    } else {
                                        document.getElementById("txtColegiatura").required = false;
                                    }
                                }

                                if (document.getElementById("txtUsuario").value === "") {
                                    cantErrores = cantErrores + 1;
                                    document.getElementById("txtUsuario").style.border = "1px solid red";
                                } else {
                                    document.getElementById("txtUsuario").style.border = "1px solid #1aafa0";
                                }
                                if (document.getElementById("txtPasswordReg").value === "") {
                                    cantErrores = cantErrores + 1;
                                    document.getElementById("txtPasswordReg").style.border = "1px solid red";
                                } else {
                                    document.getElementById("txtPasswordReg").style.border = "1px solid #1aafa0";
                                }
                            }

                            if (cantErrores > 0) {
                                document.getElementById("txtMsgErrorNombres").style.display = "";
                            } else {
                                document.getElementById("txtMsgErrorNombres").style.display = "none";
                            }
                            form.classList.add('was-validated');
                        }, false);
                    });
                }, false);
            })();
            //document.getElementById("idMostrarNotif").value = "";
            //document.getElementById("idMostrarNotif").innerHTML = "";
            function fn_cargarNotif() {
                var notif = document.getElementById("idMostrarNotif").value;
                if (notif === "" || notif === null) {
                    document.getElementById("hellobar-bar").style.display = "none";
                    document.getElementById("idMostrarNotif").value = "";
                    document.getElementById("idMostrarNotif").innerHTML = "";

                } else {
                    document.getElementById("hellobar-bar").style.display = "";
                    document.getElementById("idMostrarNotif").value = "";
                    document.getElementById("idMostrarNotif").innerHTML = "";

                }
                //alert(notif)
            }




        </script>

        <input value="${mostrarNotif}" id="idMostrarNotif" style="display: none "></input>
        <nav class="menu navbar navbar-default navbar-expand-lg navbar-light">
            <div class="navbar-header">
                <a class="navbar-brand" href="#">Agro<b>Bien</b></a>  
            </div>
            <!-- Collection of nav links, forms, and other content for toggling -->
            <div id="navbarCollapse" class="collapse navbar-collapse">
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
                    <li class="active" style="display:${mostrarAgronomo}"><a href="AgronomoServlet">Agrónomos</a></li>
                    <li><a href="Noticias.jsp">Noticias</a></li>

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
                        <a href="#" data-toggle="dropdown" class="dropdown-toggle user-action"><img src="imagenes/iconoLogin.png" class="avatar" alt="Avatar"> ${usuarioSesion} <b class="caret"></b></a>
                        <ul class="dropdown-menu">
                            <!--<li><a href="#"><i class="fa fa-user-o"></i> Profile</a></li>
                            <li><a href="#"><i class="fa fa-calendar-o"></i> Calendar</a></li>
                            <li><a href="#"><i class="fa fa-sliders"></i> Settings</a></li>-->
                            <li class="divider"></li>
                            <form action="LogueoServlet" method="POST">
                                <input type="text" name="txtPaginaActual" value="Agronomos" style="display:none"></input>
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
                                    <input type="text" name="txtPaginaActual" value="Agronomos" style="display:none"></input>
                                    <div class="form-group">
                                        <input type="text" class="form-control" name="txtUsuario" placeholder="Username" required="required">
                                        <label for="" class="label1">Usuario</label>
                                    </div>
                                    <div class="form-group">
                                        <input type="password" id="password" class="form-control" name="txtPassword" placeholder="Password" required="required">
                                        <!--  <img id="icon1" class="icono" src="imagenes/iconoMostrar.png" onclick="mostrarContrasena()"/>-->
                                        <label for="" class="label2">Contraseña</label>
                                    </div>
                                    <%                                        if (request.getParameter("error") == null) {

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
                                    <a href="RecuperarPassword.jsp">¿Olvidó su contraseña?</a>
                                    </div>
                                </form>
                            </li>
                        </ul>
                    </li>
                </ul>



                <ul class="nav navbar-nav navbar-right">
                    <li><a href="#" class="notifications"><i class="fa fa-bell-o"></i><span class="badge">1</span></a></li>
                    <li>
                        <a href="#" data-toggle="dropdown" class="btn btn-primary dropdown-toggle get-started-btn mt-1 mb-1" onclick="mostrarRegistro()">Registrarse</a>
                        <ul id="idPanelRegistro" class="dropdown-menu" style="display:none">		

                            <div id="idRegistro" class="signupFrm">
                                <form id="formRegistro" name="formRegistro" class="form" action="LogueoServlet" method="POST" novalidate>
                                    <div class="columna columna1">
                                        <input type="text" name="txtPaginaActual" value="Principal" style="display:none"></input>

                                        <div class="inputContainer">
                                            <input type="text" class="input" id="txtNombres" name="txtNombres" placeholder="Juan"  required="required">
                                            <label for="" class="label">Nombres</label>

                                        </div>

                                        <div class="inputContainer">
                                            <input type="text" class="input" id="txtApellidos" name="txtApellidos" placeholder="Huamán"  required="required">
                                            <label for="" class="label">Apellidos</label>
                                        </div>

                                        <div class="inputContainer">
                                            <input type="email" class="input" id="txtCorreo"  name="txtCorreo" placeholder="juan@gmail.com"  required="required">
                                            <label for="" class="label">Correo</label>
                                        </div>

                                        <div class="inputContainer">
                                            <input type="text" class="input" id="txtCiudad"  name="txtCiudad" placeholder="Lima"  required="required">
                                            <label for="" class="label">Ciudad</label>
                                        </div>
                                    </div>


                                    <div  class="columna columna2">

                                        <div class="inputContainer">
                                            <select  class="input" id="txtTipo" name="txtTipo"  placeholder="" onchange="fn_mostrarColegiatura()" required="required">
                                                <option hidden selected>Agricultor</option>
                                                <option class="input" value="Agricultor">Agricultor</option>
                                                <option class="input" value="Agrónomo">Agrónomo</option>
                                            </select>
                                            <label class="label"for="">Tipo</label>

                                        </div>
                                        <div class="inputContainer" id="divColegiatura" name="divColegiatura" Style="display:none">
                                            <input type="text" class="input" id="txtColegiatura"  name="txtColegiatura" placeholder=" "  >
                                            <label for="" class="label">Nro Colegiatura</label>
                                        </div>
                                        <div class="inputContainer">
                                            <input type="text" class="input" id="txtUsuario"   name="txtUsuario" placeholder=" "  required="required">
                                            <label for="" class="label">Nombre de Usuario</label>
                                        </div>

                                        <div class="inputContainer"> <!--onclick="javascript:IrAServletUsandoPost();" -->
                                            <input type="password" id="txtPasswordReg"  name="txtPasswordReg" class="input" placeholder=" " required="required" minlength="8">
                                            <label for="" class="label">Contraseña</label>
                                        </div>
                                        <div class="inputContainer">
                                            <label id="txtMsgErrorNombres" style="display:none"> (*)Existen campos obligatorios.</label>
                                        </div>
                                    </div>

                                    <input type="submit" class="submitBtn" name="accion" value="Registrar" onclick="mostrarRegistro()">

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

    <%
        ResultSet rs;
        AgronomoDAO a = new AgronomoDAO();
        String valorBuscado = "";
        int pag = 0;
        int cantxPag = 5;
    %>

    <body onload="fn_cargarNotif()">
       <div id="hellobar-bar" class="regular closable" style="display: none">
            <div class="hb-content-wrapper">
                <div class="hb-text-wrapper">
                    <div class="hb-headline-text">
                        <p><span>${mostrarNotif}</span></p>
                    </div>
                </div>
                <a href="http://www.programacion.net" target="_blank" class="hb-cta hb-cta-button" style="display:none">
                    <div class="hb-text-holder">
                        <p>Regístrate</p>
                    </div>
                </a>
            </div>
            <div class="hb-close-wrapper">
                <form action="LogueoServlet" method="POST">
                    <input type="text" name="txtPaginaActual" value="Principal" style="display:none"></input>
                    <input  class="idX" type="submit" name="accion" value="X"></input>
                    <!--<a href="javascript:void(0);" class="icon-close" onclick="$('#hellobar-bar').fadeOut()">X</a>-->
                </form>

            </div>
        </div>


        <main class="main">
            <div class="columnaBlog columnaBlog1">
                <h5>Entidades Gubernamentales</h5>
                <p><a href="https://www.gob.pe/institucion/midagri/noticias">Noticias Ministerio de Agricultura</a></p>
                <p><a href="https://es-la.facebook.com/minagriperu/">Ministerio de Agricultura Facebook</a></p>
                <p><a href="https://www.gob.pe/institucion/midagri/noticias"><img src="imagenes/enlaceMidagri.png" alt="30" width="30"/></a></p>
            </div>
            <div class="columnaBlog columnaBlog2"> 
                <p>

                <div class="container">
                    <div class="table-responsive">
                        <div class="col-sm-12"><h2><b>Lista de Agrónomos</b></h2></div>
                        <p>
                        <hr>
                        </p>
                        <form class="publicarBlog">
                            <input name="Buscar" class="form-control searchBlog" type="search" placeholder="Ingrese una palabra que desee buscar." value="${valorBuscado}">
                            <p>
                            <div>
                                <button class="searchBtnBlog" type="submit">Buscar</button>
                            </div>

                        </form>

                        <br>
                        <%
                            //AgronomoDAO a = new AgronomoDAO();
                            //int pag = 0;
                            //int cantxPag = 5;
                            if (request.getParameter("pag") == null) {
                                pag = 1;
                            } else {
                                pag = Integer.parseInt(request.getParameter("pag"));
                            }

                            if (request.getParameter("Buscar") == null) {
                                valorBuscado = "";
                            } else {
                                valorBuscado = request.getParameter("Buscar");
                            }

                            int numreg = a.cantidadAgronomos(valorBuscado);
                            int numpag = numreg / cantxPag;

                            System.out.println("AYALA pag " + pag);
                            System.out.println("AYALA numreg: " + numreg);
                            System.out.println("AYALA cantxPag: " + cantxPag);
                            System.out.println("AYALA numpag: " + numpag);
                        %>

                        <!class="table table-striped table-hover table-bordered"-->
                        <table class="headerTable">
                            <thead >
                                <tr >
                                    <th>N°</th>
                                    <th>NOMBRES</th>
                                    <th>APELLIDOS</th>
                                    <th>CIUDAD</th>
                                    <th>CORREO</th>
                                </tr>
                            </thead>

                            <tbody  class="bodyTable">
                                <%
                                    int x = (pag - 1) * cantxPag;
                                    rs = a.buscarAgronomo(valorBuscado, pag, cantxPag);
                                    if (numreg > 0) {
                                        while (rs.next()) {
                                            System.out.println("AYALA RS: " + rs.getString(3));
                                %>

                                <tr>
                                    <td><%=x + 1%></td>
                                    <td><%=rs.getString(3)%></td>
                                    <td><%=rs.getString(4)%></td>
                                    <td><%=rs.getString(5)%></td>
                                    <td><%=rs.getString(6)%></td>
                                    <!-- <td>
                                         <a href="#" class="view" title="View" data-toggle="tooltip"><i class="material-icons">&#xE417;</i></a>
                                         <a href="#" class="edit" title="Edit" data-toggle="tooltip"><i class="material-icons">&#xE254;</i></a>
                                         <a href="#" class="delete" title="Delete" data-toggle="tooltip"><i class="material-icons">&#xE872;</i></a>
                                     </td>
                                    -->

                                </tr>
                                <%
                                        x++;
                                    }
                                } else {
                                %>
                                <tr>
                                    <td>No se encontraron registros.</td>
                                    <td></td>
                                    <td></td>
                                    <td></td>
                                    <td></td>
                                </tr>
                                <%
                                    }
                                %>
                            </tbody>
                        </table>

                        <div><br></div>


                        <div style="text-align: center">
                            <%if (pag > 1) {%>

                            <a class="pagAgronomoAnt" href="?pag=<%=pag - 1%>&Buscar=<%=valorBuscado%>">Anterior </a>
                            <%} else if (pag == 1) {%>
                            <a class="pagAgronomoAnt" style="background-color:#959A92" disabled>Anterior </a>
                            <%}
                                for (int i = 0; i < numpag + 1; i++) {
                                    if (pag == (i + 1)) {
                            %>
                            <a style="background-color:#31bfb1; color:black" class="pagAgronomo" href="?pag=<%=i + 1%>&Buscar=<%=valorBuscado%>" ><%=i + 1%> </a>
                            <%
                                }
                                if (pag != (i + 1)) {
                            %>
                            <a class="pagAgronomo" href="?pag=<%=i + 1%>&Buscar=<%=valorBuscado%>" ><%=i + 1%> </a>
                            <%

                                    }
                                }

                                if (pag <= numpag) {
                            %>
                            <a class="pagAgronomoDes" href="?pag=<%=pag + 1%>&Buscar=<%=valorBuscado%>">Siguiente </a> 
                            <% } else {%>
                            <a class="pagAgronomoDes" style="background-color:#959A92" disabled>Anterior </a>
                            <%}
                            %>
                        </div>

                        <p>
                        <div class="clearfix">
                            <!-- <div class="hint-text">Showing <b>5</b> out of <b>25</b> entries</div>-->
                            <!-- <ul class="pagination">
                                 <li class="page-item disabled"><a href="#"><i class="fa fa-angle-double-left"></i></a></li>
                                 <li class="page-item"><a href="#" class="page-link">1</a></li>
                                 <li class="page-item"><a href="#" class="page-link">2</a></li>
                                 <li class="page-item active"><a href="#" class="page-link">3</a></li>
                                 <li class="page-item"><a href="#" class="page-link">4</a></li>
                                 <li class="page-item"><a href="#" class="page-link">5</a></li>
                                 <li class="page-item"><a href="#" class="page-link"><i class="fa fa-angle-double-right"></i></a></li>
                             </ul>
                            -->
                        </div>
                    </div>        
                </div>    
            </div>

            <div class="columnaBlog columnaBlog3">
                <h5>Organismos Locales</h5>
                <p><a href="#">Organismos Locales</a></p>
            </div>
        </main>


    </body>
</html>
