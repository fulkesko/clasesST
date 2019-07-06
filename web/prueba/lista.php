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
    <title>listado</title>
</head>
<body>
<style>
table, th, td {
  border: 1px solid black;
}
</style>
<table >
<!--agregar contenido con php-->
    <tr>
        <td>Patente</td>
        <td>Nombre Marca</td>
        <td>Nombre Color</td>
        <td>Año</td>
    </tr>
    <?php
    $lista= $data->buscarTabla();
    foreach($lista as $fila){
        echo "<tr>";
        echo "<td>".$fila["Patente"]."</td>";
        echo "<td>".$fila["Marca"]."</td>";
        echo "<td>".$fila["Color"]."</td>";
        echo "<td>".$fila["Anio"]."</td>";
        echo "</tr>";
    }

    ?>
</table>
</body>
</html>