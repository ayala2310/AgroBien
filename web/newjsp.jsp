<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <style>
            body{
                display: flex;
                align-items: center;
                justify-content: center;
                padding: 30px;
            }
            img{
                max-width: 100%;
            }
            .container-all{
                position: relative;
                max-width: 800px;
                width: 100%;
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
            .pagination{
                position: absolute;
                bottom: 20px;
                left: 0;
                display: flex;
                flex-wrap: wrap;
                align-items: center;
                justify-content: center;
                width: 100%;
            }
            .pagination-item{
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
            .pagination-item:hover{
                transform: scale(3);
            }
            .pagination-item img{
                display: inline-block;
                max-width: none;
                height: 100%;
                transform: scale(1);
                opacity: 1;
                transition:  all 900ms;                 
            }
            .pagination-item:hover img{
                opacity: 1;
                transform: scale(1);
            }
            input[id="1"]:checked ~ .slide{
                animation: none;
                transform: translate3d(0,0,0);
            }
            input[id="1"]:checked ~ .pagination .pagination-item[for="1"]{
                background: #fff;
            }
            input[id="2"]:checked ~ .slide{
                animation: none;
                transform: translate3d(calc(-100% * 1),0,0);
            }
            input[id="2"]:checked ~ .pagination .pagination-item[for="2"]{
                background: #fff;
            }
            input[id="3"]:checked ~ .slide{
                animation: none;
                transform: translate3d(calc(-100% * 2),0,0);
            }
            input[id="3"]:checked ~ .pagination .pagination-item[for="3"]{
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

        </style>



    </head>

    <body>
        <div class="container-all">
            <input type="radio" id="1" name="image-slide" hidden/>
            <input type="radio" id="2" name="image-slide" hidden/>
            <input type="radio" id="3" name="image-slide" hidden/>

            <div class="slide">
                <div class="item-slide">
                    <img src="imagenes/slide1.jpg" width="800px" height="500px">
                </div>
                <div class="item-slide">
                    <img src="imagenes/slide2.jpg" width="800px" height="500px">
                </div>
                <div class="item-slide">
                    <img src="imagenes/slide3.jpg" width="800px" height="500px">
                </div>
            </div>

            <div class="pagination">
                <label class="pagination-item" for="1">
                    <img src="imagenes/slide1.jpg"> 
                </label>
                <label class="pagination-item" for="2">
                    <img src="imagenes/slide2.jpg"> 
                </label>
                <label class="pagination-item" for="3">
                    <img src="imagenes/slide3.jpg"> 
                </label>
            </div>

        </div>
    </body>
</html> 
