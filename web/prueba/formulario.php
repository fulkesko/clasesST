<?php
    require_once 'conexion.php';
    require_once 'data.php';
    $con = new Conexion();
    $data = new Data($con->getConexion());
?>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>formulario</title>
</head>
<body>
    <div>
   <?php 
   echo 'Patente: <input type="text" id="patente" maxlength="6"> <br>';
   echo 'Nombre Marca: <select id="marca">';
        $lista= $data->buscarMarca();
        foreach($lista as $fila){
            echo "<option value='".$fila["marca"]."'>".$fila["marca"]."</option>";
        }
   echo  '</select> <br>';


    echo 'Nombre Color: <select id="color">';
        $lista= $data->buscarColor();
        foreach($lista as $fila){
        echo "<option value='".$fila["color"]."'>".$fila["color"]."</option>";
        }
    echo  '</select> <br>';
        echo '
        Año: <input type="number" id="anio"><br>
            <button onclick="obtener()">guardar</button>
        ';//cierra echo
    ?>
    </div>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
    <script src="scropt.js"></script>
</body>
</html>

