<?php

//TODO: INGRESOS NO AUTORIZADOS !! listo
//TODO: GENERAR EL FORMULARIO PARA AGREGAR UN NUEVO COMENTARIO (el comentario lo genera el usuario)
//TODO: GENERAR EL FORMULARIO ACTUALIZAR

require_once 'conexion.php';
require_once 'data.php';

$con = new Conexion();
$data = new Data($con->getConexion());
$user = isset($_GET['user']) ? $_GET['user'] : NULL;
$vali = isset($_GET["sesion"]) ? $_GET["sesion"] : NULL;
if ($vali == NULL) {
    header("Location: index.php?error=faltaSesion");
}

?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>
    <!--target="_blank" para abrir pestaña
    ?id=".$fila["id"]."&user=".$user;-->
    <?php
    
    echo "<a href='nuevo.php?user=$user'>Ingresar Nuevo Comentario</a>";
    ?>
    <table border="1">
        <tr>
            <th>Nickname</th>
            <th>Fecha</th>
            <th>Texto</th>
            <th>Acción</th>
        </tr>
        <?php
        $lista = $data->getListaComentarios(); // FIXME: 

        foreach($lista as $fila){ 
            echo "<tr>";
            echo "<td>".$fila["nickname"]."</td>";
            echo "<td>".$fila["fecha"]."</td>";
            echo "<td>".$fila["txt"]."</td>";
            echo "<td> <a href='eliminar_DO.php?id=".$fila["id"]."&user=".$user."'> Eliminar </a>
                <a href='texto.php?id=".$fila["id"]."&user=".$user."'> Actualizar </a> 
            
            </td>";
            echo "</tr>";
            
        }   
        
        ?>
    
    </table>
    
</body>
</html>