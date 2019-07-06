<?php

require_once 'conexion.php';
require_once 'data.php';
if(isset($_GET["user"])){
    $user = $_GET["user"];
    $texto = $_GET["texto"];
    $con = new Conexion();
    $data = new Data($con->getConexion());
    $data->ingresarComentario($texto, $user);
    echo $texto . " &&" . $user;
    header("Location: sistema.php?sesion=correcto&user=$user");

}
?>