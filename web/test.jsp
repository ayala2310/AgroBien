<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <title>JS Bin</title>
    </head>
    <style>
        html{
            width: 100%;
            height: 100%;
        }

        body{
            width: 100%;
            height: 100%;
        }

        div{
            width: 30%;
            height: 20%;
            display: none;
        }

        #opc1{
            background: red;
        }

        #opc2{
            background: green;
        }

        .visible{
            display: block;
        }
    </style>

   <body>
        <select name="elige" id="elige">
            <option value="">Seleccione una opción</option>
            <option value="opc1">Específico</option>
            <option value="opc2">Comercial</option>
        </select>
        <div id = "opc1"></div>
        <div id = "opc2"></div>
    
    </body>
        
          <script>
        var visible;

//Ejecuto una función cuando elija una opción del <select>
        document.querySelector("#elige").addEventListener("change", function () {

            //Tomo al <div> que posea la clase 'visible'
            visible = document.querySelector(".visible");

            //Si el valor de la opción seleccionada contiene uno o más caracteres
            if (this.value.length) {
                //Verifico si hay al menos un <div> con la clase 'visible'
                if (visible.length) {
                    //De haberlo, le quito dicha clase
                    visible.className = "";
                }
                //Luego, tomo al <div> cuyo id corresponda con el de la opción seleccionada y le asigno la clase 'visible'
                document.querySelector("#" + this.value).className = "visible";
            }

            //Si el valor de la opción seleccionada no contiene caracteres (está vacía)
            else {
                //Verifico si hay al menos un <div> con la clase 'visible'
                if (visible.length) {
                    //De haberlo, le quito dicha clase
                    visible.className = "";
                }
            }
        }, false);
    </script>
   
</html>