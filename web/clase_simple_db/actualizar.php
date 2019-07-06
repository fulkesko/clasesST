<?php

require_once 'conexion.php';
require_once 'data.php';
if(isset($_GET["id"])){
    $id = $_GET["id"];
    $user = isset($_GET["user"]) ? $_GET["user"] : NULL;
    $texto = $_GET["texto"];
    $con = new Conexion();
    $data = new Data($con->getConexion());
    $data->actualizarById($id, $texto);
    echo $id . " <-id " . $user . "<-user";
    header("Location: sistema.php?sesion=correcto&user=$user");

}
?>