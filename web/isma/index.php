<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>
    <title>Document</title>
</head>
<body>
<nav class="navbar navbar-expand-sm bg-dark navbar-secondary">

  <ul class="navbar-nav">
    <li class="nav-item">
      <a id="inicio" class="nav-link" href="#">Inicio</a>
    </li>
    <li id="myv" class="nav-item">
      <a class="nav-link" href="#">Mision Vision</a>
    </li>
    <li id="ingresar" class="nav-item">
      <a class="nav-link" href="#">Iniciar sesión</a>
    </li>
  </ul>

</nav>
<div id="div1"></div>
<img class="img-fluid"  src="Universidad_Santo_Tomas.jpg" alt="ust">
<script>

$(document).ready(function(){
  $("#inicio").click(function(){
    $("#div1").load("inicio.php");
  });
});

$(document).ready(function(){
  $("#ingresar").click(function(){
    console.log("manda aca");
    $("#div1").load("login.php");
  });
});


$(document).ready(function(){
  $("#myv").click(function(){
    $("#div1").load("MisionyVision.php");
  });
});

</script>
</body>
</html>