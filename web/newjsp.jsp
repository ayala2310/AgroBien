<%-- 
    Document   : newjsp
    Created on : 02/07/2022, 10:34:01 AM
    Author     : amontanez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>

    </head>
  

    <body>
        <p>
            Email:
            <input id="email">
            <span id="emailOK"></span>
        </p>
    </body>
    
        <script>
        document.getElementById('email').addEventListener('input', function () {
            campo = event.target;
            valido = document.getElementById('emailOK');

            emailRegex = /^[-\w.%+]{1,64}@(?:[A-Z0-9-]{1,63}\.){1,125}[A-Z]{2,63}$/i;
            //Se muestra un texto a modo de ejemplo, luego va a ser un icono
            if (emailRegex.test(campo.value)) {
                valido.innerText = "válido";
            } else {
                valido.innerText = "incorrecto";
            }
        });
    </script>
</html>
