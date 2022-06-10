<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        
        <style>
           
            #hellobar-bar {
                font-family: "Open Sans", sans-serif;
                width: 70%;
                left:14%;
                margin: 0;
                height: 30px;
                display: table;
                font-size: 17px;
                font-weight: 400;
                padding: .33em .5em;
                -webkit-font-smoothing: antialiased;
                color: #5c5e60;
                position: fixed;
                background-color: white;
                box-shadow: 0 1px 3px 2px rgba(0,0,0,0.15);
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
        </style>

    </head>
    <body>
      
        <div id="hellobar-bar" >
            <div >
                <div class="hb-text-wrapper">
                    <div class="hb-headline-text">
                        <p><span>Regístrate ya en programacion.net y accederas a multitud de tutoriales gratuitos</span></p>
                    </div>
                </div>
                <a href="http://www.programacion.net" target="_blank" class="hb-cta hb-cta-button">
                    <div class="hb-text-holder">
                        <p>Regístrate</p>
                    </div>
                </a>
            </div>
            <div class="hb-close-wrapper">
                <a href="javascript:void(0);" class="icon-close">X</a>
            </div>
        </div>
    </body>
</html>